# Week 4 – Microservices with Spring Boot and Spring Cloud

This folder contains the mandatory Week 4 hands-on exercises completed as part of the Cognizant Digital Nurture Java FSE program.

## Modules Completed

### Module 1 – Microservices using Spring Boot

Implemented two independent Spring Boot microservices.

#### Account Microservice

**Endpoint:**

```http
GET /accounts/{number}
```

**Example:**

```text
http://localhost:8080/accounts/00987987973432
```

**Sample Response:**

```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343.0
}
```

**Port:** `8080`

#### Loan Microservice

**Endpoint:**

```http
GET /loans/{number}
```

**Example:**

```text
http://localhost:8081/loans/H00987987972342
```

**Sample Response:**

```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000.0,
  "emi": 3258.0,
  "tenure": 18
}
```

**Port:** `8081`

---

### Module 2 – Eureka Discovery Server

Implemented service discovery using Netflix Eureka.

The following applications were configured:

- Eureka Discovery Server
- Account Service
- Loan Service

**Eureka Server Port:** `8761`

**Eureka Dashboard:**

```text
http://localhost:8761
```

The following services were successfully registered:

```text
ACCOUNT-SERVICE
LOAN-SERVICE
```

Both services were verified with status `UP` on the Eureka Dashboard.

---

### Module 3 – Spring Cloud API Gateway

Implemented:

- Greet Service
- Spring Cloud API Gateway
- Request routing through the API Gateway
- Global request logging filter

#### Greet Service

**Direct Endpoint:**

```text
http://localhost:8082/greet
```

**Response:**

```text
Hello from Greet Service
```

**Port:** `8082`

#### API Gateway

The API Gateway routes incoming requests to the Greet Service.

**Gateway Endpoint:**

```text
http://localhost:8083/greet
```

**Response:**

```text
Hello from Greet Service
```

**Port:** `8083`

#### Global Logging Filter

A global filter was implemented to log incoming requests passing through the API Gateway.

**Example Log:**

```text
Incoming Request: GET /greet
```

---

## Project Structure

```text
Week4_Microservices/
│
├── account/
│   └── src/main/java/com/cognizant/account/
│       ├── controller/
│       └── model/
│
├── loan/
│   └── src/main/java/com/cognizant/loan/
│       ├── controller/
│       └── model/
│
├── eureka-discovery-server/
│
├── greet-service/
│   └── src/main/java/com/cognizant/greetservice/
│       └── controller/
│
├── api-gateway/
│   └── src/main/java/com/cognizant/apigateway/
│       └── filter/
│
├── Screenshots/
│   ├── account_Screenshots/
│   ├── loan_Screenshots/
│   └── EurekaServer_Screenshots/
│   └── APIGateway_Screenshots/
│
└── README.md
```

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Cloud
- Netflix Eureka
- Spring Cloud Gateway
- Maven
- Postman

---

## Testing

The microservices were tested using Postman and the browser.

The following were verified:

- Account REST API
- Loan REST API
- Eureka service registration
- Greet Service REST API
- Routing through API Gateway
- Global request logging

All projects were successfully built using:

```bash
mvn clean package
```

## Conclusion

Week 4 demonstrated the implementation of independent Spring Boot microservices, service discovery using Eureka, API Gateway routing, and global request logging.