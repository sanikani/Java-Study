package part2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);

        List<String> list = Arrays.asList("123", "123121", "121112");
        int count = list.stream()
                .map(s -> 1)
                .reduce(0, Integer::sum);

    }
}
