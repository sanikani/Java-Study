package part2.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.*;

public class main {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Millan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );

        //2011년에 일어난 모든 트랜잭션 값을 찾아 오름차순
        System.out.println("1번");
        transactions.stream()
                .filter(t -> t.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //거래자가 근무하는 모든 도시를 중복 없이 나열
        System.out.println("2번");
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        List<String> cities = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .toList();


        //케임브리지에서 근무하는 모든 거래자를 찾아 이름순 정렬
        System.out.println("3번");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(t->t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //모든 거래자의 이름을 알파벳순으로 정렬
        System.out.println("4번");
        transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //밀라노에 거래자가 있는가?
        System.out.println("5번");
        boolean millan = transactions.stream()
                .anyMatch(t->t.getTrader().getCity().equals("Millan"));
        if (millan) System.out.println("밀라노에 거래자 있음");
        else System.out.println("밀라노에 거래자 없음");

        //케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력
        System.out.println("6번");
        transactions.stream()
                .filter(t->t.getTrader().getCity().equals("Cambridge"))
                .forEach(t-> System.out.println(t.getValue()));

        //전체 트랜잭션 중 최댓값은?
        System.out.println("7번");
        Optional<Integer> max = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println("최댓값: "+max.get());

        //최솟값
        System.out.println("8번");
        Optional<Integer> min = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        Optional<Transaction> min1 = transactions.stream()
                .min(comparing(Transaction::getValue));
        System.out.println("최솟값: "+min.get());

        //flatMap
        List<String> s = Arrays.asList("asdfasdf","dsfsadf");
        s.stream()
                .map(k->k.split(""))
                .map(Arrays::stream)
                .forEach(k-> System.out.println());
        s.stream()
                .map(k->k.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
    }
}
