# Journal Application

A backend Journal Management Application built using Java, Spring Boot, and MongoDB.
This project demonstrates REST API development, CRUD operations, layered architecture, authentication, and database integration.

---

## Features

* Create, Read, Update, and Delete Journal Entries
* RESTful API Development using Spring Boot
* MongoDB & MongoDB Atlas Integration
* Layered Architecture (Controller, Service, Repository)
* Spring Security Integration
* JWT Authentication & Authorization
* Unit Testing using JUnit
* API Testing using Postman
* Maven Dependency Management

---

## Tech Stack

* Java
* Spring Boot
* MongoDB
* MongoDB Atlas
* Spring Security
* JWT Authentication
* Maven
* JUnit
* Postman
* IntelliJ IDEA

---

## Project Structure

```bash
src
 └── main
      ├── java
      │    └── com/example/journalApp
      │          ├── controller
      │          ├── service
      │          ├── repository
      │          ├── entity
      │          └── config
      └── resources
           ├── application-dev.yml
           └── application-prod.yml
```

---

## Setup Instructions

### 1. Clone the Repository

```bash
git clone <your-github-repository-link>
cd journalApp
```

---

### 2. Configure Database Connection

Create the following files inside:

```bash
src/main/resources/
```

#### application-dev.yml

```yaml
spring:
  data:
    mongodb:
      uri: your_mongodb_connection_string
      database: your_database_name
```

#### application-prod.yml

```yaml
spring:
  data:
    mongodb:
      uri: your_production_mongodb_connection_string
      database: your_database_name
```

Replace the connection strings with your own MongoDB Atlas or local MongoDB database configuration.

---

### 3. Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main class directly from IntelliJ IDEA.

---

## API Testing

Use Postman to test the APIs.

Example Endpoints:

```http
POST   /journal
GET    /journal
PUT    /journal/{id}
DELETE /journal/{id}
```

---

## Unit Testing

Run tests using:

```bash
mvn test
```

JUnit is used for unit testing application components.

---

## Future Improvements

* Docker Integration
* Swagger/OpenAPI Documentation
* Role-Based Access Control
* Deployment on Cloud Platforms
* Frontend Integration

---

## Author

Mayank Singh Rajput
