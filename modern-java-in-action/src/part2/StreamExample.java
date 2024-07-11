package part2;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(new Dish(1,"밥"),new Dish(200,"김치"));
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 200) {
                lowCaloricDishes.add(dish);
            }
        }
        lowCaloricDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });

        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish dish : lowCaloricDishes) {
            lowCaloricDishesName.add(dish.getName());
        }

        //Stream 활용 코드
        List<String> lowCaloricDishesName2 =
                menu.stream()
                        .filter(dish->dish.getCalories()<200)
                        .sorted(Comparator.comparing(Dish::getCalories))
                        .map(Dish::getName)
                        .toList();

    }

    static class Dish {

        int calories;

        String name;

        public Dish(int calories, String name) {
            this.calories = calories;
            this.name = name;
        }

        public int getCalories() {
            return calories;
        }

        public String getName() {
            return name;
        }
    }
}
