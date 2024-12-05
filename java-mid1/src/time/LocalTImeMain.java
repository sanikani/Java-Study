package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTImeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2021, 10, 11, 9, 10, 30);
        System.out.println("now = " + now);
        System.out.println("of = " + of);
        //날짜와 시간 분리
        LocalDate nowLocalDate = now.toLocalDate();
        LocalTime nowLocalTime = now.toLocalTime();
        System.out.println("nowLocalDate = " + nowLocalDate);
        System.out.println("nowLocalTime = " + nowLocalTime);
        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(nowLocalDate, nowLocalTime);
        System.out.println("localDateTime = " + localDateTime);
        //계산(불변)
        LocalDateTime ofPlusDays = of.plusDays(10);
        LocalDateTime ofPlusYears = of.plusYears(1);
        System.out.println("ofPlusDays = " + ofPlusDays);
        System.out.println("ofPlusYears = " + ofPlusYears);
        //비교
        System.out.println(now.isAfter(of));
        System.out.println(now.isBefore(of));
        System.out.println(now.isEqual(of));
    }
}
