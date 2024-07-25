# Chpater6. 스트림으로 데이터 수집
#### 리듀싱과 요약
- 스트림에 collect를 호출하면 스트림의 요소에 리듀싱 연산이 수행됨
- 스트림 요소를 하나의 값으로 리듀스하고 요약, 요소 그룹화, 요소 분할 작업 수행
- Collectors.summingInt는 객체를 int로 매핑하는 함수를 인수로 받음
- summarizingInt를 사용하면 IntSummaryStatics가 반환됨.
- joining을 사용하면 스트림의 각 객체에 toString을 호출하여 추출한 모든 문자열을 하나의 문자열로 연결하여 반환함
- Collectors.reducing(초기값, 변환 함수, BinaryOperator)
    - BinaryOperator는 BiFuntion<T,T,T>이므로 두 인수를 받아 같은 형식을 반환해야 한다
- collect 메서드는 도출하려는 결과를 누적하는 컨테이너를 바꾸도록 설계된 메섣
- reduce는 두 값을 하나로 도출하는 불변형 연산
#### 그룹화
- groupingBy를 사용해 요소를 그룹화할 수 있음
- Collectors.filtering,mapping,flatMapping을 groupingBy에 적용 가능
- 두 인수를 받는 팩토리 메서드 Collectors.groupingBy를 이용해서 항목을 다수준으로 그룹화 가능
- 바깥쪽 groupingBy 메서드에 스트림의 항목을 분류할 두 번째 기준을 정의하는 내부  groupingBy를 전달 가능
- Collectors.collectingAndThen으로 컬렉터가 반환한 결과를 다른 형식으로 사용할 수 있음
- 일반적으로 스트림에서 같은 그룹으로 분류된 모든 요소에 리듀싱 작업을 수행할 때는 팩토리 메서드 groupingBy에 두 번째 인수로 전달한 컬렉터를 사용함
#### 분할
- 분할은 분할 함수라 불리는 Predicate를 분류 함수로 사용하는 특수한 그룹화 기능
    - 분할 함수는 Boolean을 반환하므로 맵의 키 형식은 Boolean
    - 결과적으로 두 개의 그룹(true, false)으로 분류됨
- 분할을 사용하면 참, 거짓 두 가지 요소의 스트림 리스트를 모두 유지하는 것이 장점
#### Collector 인터페이스
- Collector 인터페이스는 다음과 같은 메서드를 가진다
    - public interface Collector<T, A, R>
    - T는 수집될 스트림
    - A는 누적자, 수집 과정에서 중간 결과를 누적하는 객체의 형식
    - R은 수집 연산 결과 객체의 형식
    - supplier, accumulator, finisher, characteristics
- supplier 메서드: 새로운 결과 컨테이너 만들기
    - Supplier< A > supplier()
    - 수집 과정에서 빈 누적자 인스턴스를 만드는 파라미터가 없는 함수
- accumulator 메서드: 결과 컨테이너에 요소 추가
    - BiConsumer<A, T> accumulaor()
- finisher 메서드: 최종 변환값을 결과 컨테이너로 적용
    - Function<A,R> finisher()
    - 변환 과정이 필요하지 않은 경우에는 항등 함수를 반환
    - return Function.identity()
- supplier로 accumulator 생성 -> accumulator가 스트림 요소 수집 -> 수집 완료시 finisher가 결과 값 반환
- combiner 메서드: 두 결과 컨테이너 병합
    - BinaryOperator< A> combiner()
    - 서로 다른 서브파트를 병렬로 처리할 때 누적자가 이 결과를 어떻게 처리할지 정의
- characteristics 메서드: 컬렉터의 연산을 정의하는 Characteristics 형식의 불변 집합 반환
    - UNORDERED, CONCURRENT, IDENTITY_FINISH
- collect 메서드는 발행, 누적, 합침)을 인수로 받을 수 있음
#### 정리
- collect는 스트림 요소를 요약 결과로 누적하는 다양한 컬렉터를 인수로 갖는 최종 연산
- 여러 컬렉터들이 미리 정의되어 있다
- groupingBy로 스트림의 요소를 그룹화, partitioningBy로 스트림의 요소를 분할
- Collector 인터페이스에 정의된 메서드를 구현해서 커스텀 컬렉터 개발 가능
