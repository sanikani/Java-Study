package part1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class AppleExample{

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("green", 80),
                                              new Apple("green", 155),
                                              new Apple("red", 120));
        //Comparator 구현
        inventory.sort(new AppleComparator());
        //익명 클래스 사용
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        //람다 표현식 사용
        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));

        inventory.sort(Comparator.comparing(apple -> apple.getWeight()));
        //메서드 참조 사용
        inventory.sort(Comparator.comparing(Apple::getWeight));
        //디폴트 메서드 활용(역순 정렬)
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
        //Comparator 연결
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));

        //Predicate 조합
        Predicate<Apple> redApple = apple -> apple.getColor().equals("red");
        Predicate<Apple> notRedApple = redApple.negate();
        Predicate<Apple> notRedAndHeavyApple = redApple.negate()
                .and(apple -> apple.getWeight() > 150
        );
        Predicate<Apple> redAndHeavyOrGreenApple = redApple
                .and(apple -> apple.getWeight() > 150)
                .or(apple -> apple.getColor().equals("green"));

        //Function 조합

    }

    public static class AppleComparator implements Comparator<Apple> {
        @Override
        public int compare(Apple a1, Apple a2) {
            return a1.getWeight().compareTo(a2.getWeight());
        }
    }

}
