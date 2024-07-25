package part2;

import java.util.Arrays;
import java.util.List;

public class SearchAndMatching {

    public static void main(String[] args) {

        List<Dish> menu = Dish.getSamples();

        if (menu.stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("Vegetarian menu");
        }

        boolean isHealthy = menu.stream().allMatch(dish -> dish.getCalories() < 1000);

        boolean isHealthy2 = menu.stream().noneMatch(dish -> dish.getCalories() >= 1000);

        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(dish -> System.out.println(dish.getName()));
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,10,11,12,13);
        list.parallelStream()
                .map(n -> n * n)
                .filter(n -> {
                    System.out.println(n);
                    return n % 3 == 0;
                })
                .findAny()
                .ifPresent(System.out::println);

    }

}
