package part2;

import java.util.Arrays;
import java.util.List;

public class Dish {
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

    @Override
    public String toString(){
        return name;
    }

    public static List<Dish> getSamples(){
        return Arrays.asList(new Dish(1, "밥", true)
                , new Dish(200, "김치", true)
                , new Dish(400, "돼지고기", false));
    }
}
