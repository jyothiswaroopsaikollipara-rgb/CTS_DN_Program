# Week 3 – Spring REST & Spring Security

## Cognizant Digital Nurture (CTS DN) Java FSE Program

This repository contains the mandatory exercises completed for **Week 3** of the Cognizant Digital Nurture Java FSE Program.

---

## Project Information

- **Project Name:** spring-learn
- **Language:** Java
- **Framework:** Spring Boot 3
- **Build Tool:** Maven
- **Security:** Spring Security, JWT
- **Testing Tool:** Postman
- **IDE:** Eclipse / VS Code

---

# Module 1 – Spring REST Web Services

### Objectives

- Create Spring Boot REST application
- Configure Spring Beans using XML
- Implement REST APIs
- Enable Logging
- Exception Handling
- Unit Testing using MockMvc

### Hands-on Completed

- Spring Boot Project Creation
- Country Bean
- XML Configuration
- Country Service
- Country Controller
- Logging using SLF4J
- Get Country API
- Get All Countries API
- Exception Handling
- MockMvc Test Cases

### REST APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /countries | Get all countries |
| GET | /countries/{code} | Get country by code |

---

# Module 2 – REST Using Spring Boot

### Objectives

- Build REST APIs using layered architecture
- XML-based data loading
- DAO Layer
- Service Layer

### Hands-on Completed

- Employee Bean
- Department Bean
- Employee DAO
- Department DAO
- Employee Service
- Department Service
- Employee Controller
- Department Controller

### REST APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /employees | Get all employees |
| GET | /departments | Get all departments |

---

# Module 3 – RESTful Web Services

### Objectives

- REST API Naming
- POST API
- PUT API
- DELETE API
- Request Body
- Bean Validation
- Exception Handling

### Hands-on Completed

- REST URL Naming Convention
- POST Country API
- PUT Country API
- DELETE Country API
- Validation
- Global Exception Handling

### REST APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /countries | Get all countries |
| GET | /countries/{code} | Get country by code |
| POST | /countries | Add country |
| PUT | /countries | Update country |
| DELETE | /countries/{code} | Delete country |

---

# Module 4 – Spring Security & JWT

### Objectives

- Spring Security
- Basic Authentication
- Custom User
- Authentication Controller
- JWT Token Generation
- JWT Authorization Filter
- Secure REST APIs

### Hands-on Completed

- Spring Security Configuration
- Basic Authentication
- In-Memory User
- Authentication Controller
- Authorization Header Decoding
- JWT Generation
- JWT Authorization Filter
- Secured REST APIs

### Authentication APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /authenticate | Generate JWT Token |

---

# Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Security
- Maven
- JWT (jjwt)
- SLF4J Logging
- Postman
- JUnit
- MockMvc

---

# Project Structure

```
spring-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.springlearn
│   │   │       ├── bean
│   │   │       ├── controller
│   │   │       ├── dao
│   │   │       ├── service
│   │   │       ├── security
│   │   │       ├── filter
│   │   │       ├── exception
│   │   │       └── SpringLearnApplication
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       └── employee.xml
│   │
│   └── test
│
├── Screenshots
└── README.md
```

---

# Testing

The project was tested using:

- Postman
- MockMvc
- Maven Build

Commands used:

```bash
mvn clean install
```

```bash
mvn clean package -DskipTests
```

```bash
mvn spring-boot:run
```

---

# Screenshots Included

## Module 1

- Application Startup
- XML Configuration
- Logging
- Country APIs
- Exception Handling
- MockMvc Test

## Module 2

- Employees API
- Departments API

## Module 3

- POST API
- PUT API
- DELETE API
- Validation
- Global Exception Handling

## Module 4

- Application Startup
- Unauthorized Access
- Basic Authentication
- Authentication API
- JWT Token Generation
- JWT Authorization Filter
- JWT Protected API
- Build Success

---

# Learning Outcomes

- Developed RESTful APIs using Spring Boot
- Implemented layered architecture
- Performed CRUD operations
- Applied Bean Validation
- Implemented Global Exception Handling
- Secured REST APIs using Spring Security
- Generated and validated JWT tokens
- Tested APIs using Postman
- Managed project using Maven and Git

---

## Status

**Week 3 Completed Successfully** ✅

All mandatory CTS hands-on exercises were implemented, tested, documented, and pushed to GitHub.