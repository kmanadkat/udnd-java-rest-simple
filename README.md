### Java Springboot - Build A Simple REST API
API that returns a list of dogs from an embedded H2 in memory database. It uses [Spring Initializer](https://start.spring.io/) to bootstrap the project with following dependencies:
1. `spring-boot-starter-web` - This starter pack is used for web application development and automatically adds libraries like Spring MVC, REST, Tomcat, and Jackson. 
2. `com.h2database` - This starter pack is used for the H2 in-memory database. 
3. `spring-boot-starter-data-jpa` - This starter pack includes JDBC, Hibernate, Transactions API, JPA, and Aspects.

### Database Entity
```mermaid
classDiagram
Dog : Long id
Dog : String name
Dog : String breed
Dog : String origin
```

### Execution Flow
```mermaid
sequenceDiagram
    participant Client
    participant Controller
    participant Service
    participant Repository
    participant Database

    Client->>Controller: GET Request
    Controller->>Service: Forward Request
    Service->>Repository: Execute Business Logic
    Repository->>Database: Query Data

    Repository-->>Service: Prase Data
    Service-->>Controller: Form Response 
    Controller-->>Client: Response
```

### API Endpoints
The following table lists the available API routes for the Dog REST API project:

| Route         | Method | Description         |
|---------------|--------|---------------------|
| `/dogs`       | GET    | Get all dogs        |
| `/dogs/breed` | GET    | Get all dogs breed  |
| `/{id}/breed` | GET    | Get breed by dog id |
| `/dogs/name`  | GET    | Get all dogs name   |
