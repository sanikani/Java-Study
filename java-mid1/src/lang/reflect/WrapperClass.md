# 래퍼, Class 클래스
#### 래퍼 클래스
- 특정 기본형을 감싼 클래스
- 불변
- equals로 비교해야 함
- Auto-boxing과 Auto-Unboxing을 지원함
- Integer.valueOf()는 래퍼 객체 반환. parseInt()는 기본형 반환
- 기본형은 메모리에서 단순히 그 크기만큼의 공간을 차지
- 래퍼 클래스는 추가적인 객체 메타데이터를 포함하므로 더 많은 메모리 사용 대략 8~16바이트
  **유지보수 vs 최적화**
  보통 유지보수하기 좋은 코드를 먼저 고민해야함.
  권장하는 방법은 개발 후에 성능 테스트를 해보고 문제가 되는 부분을 찾아서 최적화

#### Class 클래스
- 클래스의 메타데이터를 다루는데 사용
    - 클래스의 속성과 메서드에 대한 정보를 조회하고 조작
- **주요 기능**
    - 타입 정보 얻기
    - 리플렉션
    - 동적 로딩과 생성
    - 애노테이션 처리
      Class 클래스 조회 방법
```java
Class clazz = String.class;
Class clazz = new String().getClass(); //인스턴스에서 조회
Class clazz = Class.forName("java.lang.String); //문자열로 조회
```
**리플렉션 - reflection**
- 클래스의 메타 정보를 기반으로 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이들을 통해 객체 인스턴스를 생성하거나 메서드를 호출하는 작업. 추가로 애노테이션 정보를 읽어서 특별한 기능을 수행할 수도 있음
