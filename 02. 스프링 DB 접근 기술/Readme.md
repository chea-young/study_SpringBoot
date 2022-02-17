## 스프링 DB 접근 기술

### h2 설치
- `https://www.h2database.com`에서 모든 패키지 다운로드 설치
```
./h2.bat # 실행
JDBC URL: jdbc:h2:~/test # (최초 한번)

~/test.mv.db # (home(cd)에서 파일 생성 확인)
JDBC URL: jdbc:h2:tcp://localhost/~/test # 접속
```

### 순수 JDBC
- 애플리케이션 서버와 DB를 연결해주는 것
- build.gradle 파일에 jdbc, h2 데이터베이스 관련 라이브러리 추가
```
implementation 'org.springframework.boot:spring-boot-starter-jdbc'
runtimeOnly 'com.h2database:h2'
```

- 스프링 부트 데이터베이스 연결 설정 추가
```
spring.datasource.url=jdbc:h2:tcp://localhost/~/test
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
```

<img src='./img/01.PNG>

- OCP(개방 폐쇄 원칙) - 확장에는 열려있고, 변경에는 닫혀있음.
- 기존 코드를 전혀 손대지 않고, 설정만으로 구현 클래스를 변경 가능

### 스프링 데이터 통합 테스트
- `@SpringBootTest, @Transactional`를 클래스에 선언하고 `@Autowired`로 연결
- ` @Transactional`: 테스트를 하기 전에 트랜젝션을 하고 테스트를 끝나면 rollback을 함.
- 단일 테스트로 하는게 더 좋을 확률이 높음. 어쩔 수 없는 경우에만 통합테스트를 진행해야 함.
- 

### 스프링 Jdbc Templeate
- JDBC만으로는 너무 어렵기 때문에 JDBC API에서의 중복 코드를 제거하지만 sql은 작성해야 함.
- sql로 편리하게 날리는 것이 가능


### JPA
- sql을 직접 짜는 것이 아니라 JPA라는 기술로 등록, 수정, 삭제라는 기능을 날려줘서 사용할 수 있도록 함.
- 객체를 쿼리없이 바로 저장하는 것이 가능.

### 스프링 데이터 JPA
