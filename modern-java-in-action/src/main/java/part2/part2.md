### Part 2 함수형 데이터 처리
#### 스트림 슬라이싱
- java 9부터 takewhile, dropwhile 두 가지 새로운 메서드 지원
- takewhile()을 사용하면 조건이 만족하지 않을 경우 반복 작업을 중단
- dropwhile()은 반대의 작업

#### 매핑
- 여러개의 map을 연결할 수 있다
- 생성된 스트림을 하나의 스트림으로 평면화하는 flatMap

#### 매칭
- anyMatch 적어도 한 요소
- allMatch 모든 요소 <-> noneMatch
- 모두 쇼트 서킷 기법을 사용함. 상황에 따라 전체 스트림을 처리하지 않았더라도 결과를 반환할 수 있음

#### 검색
- findAny와 findFirst를 사용할 수 있다. 병렬 실행에서는 첫 번째 요소를 찾기가 어렵다. 따라서 요소의 반환 순서가 상관없다면 병렬 스트림에서는 제약이 적은 findAny를 사용한다.

#### 리듀싱
- reduce 연산을 이용해서 스트림 요소를 조합한 더 복잡한 질의를 표현할 수 있다
- 모든 스트림 요소를 처리해서 값으로 도출하는 질의를 리듀싱 연산이라 함
- reduce(초기값, BinaryOperator)
- 초기값을 받지 않도록 오버로드된 reduce도 있다. 이 reduce는 Optional 객체를 반환함