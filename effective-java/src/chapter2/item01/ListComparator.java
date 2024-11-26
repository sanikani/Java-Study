package chapter2.item01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListComparator{

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        System.out.println(numbers);
        Comparator<Integer> desc = (o1, o2) -> o2 - o1;
        numbers.sort(desc.reversed());
        System.out.println(numbers);
    }
}
