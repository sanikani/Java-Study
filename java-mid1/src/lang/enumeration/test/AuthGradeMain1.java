package lang.enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        for (AuthGrade authGrade : AuthGrade.values()) {
            System.out.println("grade="+authGrade.name()+", level="+authGrade.level()+", 설명="+authGrade.description());
        }
    }
}
