## Chapter 11
- 모든 null 참조를 Optional로 대치하는 것은 바람직하지 않다
- Optional이 등장하면 값이 없을 수 있는 상황에 적절하게 대응하도록 강제하는 효과가 있다
#### Optional 적용 패턴
- Optional.empty()로 빈 Optional 객체를 얻음
- Optional.of()로 null이 아닌 값을 포함하는 Optional
- Optional.ofNullable()로 null값을 저장할 수 있는 Optional
- Optional은 map 메서드를 지원함
    - 스트림의 map 메서드와 개념적으로 비슷함
- 중첩된 map을 사용하면 중첩 Optional 객체로 반환된다. 이를 해결하기 위해 flatMap을 사용한다
- Optional은 기본값을 제공하거나 Optional을 언랩하는 다양한 메서드를 제공
- Optional의 stream 메서드는 존재하는 값만 포함하는 스트림을 반환함
- get()은 가장 간단한 메서드이면서 가장 안전하지 않음. Optional에 반드시 값이 있다고 가정할 수 있는 상황이 아니면 사용하지 않는 것이 바람직함
- orElse, orElseGet, orElseThrow 등을 사용하여 optional이 비어있을 경우를 처리할 수 있다
- ifPresent를 사용하면 값이 존재할 때 인수로 넘겨준 동작을 처리할 수 있다
- ifPresentOrElse는 Optional이 비어있을 때 실행할 수 있는 Runnable을 인수로 받는다
- filter 메서드는 프레디케이트를 인수로 받는다. Optional 객체가 값을 가지며 프레디케이트와 일치하면 filter 메서드는 그 값을 반환하고 그렇지 않으면 빈 Optional 객체를 반환
#### Optional을 사용한 실용 예제
- Optional.ofNullable을 사용하여 잠재적으로 null이 될 수 있는 값을 감싸기
- 예외를 발생시키는 API를 사용할 때 빈 Optional을 반환하도록 구현 가능
- 기본형 Optional(OptionalLong, OptionalInt 등)을 사용하지 않는 것이 좋다