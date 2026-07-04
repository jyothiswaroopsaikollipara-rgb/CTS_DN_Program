# Week 3 - Module 1 - Spring REST Web Services

## Objective
Develop RESTful web services using Spring Boot and implement exception handling and unit testing.

---

## Technologies Used

- Java 25
- Spring Boot 3.5.x
- Spring Web
- Maven
- SLF4J Logging
- JUnit 5
- MockMvc

---

## Project Structure
├── main
│ ├── bean
│ ├── controller
│ ├── exception
│ ├── service
│ └── SpringLearnApplication
│
└── test
└── controller


---

## REST APIs

### Get Default Country

GET /country

Returns the default country.

---

### Get All Countries

GET /countries

Returns all available countries.

---

### Get Country by Code

GET /countries/{code}

Example:

GET /countries/IN

Returns:

```json
{
  "code":"IN",
  "name":"India"
}