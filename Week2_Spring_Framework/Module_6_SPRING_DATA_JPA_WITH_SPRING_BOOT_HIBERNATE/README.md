# Module 6 – Spring Data JPA with Spring Boot & Hibernate

## Objective

The objective of this module is to understand how Spring Data JPA simplifies database operations using Hibernate as the ORM framework. This project demonstrates CRUD (Create, Read, Update, Delete) operations on an Employee entity using an H2 database.

---

## Technologies Used

* Java 25
* Spring Boot 3.5.4
* Spring Data JPA
* Hibernate ORM
* H2 Database
* Maven

---

## Project Structure

```
spring-data-jpa-demo
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cts.jpa
│   │   │       ├── entity
│   │   │       │      Employee.java
│   │   │       ├── repository
│   │   │       │      EmployeeRepository.java
│   │   │       ├── service
│   │   │       │      EmployeeService.java
│   │   │       └── main
│   │   │              SpringDataJpaApplication.java
│   │   │
│   │   └── resources
│   │          application.properties
│   │
│   └── test
│
└── pom.xml
```

---

## Concepts Covered

* Spring Boot Application
* Dependency Injection
* Spring Data JPA
* Hibernate ORM
* Entity Mapping
* Repository Layer
* Service Layer
* H2 Database Configuration
* CRUD Operations

---

## CRUD Operations Implemented

### Create

* Save Employee using `save()`

### Read

* Retrieve Employees using `findAll()`

### Update

* Update Employee Department

### Delete

* Delete Employee using `deleteById()`

---

## Application Flow

```
Spring Boot Application
          │
          ▼
CommandLineRunner
          │
          ▼
EmployeeService
          │
          ▼
EmployeeRepository
          │
          ▼
Hibernate ORM
          │
          ▼
H2 Database
```

---

## Hibernate Generated SQL

Example:

```sql
insert into employee (department,name,id) values (?,?,default)
```

Hibernate automatically converts Java objects into SQL statements and executes them on the database.

---

## Output

* Spring Boot application started successfully.
* Employee table created automatically.
* Employee record inserted successfully.
* CRUD operations executed successfully.
* H2 Console verified.
* SQL queries executed successfully.

---

## Learning Outcomes

After completing this module, I learned:

* Spring Boot project configuration
* Spring Data JPA fundamentals
* Hibernate ORM concepts
* Entity and Repository creation
* Service Layer implementation
* Database connectivity using H2
* CRUD operations using JpaRepository
* ORM mapping between Java objects and database tables

---

## Result

Successfully developed and tested a Spring Boot application using Spring Data JPA and Hibernate to perform CRUD operations on an H2 database.
