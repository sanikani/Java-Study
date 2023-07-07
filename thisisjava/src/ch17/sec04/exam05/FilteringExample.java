package ch17.sec04.exam05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("신용권");
        list.add("신민철");

        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        //신으로 시작하는 요소만 필터링
        list.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .distinct()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
    }
}
