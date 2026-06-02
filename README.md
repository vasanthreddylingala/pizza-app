# Pizza App — Full Stack Spring Boot Application

> Personal Project | Full Stack Java Web Application  
> Built with Spring Boot, Spring Security, Thymeleaf, JPA & H2 Database.

---

## Project Overview

A fully functional pizza ordering web application built using the Spring Boot framework.  
Users can browse the pizza menu, place orders, and the app handles authentication, data persistence, and server-side rendering — all in one clean full-stack Java application.

---

## Features

| Feature | Description |
|---|---|
| User Authentication | Secure login and registration using Spring Security |
| Pizza Menu | Browse available pizzas with details |
| Order Management | Place and manage pizza orders |
| Database | H2 in-memory database with JPA for data persistence |
| Server-Side Rendering | Dynamic HTML pages using Thymeleaf templates |
| H2 Console | Built-in browser-based DB viewer for development |

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot 4.0.5 |
| Web | Spring MVC |
| Security | Spring Security |
| Database | H2 In-Memory |
| ORM | Spring Data JPA / Hibernate |
| Template Engine | Thymeleaf |
| Build Tool | Maven |

---

##  How to Run Locally

### Prerequisites
- Java 17 or higher installed
- Maven installed

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/vasanthreddylingala/pizza-app.git

# 2. Navigate into the project folder
cd pizza-app

# 3. Run the application
./mvnw spring-boot:run
```

### Access the App

| URL | Description |
|---|---|
| `http://localhost:8080` | Main application |
| `http://localhost:8080/login` | Login page |
| `http://localhost:8080/h2-console` | H2 Database console |

**H2 Console Settings:**

JDBC URL  : jdbc:h2:mem:pizzadb
Username  : sa
Password  : (leave blank)

---

## Project Structure
pizza-app/
│
├── src/
│   ├── main/
│   │   ├── java/com/pizza/pizza_app/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── PizzaAppApplication.java
│   │   └── resources/
│   │       ├── templates/
│   │       ├── static/
│   │       └── application.properties
│   └── test/
│
├── pom.xml
└── README.md

---

## Key Learnings

- Building a full-stack MVC application with Spring Boot
- Implementing authentication and authorization using Spring Security
- Using Spring Data JPA with Hibernate for database operations
- Creating server-rendered pages with Thymeleaf templates
- Working with H2 in-memory database for rapid development
- Understanding layered architecture: Controller → Service → Repository → DB

---

## Author

**Vasanth Reddy Lingala**  
🔗 [GitHub Profile](https://github.com/vasanthreddylingala)

---

## 📄 License

This project is open source and available under the MIT License.
