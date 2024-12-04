package lang.enumeration.test;

import java.io.IOException;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        AuthGrade authGrade = AuthGrade.valueOf(scanner.next());
        System.out.println("당신의 등급은 " + authGrade.description() + "입니다.");
        System.out.println("==메뉴 목록==");
        for (String menu : authGrade.menu()) {
            System.out.println("- " + menu);
        }
    }
}
