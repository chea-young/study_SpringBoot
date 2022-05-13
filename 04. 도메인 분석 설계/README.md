## 도메인 분석 설계

### 요구사항 분석
- 기능 목록을 작성
- '기타 요구사항'을 작성

### 도메인 모델과 테이블 설계 시 주의 사항
- 다대다 관계는 JPA 운영시에 쓰면 안됨. -> 일대다, 다대일로 풀어야함.
- 양방향 관계보다는 단방향 관계로 쓰는 것이 좋음
- 왜래키가 있는 곳을 연관관계의 주인으로 정해야 함.
- 테이블 설계 시 '다'의 FK가 들어감.
- 일대일인 경우에는 접근이 많은 테이블에 FK를 넣음.

### 엔티티 클래스 개발
- 주의사항
    - Getter는 열고 Setter는 필요한 경우에만 작성하는 것이 좋음.
- `@Embedded` : 내장 타입을 사용할 때 해당 class 혹은 column에 붙여서 사용
- `@OneToMany(mappedBy = "member")`: 자신이 연관관계의 주인이 아니라는 의미
- `@Inheritance(strategy = )`
    - `InheritanceType.SINGLE_TABLE`: 테이블에 다 저장
    - `TABLE_PER_CLASS`
    - `JOINED`
- `@DiscriminatorColumn(name = "dtype")`: 구분 되는 것에 따라 적용 됨
    - `@DiscriminatorValue("")`: 상속 받는 CLASS에 해당 어노테이션을 붙여 구분이 되게 함.
- `@Enumerated()`: ENUM 타입은 꼭 해당 어노테이션을 붙여야 함,
    - `EnumType.STRING`: 문자열로 들어감.
    - `EnumType.ORDINAL`: 숫자로 들어감.