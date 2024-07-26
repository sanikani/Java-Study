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

        //Map merge
        Map<String, String> map1 = Map.ofEntries(Map.entry("a", "aa"), Map.entry("b", "bb"));
        Map<String, String> map2 = Map.ofEntries(Map.entry("aa", "aaa"), Map.entry("b", "bb"));

        //변경 가능한 Map 선언
        HashMap<String, String> everyone = new HashMap<>(map1);
        map2.forEach((k, v) -> everyone.merge(k, v, (v1, v2) -> v1 + "&" + v2));

        //merge를 이용한 초기화 검사(기존 코드)
        HashMap<String, Integer> movieToCount = new HashMap<>();
        String movieName = "JamesBond";
        Integer count = movieToCount.get(movieName);
        if (count == null) {
            movieToCount.put(movieName, 1);
        } else {
            movieToCount.put(movieName, count + 1);
        }
        //개선한 코드
        movieToCount.merge(movieName, 1, (key, c) -> c + 1);
    }
}
