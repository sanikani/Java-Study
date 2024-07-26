## Chapter 8
자바 9에서 작은 리스트, 집합, 맵을 쉽게 만들 수 있도록 팩토리 메서드를 제공한다
- List.of, Set.of, Map.ofEntries
- List와 Set에는 removeIf, replaceAll, sort 메서드를 제공
- Map은 BiConsumer(키와 값을 인수로 받음)를 인수로 받는 forEach 제공
- Map.Entry.comparingByKey,Value 제공. sorted의 인수로 넣음
- computeIfAbsent, computeIfPresent, comput
- remove(key,value)
- replaceAll은 BiFunction을 적용하여 각 항목의 값을 교체
- Replace는 키가 존재하면 맵의 값을 바꿈
- 두 개의 맵에서 값을 합치거나 바꿔야 한다면 merge를 사용
- 두 맵에서 중복된 키가 없다면 putAll을 사용하면 된다. 만약 중복된 키가 있다면 merge 메서드를 사용한다. BiFunction을 인수로 받아 중복된 키를 어떻게 합칠지 결정한다
#### ConcurrentHashMap
- 동시성 친화적
- 내부 자료구조의 특정 부분만 잠궈 동시 추가, 갱신 작업을 허용한다. 따라서 동기화된 Hashtable 버전에 비해 읽기 쓰기 연산 성능이 월등하다
- ConcurrentHashMap은 forEach, reduce, search를 제공
- 키, 값으로 연산(forEach, reduce, search)
- 키로 연산(forEachKey, reduceKeys, searchKeys)
- 값으로 연산(forEachValue, reduceValues, searchValues)
- Map.Entry 객체로 연산(forEachEntry, reduceEntries, searchEntries)
- reduce는 threshold를 지정해야 한다
- ConcurrentHashMap은 맵의 매핑 개수를 반환하는 mappingCount 메서드를 제공함. 기존의 int를 반환하는 size 대신 long을 반환하는 mappingCount 메서드를 사용하는 것이 좋다.
#### 정리
- 자바 9는 바꿀 수 없는 리스트, 집합, 맵을 쉽게 만들 수 있도록 List.of, Set.of, Map.ofEntries 등의 컬렉션 팩토리를 지원한다
- List 인터페이스는 removeIf, replaceAll, sort 디폴트 메서드를 지원한다
- Set 인터페이스는 removeIf 디폴트 메서드를 지원한다