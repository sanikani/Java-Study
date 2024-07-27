package part3.chapter9.strategy;

public class Validator {
    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String s) {
        return strategy.execute(s);
    }

    public static void main(String[] args) {
        Validator numericValidator = new Validator(new IsNumeric());
        boolean a1 = numericValidator.validate("aaaa");
        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        boolean b1 = lowerCaseValidator.validate("aaaa");
        //람다 표현식으로 리팩터링
        Validator validator = new Validator(s->s.matches("[a-z]+"));
        boolean a2 = validator.validate("aaaa");
        Validator validator1 = new Validator(s -> s.matches("\\d+"));
        boolean b2 = validator1.validate("aaaa");
    }
}
