package part3.chapter9;

import part2.Dish;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaRefactor {
    public static void main(String[] args) {
        List<Dish> menu = Dish.getSamples();

        Integer total = menu.stream().map(Dish::getCalories)
                .reduce(0, Integer::sum);
        Integer collect = menu.stream().collect(Collectors.summingInt(Dish::getCalories));

        //반복자를 스트림으로 리팩터링
        ArrayList<String> dishNames = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() > 300) {
                dishNames.add(dish.getName());
            }
        }
        List<String> names = menu.stream().filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .toList();

    }
}
