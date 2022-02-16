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

### 스프링 Jdbc Templeate
- JDBC만으로는 너무 어렵기 때문에 중복을 제거한 기능
- sql로 편리하게 날리는 것이 가능

### JPA
- sql을 직접 짜는 것이 아니라 JPA라는 기술로 등록, 수정, 삭제라는 기능을 날려줘서 사용할 수 있도록 함.
- 객체를 쿼리없이 바로 저장하는 것이 가능.

### 스프링 데이터 JPA