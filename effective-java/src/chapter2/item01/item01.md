# 생성자 대신 정적 팩터리 메서드를 고려하라
### 장점
- 이름을 가질 수 있다
- 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다
- 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다
- 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다
- 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다

### Enum
- 열거타입은 타입 세이프티 보장
- EnumMap은 내부적으로 배열을 사용
  - Enum의 길이만큼 선언
  - 삽입 시 Enum의 ordinal()을 사용하여 배열에 삽입
  - HashMap은 key값을 hash로 만들고, 배열의 크기를 조절하는 등의 일이 추가로 필요.
  - EnumMap은 배열의 크기가 고정되고, index를 통해 접근하기 때문에 빠르다.
### Flyweight Pattern
- 메모리 사용량을 최소화하기 위한 패턴
- 자주 사용하는 속성을 분리하여 재사용
### 인터페이스에 정적 메소드
- 기본 메서드와 정적 메서드 정의 가능
- 자바 9 부터는 private static 메서드도 가질 수 있음
- Comparator.reversed() 같은 정적 팩터리 메서드를 제공
### 리플렉션
- 클래스로더를 통해 읽어온 클래스 정보(거울에 반사”된 정보)를 사용하는 기술