package ch16.practice.pro08;

public class Example {
    private static Student[] students = {
            new Student("sani", 90, 96),
            new Student("san", 95, 93)
    };

    public static double avg(Function<Student> function){
        int sum = 0;

        for (Student student : students){
            sum += function.apply(student);
        }

        return (double)sum / students.length;
    }

    public static void main(String[] args) {
        double englishAvg = avg(Student::getEnglishScore);
        System.out.println("avg: " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("avg: " + mathAvg);
    }

}
