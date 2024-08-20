## Chpater 12
#### LocalDate, LocalTime, Instant, Duration, Period
기존의 Date나 Calendar는 가변적이고 많은 문제가 있었다. 이를 해결하기 위해 새로운 날짜와 시간 API를 제공한다
- 정적 팩토리 메서드 of로 LocalDate 인스턴스 생성
    - LocalDate.of(2024, 8, 20)
- LocalDateTime으로 날짜와 시간 조합
- Instant 클래스는 Unix epoch time을 기준으로 특정 지점까지의 시간읠 초로 표현
- Instant는 초와 나노초 정보를 포함한다.
- Instant는 Duration과 Period 클래스를 함께 활용 가능
- Duration.between으로 두 시간 객체 사이의 지속시간을 만들 수 있음
- 년, 월, 일로 시간을 표현할 때는 Period 사용
- 지금까지 살펴본 모든 클래스는 불변