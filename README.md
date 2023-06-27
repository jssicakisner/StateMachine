# State Machine implementation

Application using Spring State Machine implementation.

### Description

This is a demo application that shows the functionality of processing payment states. It's meant as a project to implement the ideia of the application existing in a finite number of states and with certain predefined triggers to take the application from one state to the next. Such triggers, in this case, are based on events.

### Technologies used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Maven

**The spring state machine dependency needs to be added separately.**

`<dependency>`
` <groupId>org.springframework.statemachine</groupId>`
` <artifactId>spring-statemachine-core</artifactId>`
` <version>2.2.0.RELEASE</version>`
`</dependency>`

### Contributions

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.