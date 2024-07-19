package part2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BuildingStreams {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Modern ", "Java ", "In ", "Action ");
        stringStream.map(String::toUpperCase).forEach(System.out::println);

        //무한 스트림
        Stream.iterate(0, n->n+2)
                .limit(10)
                .forEach(System.out::println);

        //피보나치 수열
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));

        //iterate의 predicate 지원
        IntStream.iterate(0,n->n+4)
                .takeWhile(n->n<100)
                .forEach(System.out::println);

        IntStream.iterate(0, n->n<100, n->n+4)
                .forEach(System.out::println);

    }
}
