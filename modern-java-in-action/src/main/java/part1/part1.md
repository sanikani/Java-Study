#### Chapter2. 동작 파라미터화 코드 전달하기
- 동작 파라미터화란 어떻게 실행할 지 결정하지 않은 코드 블록
    - 나중에 프로그램에서 호출
- 거의 비슷한 코드가 반복 존재한다면 그 코드를 추상화한다
#### Chapter3. 람다 표현식
- 람다는 표현식 스타일(expression style)과 블록 스타일(block-style)
    - (parameters) -> expression
    - (parameters) -> { statements; }
    - (Integer i) -> return "Alan" + i;
        - 잘못된점: return "Alan" + i; 는 표현식이 아닌 구문이므로 2번째 방식을 사용해야함
    - (String s) -> {"Iron Man";}
        - 잘못된점: "Iron Man"은 표현식이므로 첫번째 방식을 사용해야함
        - 또는 {return "Iron Man";}
- 함수형 인터페이스에서 람다 표현식을 사용할 수 있음
    - 함수형 인터페이스란 정확히 하나의 추상 메서드를 지정하는 인터페이스이다
- 함수형 인터페이스의 추상 메서드 시그니쳐를 함수 디스크럽터라고 한다.
- 람다 표현식이 예외를 던질 수 있다면 추상 메서드도 같은 예외를 던질 수 있도록 선언해야 함
- 람다 바디에 표현식이 있다면 void를 반환하는 함수 디스크럽터와 호환된다.
```
//boolean을 반환하지만 표현식이므로 호환됨
Predicate<String> p = s -> list.add(s);
```
- 람다 표현식에서는 외부에서 정의된 변수를 활용할 수 있음. 이를 람다 캡쳐링
    - 해당 변수는 final로 선언된 변수나 final로 선언된 변수와 똑같이 사용되어야 한다.
    - 인스턴스 변수는 힙에 저장, 지역 변수는 스택에 저장
        - 람다는 지역 변수에 바로 접근할 수 있음
        - 람다 내부에서도 해당 변수의 값을 변화시킬 수 없음
        - 변수가 선언된 쓰레드와 람다가 실행되는 쓰레드가 다를 수 있으므로 람다는 변수의 복사본을 사용한다
        - 따라서 복사본이 바뀌지 않아야 하므로 final로 사용하는것
- 메서드 참조는 정적 메서드 참조, 인스턴스 메서드 참조, 기존 객체의 인스턴스 메서드 참조가 가능하다
- 인터페이스의 디폴트 메서드 덕분에 여러 기능을 추가로 사용할 수 있다
#### 정리
- 람다 표현식은 익명 함수의 일종
- 함수형 인터페이스는 하나의 추상 메서드만을 정의하는 인터페이스
- 함수형 인터페이스를 기대하는 곳에서만 람다 표현식을 사용 가능
- 람다 표현식을 이용해서 함수형 인터페이스의 추상 메서드를 즉석으로 제공할 수 있으며 람다 표현식 전체가 함수형 인터페이스의 인스턴스로 취급됨
- 람다 표현식의 기대 형식(type expected)을 대상 형식(target type)이라고 한다
- 메서드 참조를 이용하면 기존의 메서드 구현을 재사용하고 직접 전달할 수 있다
- 함수형 인터페이스는 람다 표현식을 조합할 수 있는 다양한 디폴트 메서드를 제공할 수 있다