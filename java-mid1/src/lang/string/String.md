# String
- 내부적으로 private final byte[ ] value; 를 가짐
- 리터럴 형식 선언 시 String Pool에서 해당 문자를 찾아 같은 값을 참조함
- String Pool에서 문자를 찾는 방식은 해시 알고리즘을 사용하므로 매우 빠르다
- String이 불변으로 설계된 이유는 같은 참조를 사용하는 경우 한곳에서 값이 변경되면 같은 문자열을 참조하는 다른 변수의 값도 함께 변경되기 때문임
- isBlanck() : 문자열이 비어 있는지 확인(길이가 0 또는 공백만 있는 경우)
- StringBuilder는 byte 배열이 final이 아님
#### String 최적화
- 문자열 리터럴을 더하는 부분은 컴파일 시점에 자동으로 합쳐준다
```java
//컴파일 전
String helloWorld = "Hello, " + "World!";
//컴파일 후
String helloWorld = "Hello, World!";
```
- String 변수의 경우는 단순하게 합칠 수 없다
    - 다른 방식으로 최적화를 수행한다.
    - Java 9 부터는 StringConcatFactory를 사용해서 최적화를 수행
- 문자열을 루프안에서 더하는 경우에는 최적화가 일어나지 않음
- 이러한 경우에는 직접 StringBuilder 사용
  **정리**
- 문자열을 합칠 때 대부분의 경우 최적화가 되므로 + 연산을 사용하면 된다
  **StringBuilder를 직접 사용하는 것이 더 좋은 경우**
- 반복문에서 반복해서 문자를 연결할 때
- 조건문을 통해 동적으로 문자열을 조합할 때
- 복잡한 문자열의 특정 부분을 변경해야 할 때
- 매우 긴 대용량 문자열을 나눌 때
  **StringBuilder vs StringBuffer**
- StringBuffer는 내부에 동기화. 멀티 스레드 환경에서 안전. 동기화 오버헤드로 인해 성능이 느리다

**추가 학습**
- 가변인자(varargs) 사용 예시
```java
public void test(String... parameter){
//내부 코드
}

public static void main(String[] args){
	test();
	test("A");
	test("A","B");
	test(new String[]{"A","B","C"});
}
```
