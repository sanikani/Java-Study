package part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {
    
    public static void main(String[] args) {
        List<Integer> weights = Arrays.asList(7, 3, 4, 10);
        List<Apple> apples = map(weights, Apple::new);
        for (Apple apple : apples) {
            System.out.println(apple.getWeight());
        }

        BiFunction<String, Integer, Apple> c1 = (color, weight) -> new Apple(color, weight);

        BiFunction<String, Integer, Apple> c3 = Apple::new;

        Apple a3 = c3.apply("green", 110);

    }

    static List<Apple> map(List<Integer> weights, Function<Integer,Apple> f) {
        List<Apple> result = new ArrayList<>();
        for (Integer weight : weights) {
            result.add(f.apply(weight));
        }
        return result;
    }
}


