package lang.immutable.address;

public class MutableMain {

    public static void main(String[] args) {
        MutableObj obj = new MutableObj(20);
        MutableObj obj1 = obj;
        System.out.println("obj.getValue() = " + obj.getValue());
        System.out.println("obj1 = " + obj1.getValue());

        obj.add(20);
        System.out.println("obj.getValue() = " + obj.getValue());
        System.out.println("obj1 = " + obj1.getValue());
    }
}
