# study_springboot

### 목차
[1. 프로젝트 생성 방법](#Spring-boot-프로젝트-생성하는-법)

[2. 라이브러리 살펴보기](#라이브러리)

[3. View 환경설정](#View)

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

## 라이브러리
- spring-boot-starter-web
- spring boot 라이브러리
    - spring-boot-starter-tomcat: 톰캣 (웹서버)
    - spring-webmvc: 스프링 웹 MVC
    - spring-boot-starter-thymeleaf: 타임리프 템플릿 엔진(View)
    - spring-boot-starter(공통): 스프링 부트 + 스프링 코어 + 로깅
        - spring-boot
            - spring-core
        - spring-boot-starter-logging
            - logback, slf4j
- test 라이브러리
    - junit: 테스트 프레임워크
- mockito: 목 라이브러리
- assertj: 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
- spring-test: 스프링 통합 테스트 지원

## View
- `resources/static/index.html`에 넣는 파일이 Welcome Page가 됨
- Wep application에서 맨 처음의 진입점이 Controller
<img src='./img/03_01.PNG'/>
- /hello라고 던지면 내장 톰켓 웹 서버를 통해 'helloController'에 @GetMapping("hello")에 매핑이 되서 해당 method가 실행. 
- method 안의 model이 넘어와서 만들어지게 되고 return 된 이름의 templates으로 'viewResolver'라 화면을 찾아 랜더링.
    - viewResolver
        - 스프링 부트 템플릿엔진 기본 viewName 매핑
        - resources:templates/ +{ViewName}+ .html

### Template Engines
- freemarker
- groovy
- thymeleaf
- mustache

## Controller
- `@GetMapping()`: web application에서 해당 keyword로 들어오면 해당 method를 호출

## Model
```
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }
```
- hello.html의 thymeleaf를 선언한 {data} 부분에 'hello!!'로 치환