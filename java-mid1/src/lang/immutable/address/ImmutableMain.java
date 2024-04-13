package lang.immutable.address;

public class ImmutableMain {

    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(20);

        System.out.println("obj " + obj.getValue());

        ImmutableObj obj1 = obj.add(20);
        System.out.println("obj " + obj.getValue());
        System.out.println("obj1 " + obj1.getValue());
        obj = obj.add(20);
        System.out.println("obj " + obj.getValue());
        System.out.println("obj1 " + obj1.getValue());

    }
}
