package part2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getSamples();

        Optional<Dish> mostCalorieDish = menu.stream()
                .collect(maxBy(Comparator.comparingInt(Dish::getCalories)));

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
    }
}
