package part3.chapter8;

import java.util.*;

public class CollectionFactoryExample {

    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("sdf");
        friends.add("sdfsdf");
        friends.add("sdfxc");

        //요소를 추가하면 예외 발생
        List<String> friends2 = Arrays.asList("sdf", "sdfsdf", "sdasa");
        friends2.set(0,"sdfs");
//        friends2.add("xxx");
        List<String> sd = List.of("sd", "sdfs", "sdfas");
        System.out.println(sd);

        Set<String> s = Set.of("s", "a", "b");
        System.out.println(s);

        //중복된 요소로 집합을 생성하므로 예외 발생
//        Set.of("s", "s");

        Map<String, Integer> a = Map.of("a", 10, "b", 20, "c", 30);
        System.out.println(a);

        Map<String, Integer> stringIntegerMap = Map.ofEntries(
                Map.entry("c", 10),
                Map.entry("b", 20));
        System.out.println(stringIntegerMap);

        stringIntegerMap.forEach((name, age) -> System.out.println(name + ": " + age));
        //Map 정렬
        stringIntegerMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(System.out::println);

        stringIntegerMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(System.out::println);
    }
}
