package part2;

import java.util.Arrays;
import java.util.List;

public class Dish {
    int calories;

    String name;

    boolean vegetarian;

    Type type;

    public Dish(int calories, String name,boolean vegetarian,Type type) {
        this.calories = calories;
        this.name = name;
        this.vegetarian = vegetarian;
        this.type = type;
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

    Type getType() {
        return type;
    }

    @Override
    public String toString(){
        return name;
    }

    public static List<Dish> getSamples(){
        return Arrays.asList(new Dish(1, "밥", true, Type.OTHER)
                , new Dish(200, "김치", true, Type.OTHER)
                , new Dish(400, "돼지고기", false, Type.MEAT),
                new Dish(600, "고등어", false, Type.FISH));
    }

    public enum Type {
        MEAT, FISH, OTHER
    }
}
