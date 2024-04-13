package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address a = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", a);
        MemberV1 memberB = new MemberV1("회원B", a);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.getAddress().setValue("부산");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
