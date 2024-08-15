package part4.optional;

import java.util.Optional;


public class Person {
    private Car car;

    private int age;

    public Optional<Car> getCar() {
        return Optional.ofNullable(car);
    }

    public int getAge() {
        return age;
    }

    public Optional<Car> getCarAsOptional() {
        return Optional.ofNullable(car);
    }

    public String getCarInsuranceName(Optional<Person> person, int minAge){
        return person.filter(p->p.getAge()>=minAge)
                .flatMap(Person::getCar)
                .flatMap(Car::getInsuranceAsOptional)
                .map(Insurance::getName)
                .orElse("Unknown");
    }
}
