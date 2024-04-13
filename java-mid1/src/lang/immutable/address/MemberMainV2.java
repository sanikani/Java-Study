package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", a);
        MemberV2 memberB = new MemberV2("회원B", a);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
