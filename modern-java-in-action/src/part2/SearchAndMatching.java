package part2;

import java.util.Arrays;
import java.util.List;

public class SearchAndMatching {

    public static void main(String[] args) {
        List<Dish> menu =
                Arrays.asList(new Dish(1, "밥", true)
                        , new Dish(200, "김치", true)
                        , new Dish(400, "돼지고기", false));
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

    static class Dish {

        int calories;

        String name;

        boolean vegetarian;

        public Dish(int calories, String name,boolean vegetarian) {
            this.calories = calories;
            this.name = name;
            this.vegetarian = vegetarian;
        }

        public int getCalories() {
            return calories;
        }

        public String getName() {
            return name;
        }

        boolean isVegetarian() {
            return vegetarian;
        }
    }
}
