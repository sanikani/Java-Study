package part4.optional;

import java.util.Optional;
import java.util.Properties;

public class OptionalExample {
    public static void main(String[] args) {
        Car car = new Car();
        Optional<Insurance> optional = car.getInsuranceAsOptional();
        optional.orElseThrow(IllegalArgumentException::new);
        optional.orElseGet(Insurance::new);
        optional.ifPresent(System.out::println);
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Not present"));
    }

    public int readDuration(Properties props, String name) {
        return Optional.ofNullable(props.getProperty(name))
                .flatMap(OptionalExample::StringToInt)
                .filter(i -> i > 0)
                .orElse(0);
    }

    public static Optional<Integer> StringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
