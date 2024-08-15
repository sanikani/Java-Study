package part4.optional;

import java.util.Optional;

public class Car {
    private Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }

    public Optional<Insurance> getInsuranceAsOptional() {
        return Optional.ofNullable(insurance);
    }

    public String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCarAsOptional)
                .flatMap(Car::getInsuranceAsOptional)
                .map(Insurance::getName)
                .orElse("Unknown");
    }
}
