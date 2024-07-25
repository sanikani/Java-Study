package part2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStream {
    public static void main(String[] args) {
        List<Dish> menu =
                Arrays.asList(new Dish(1, "밥", true)
                        , new Dish(200, "김치", true)
                        , new Dish(400, "돼지고기", false));

        //숫자 스트림으로 매핑
        int sum = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();

        //객체 스트림으로 복원
        IntStream intStream = menu.stream().mapToInt(Dish::getCalories);
        Stream<Integer> stream = intStream.boxed();

        //OptionalInt
        OptionalInt max = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();
        int maxCal = max.orElse(1);

        //숫자 범위
        int[] array = IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 0)
                .toArray();

        //피타고라스수
        Stream<Stream<int[]>> streamStream = IntStream.rangeClosed(1, 100).boxed()
                .map(a ->
                        IntStream.rangeClosed(a, 100)
                                .filter(b -> Math.sqrt((a * a + b * b)) % 1 == 0)
                                .mapToObj(b ->
                                        new int[]{a, b, (int) Math.sqrt(a * a + b * b)}));

        Stream<int[]> flatMapStream = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a ->
                        IntStream.rangeClosed(a, 100)
                                .filter(b -> Math.sqrt((a * a + b * b)) % 1 == 0)
                                .mapToObj(b ->
                                        new int[]{a, b, (int) Math.sqrt(a * a + b * b)}));

        Stream<double[]> flatMapStream2 = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a ->
                        IntStream.rangeClosed(a, 100)
                                .mapToObj(b -> new double[]{a, b, Math.sqrt(a * a + b * b)})
                                .filter(t -> t[2] % 1 == 0));
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
