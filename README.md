# Service Layer Dependency Mocking in Unit Tests

Spring Boot 3.5.6 project using Java 21, JUnit 5, Mockito, and MockMvc.

## Requirements
- JDK 21
- Maven 3.6+ (or use the Maven wrapper if you add one)

## Run the controller unit test
Open a terminal in this project folder and run:

```bash
mvn test
```

The test uses `@WebMvcTest(UserController.class)` to load only the MVC/controller slice.
`@MockitoBean` supplies a mocked `UserService`, so no database is needed.

## Optional: run the application
```bash
mvn spring-boot:run
```
Then open `http://localhost:8080/users`.

Expected response:
```json
[
  {"id":1,"name":"Akshaya","email":"akshaya@gmail.com"},
  {"id":2,"name":"Rahul","email":"rahul@gmail.com"}
]
```
