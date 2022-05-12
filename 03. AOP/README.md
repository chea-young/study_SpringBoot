## AOP(Aspect Oriented Programming)

### AOP가 필요한 문제
    - try안에 있는게 핵심 관심 사항이고 시간을 측정하는 것은 공통 관심 사항인데 이 두가지가 섞여서 유지보수가 어려움.
    - 로직을 변경할 때 모든 로직을 찾아가면서 변경해야 함.

### AOP 적용
- 공통 관심 사항과 핵심 관심 사항을 분리
- 적용
    - `@Aspect` 어노테이션 붙임
    - `proceed()`: 다음 단계로 진행
    - Spring bean에 등록
    - 함수에 `@Around`를 붙여서 적용
        - "execution(* hello.hellospring..*(..))" : 해당 패키지 하위에는 다 적용하라는 의미

## AOP 장점

<img src='./img/01.PNG>

- 공통 관심 사항을 분리하는 것이 가능
- 핵심 관심 사항을 깔끔하게 유지 가능
- 원하는 적용 대상을 선택 가능