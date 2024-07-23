package part2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getSamples();

        Optional<Dish> mostCalorieDish = menu.stream()
                .collect(maxBy(comparingInt(Dish::getCalories)));

        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));

        String shortMenu = menu.stream().map(Dish::getName).collect(joining());
        String shortMenu2 = menu.stream().map(Dish::getName).collect(joining(", "));
        System.out.println("shortMenu = " + shortMenu);
        System.out.println("shortMenu2 = " + shortMenu2);

        Integer total = menu.stream()
                .collect(reducing(0, Dish::getCalories, Integer::sum));

        Map<String, List<Dish>> collect = menu.stream().filter(dish -> dish.getCalories() > 500)
                .collect(groupingBy(Dish::getName));

        Map<String, List<Dish>> collect1 = menu.stream()
                .collect(groupingBy(Dish::getName,
                        filtering(dish -> dish.getCalories() > 500,
                                toList())));

        Map<String, List<Integer>> collect2 = menu.stream()
                .collect(groupingBy(Dish::getName,
                        mapping(Dish::getCalories, toList())));

        Map<String, Map<String, List<Dish>>> collect3 = menu.stream()
                .collect(groupingBy(Dish::getName,
                        groupingBy(dish -> {
                            if (dish.isVegetarian()) {
                                return "Vegetarian";
                            } else {
                                return "No Vegetarian";
                            }
                        })));

        Map<String, Dish> mostCaloricByName = menu.stream()
                .collect(groupingBy(Dish::getName,
                        collectingAndThen(
                                maxBy(comparingInt(Dish::getCalories)),
                                Optional::get
                        )));

        Map<Dish.Type, Integer> totalCaloriesByType =
                menu.stream().collect(groupingBy(Dish::getType,
                summingInt(Dish::getCalories)));

        Map<Dish.Type, Set<CaloricLevel>> caloricLevelByType = menu.stream().collect(groupingBy(Dish::getType,
                mapping(dish -> {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        },
                        toCollection(HashSet::new))));

        //분할 함수를 사용한 그룹화
        Map<Boolean, List<Dish>> partitionedMenu = menu.stream().collect(partitioningBy(Dish::isVegetarian));
        List<Dish> vegetarianDishes = menu.stream().filter(Dish::isVegetarian).toList();

        //Collector를 두 번째 인수로 전달
        Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType = menu.stream()
                .collect(
                        partitioningBy(Dish::isVegetarian,
                                groupingBy(Dish::getType))
                );

        Map<Boolean, Dish> mostCaloricPartitionedByVegetarian =
                menu.stream().collect(
                        partitioningBy(Dish::isVegetarian,
                                collectingAndThen(maxBy(comparingInt(Dish::getCalories)),
                                        Optional::get)));

        List<Dish> dishes = menu.stream()
                .collect(new ToListCollector<>());

        List<Dish> dishes2 = menu.stream()
                .collect(toList());

        List<Dish> dishes3 = menu.stream()
                .collect(ArrayList::new,
                        List::add,
                        List::addAll);
    }

    public boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.range(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }

    public static boolean isPrime(List<Integer> primes, int candidate) {
        int candidateRoot = (int) Math.sqrt(candidate);
        return primes.stream()
                .takeWhile(i -> i < candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }

    public Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.range(2, n).boxed()
                .collect(
                        partitioningBy(this::isPrime)
                );
    }

    public Map<Boolean, List<Integer>> partitionPrimes2(int n) {
        return IntStream.range(2, n).boxed()
                .collect(new PrimeNumbersCollector());
    }


}
