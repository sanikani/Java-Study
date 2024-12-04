package lang.enumeration.test;

import java.util.List;

public enum AuthGrade {
    GUEST(1, "손님", List.of("메인 화면")),
    LOGIN(2, "로그인 회원", List.of("메인 화면", "이메일 관리 화면")),
    ADMIN(3, "관리자", List.of("메인 화면", "이메일 관리 화면", "관리자 화면"));

    private final int level;
    private final String description;
    private final List<String> menu;

    AuthGrade(int level, String description, List<String> menu) {
        this.level = level;
        this.description = description;
        this.menu = menu;
    }

    public int level() {
        return level;
    }

    public String description() {
        return description;
    }

    public List<String> menu() {
        return menu;
    }
}
