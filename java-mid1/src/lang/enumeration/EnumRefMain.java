package lang.enumeration;

public class EnumRefMain {
    public static void main(String[] args) {
        int price = 10000;
        for (Grade grade : Grade.values()) {
            System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
        }
    }
}
