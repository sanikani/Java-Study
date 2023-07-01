package ch16.sec05.exam01;

public class MethodReferenceExmaple {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(Computer :: staticMethod);

        person.action(new Computer() :: instanceMethod);
    }
}
