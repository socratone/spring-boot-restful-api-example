# Spring Boot Restful API Example

스프링 부트를 이용한 기본적인 Restful API 예제를 구현합니다.

## 개발 서버 실행

```
./mvnw spring-boot:run
```

## Swagger 문서

http://localhost:8080/swagger-ui/index.html

## 폴더 구조 (TODO)

### 1. Controller (컨트롤러)

- API 요청을 처리하는 클래스입니다. 주로 @RestController, @Controller 어노테이션을 가집니다.
- 경로: /controller 또는 /web 하위 디렉토리에서 주로 찾을 수 있습니다.
- 예: UserController.java, ProductController.java

### 2. Service (서비스)

- 비즈니스 로직을 처리하는 클래스입니다. 보통 @Service 어노테이션을 사용합니다.
- 경로: /service 하위 디렉토리에 위치할 수 있습니다.
- 예: UserService.java, ProductService.java

### 3. Repository (레포지토리)

- 데이터베이스에 접근하는 클래스입니다. @Repository 또는 JpaRepository를 상속받는 클래스로 구성됩니다.
- 경로: /repository 또는 /dao 디렉토리에서 주로 찾을 수 있습니다.
- 예: UserRepository.java, ProductRepository.java

### 4. Model (모델 또는 엔티티)

- 데이터베이스의 테이블과 매핑되는 클래스입니다. 보통 @Entity 어노테이션을 사용합니다.
- 경로: /model, /entity 또는 /domain 디렉토리에서 찾을 수 있습니다.
- 예: User.java, Product.java

### 5. Configuration (설정 클래스)

- 스프링 관련 설정을 담고 있는 클래스들입니다. @Configuration, @Enable\* 등의 어노테이션을 가지고 있습니다.
- 경로: /config 디렉토리에서 찾을 수 있습니다.
- 예: SecurityConfig.java, DatabaseConfig.java
