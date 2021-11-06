# study_springboot

## Spring boot 프로젝트 생성하는 법
1. 스프링 부트 스타터 사이트[https://start.spring.io]로 이동해서 스프링 프로젝트 생성
2.  다음과 같이 설정한 후 'Generate'버튼 클릭
    - Group: 회사이름
    - Articact: 프로젝트 이름
    - SNAPSHOT: 개발 중인 것을 의미

<img src='./img/01_.PNG'/>

3. IntelliJ 에서 'Open or Import'에서 압축을 푼 폴더 안으로 들어가 'bulid.gradle'을 선택하고 'Open'->''Open as Project'을 클릭
4. src-> main -> java -> HelloJavaSpringApplication.javafmf 'RUN을 누르면 [localhost:8080]을 들어가서 'Whitelabel Error Page'가 뜨면 성공!

## 파일 구조
- src
    - main:
        - java : 실제 소스 파일이 존재
        - resources : 시레 자바 코드를 제외한 설정 파일들이 존재
    - test: 테스트 코드와 관련된 소스 파일이 존재
- build.gradle
    - thymeleaf : html을 만드는 템플릿 엔진


