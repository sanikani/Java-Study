package part4.datetime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Example {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, 3, 18);
        date.get(ChronoField.YEAR);
        date.getYear();

        LocalTime time = LocalTime.of(13, 45, 20);
        time.getHour();

        //파싱할 수 없을 경우 예외 발생
        LocalDate.parse("2014-03-18");
        LocalTime.parse("13:45:20");

        //직접 만들거나 날짜와 시간 조합 가능
        LocalDateTime.of(2014, 3, 18, 13, 45, 20);
        LocalDateTime.of(date, time);
        LocalDateTime dt = date.atTime(time);
        LocalDateTime dt2 = time.atDate(date);

        //LocalDate와 LocalTime으로 분리 가능
        LocalDate date2 = dt.toLocalDate();
        LocalTime time2 = dt.toLocalTime();

        Instant i1 = Instant.ofEpochSecond(3);
        Instant i2 = Instant.ofEpochSecond(3, 0);
        Instant i3 = Instant.ofEpochSecond(2, 1_000_000_000);
        Instant i4 = Instant.now();

        Duration.between(i1, i2);
        Duration.between(LocalTime.of(13, 45), LocalTime.of(13, 46));
        Period days = Period.between(LocalDate.of(2014, 3, 8), LocalDate.of(2014, 3, 18));

        //두 시간 객체를 사용하지 않고 Duration과 Period 생성
        Duration threeMinutes = Duration.ofMinutes(3);
        Duration threeMinutes2 = Duration.of(3, ChronoUnit.MINUTES);
        Period tenDays = Period.ofDays(10);
        Period threeWeeks = Period.ofWeeks(3);
        Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);


    }
}
