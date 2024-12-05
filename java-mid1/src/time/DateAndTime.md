# 날짜와 시간
**날짜와 시간 라이브러리가 필요한 이유**
1. 날짜와 시간 차이 계산
2. 윤년 계산
3. 일광 절약 시간(DST) 변환
4. 타임존 계산
- 위와 같은 복잡성 때문에 잘 설계된 라이브러리 활용
  **Date**
- 타임존 처리 부족
- 불편한 날짜 시간 연산
- 불변 객체 부재
  **Calendar**
- 사용성 저하
- 성능 문제
- 불변 객체 부재
  -> Joda-Time이라는 외부 라이브러리의 많은 기능을 표준 자바 플랫폼으로 가져온 java.time 패키지 적용으로 문제 해결
  **LocalDate, LocalTime, LocalDateTime
- 년 월 일, 시 분 초, 둘다
- 특정 지역의 날짜와 시간만 고려
  **ZonedDateTime, OffsetDateTime**
- ZonedDateTime: 시간대를 고려한 날짜와 시간. 타임존 포함
    - 예) 2013-11-21T08:20:30.213+9:00 [Asia/Seoul]
- OffsetDateTime: 타임존은 없고, UTC로 부터의 시간대 차이인 고정된 오프셋만 포함
    - 예) 2013-11-21T08:20:30.213+9:0
      **Period, Duration**
- 시간의 간격(기간)을 표현
- Period는 두 날짜 사이의 간격을 년, 월, 일 단위
- Duration은 시, 분, 초 단위
  **LocalDateTime**
- toXxx() 메서드로 날짜와 시간 분리
- plusXxx() 메서드로 특정 날짜, 시간을 더함
- 두 시간 비교
- isEquals() vs equals()
    - isEquals()는 단순히 비교 대상이 시간적으로 같으면 true. 객체가 다르고 타임존이 달라도 시간적으로 같으면 true
    - equals()는 내부 데이터의 모든 구성 요소가 같아야 true
      **Instant**
-
- 1970년 1월 1일 0시 0분 0초(UTC)를 기준으로 경과한 시간으로 계산됨(나노초 정밀도로 표현)
- 
