package part4.optional;

import java.util.Optional;

public class Insurance {
    private String name;

    public String getName() {
        return name;
    }

    public Insurance findCheapestInsurance(Person person, Car car) {
        // Dummy implementation
        return new Insurance();
    }

    public Optional<Insurance> nullSafeFindCheapestInsurance(
            Optional<Person> person, Optional<Car> car) {
        return person.flatMap(p->car.map(c->findCheapestInsurance(p, c)));
    }

    public void checkInsuranceByCompanyName(String name, Optional<Insurance> insurance) {
        insurance.filter(i -> name.equals(i.getName()))
                .ifPresent(i -> System.out.println("ok"));
    }

}
