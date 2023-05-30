package ch15.sec05.exam03;

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age){
        this.age =age;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if(age<o.age) return -1;
        else if(age == o.age) return 0;
        else return 1;
    }
}
