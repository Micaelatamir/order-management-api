#  Order Management API

A REST API for order management built from scratch with **Java**, **Spring Boot** and **PostgreSQL**, following clean layered architecture best practices.

![Java](https://img.shields.io/badge/Java_17-FF3B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-00C853?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-2979FF?style=for-the-badge&logo=postgresql&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-00C853?style=for-the-badge&logo=springsecurity&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-00B0FF?style=for-the-badge&logo=docker&logoColor=white)

---

## 📌 About

This project simulates a real-world order management system with users, products, orders, and order items. Built as part of my backend developer portfolio with a focus on clean architecture, security, and code organization.

---

##  Features

- Full CRUD for Users, Products, Orders, and Order Items
- Authentication via Spring Security (Basic Auth → JWT migration in progress)
- DTO pattern to protect sensitive data — password never exposed in responses
- Global exception handling with custom error messages
- JPA/Hibernate entity mapping
- Auto-fill of `createdAt` using `@PrePersist`

---

##  Architecture

```
Controller → Service → Repository → Database
```

```
src/
├── controller/     # HTTP request handling
├── service/        # Business logic
├── repository/     # Database access
├── model/          # JPA entities
├── dto/
│   ├── request/    # Incoming client data
│   └── response/   # Data returned to client
├── exception/      # Global error handling
└── security/       # Security configuration
```

---

## 🗄️ Database Model

```
Users ──< Orders ──< Order_Items >── Products
```

| Entity | Description |
|---|---|
| `users` | Registered users |
| `products` | Available products |
| `orders` | Orders linked to a user |
| `order_items` | Items in each order (product + quantity) |

---

## 🛠️ Tech Stack

| Technology | Version |
|---|---|
| Java | 17 |
| Spring Boot | 4.0.4 |
| Spring Data JPA | — |
| Spring Security | — |
| PostgreSQL | 18 |
| Hibernate | 7.2.7 |
| Maven | — |
| Docker | — |

---

##  Endpoints

### Users
| Method | Route | Description |
|---|---|---|
| GET | `/users` | List all users |
| GET | `/users/{id}` | Get user by ID |
| POST | `/users` | Create new user |
| DELETE | `/users/{id}` | Delete user |

### Products
| Method | Route | Description |
|---|---|---|
| GET | `/products` | List all products |
| GET | `/products/{id}` | Get product by ID |
| POST | `/products` | Create new product |
| DELETE | `/products/{id}` | Delete product |

### Orders
| Method | Route | Description |
|---|---|---|
| GET | `/orders` | List all orders |
| GET | `/orders/{id}` | Get order by ID |
| POST | `/orders` | Create new order |
| DELETE | `/orders/{id}` | Delete order |

### Order Items
| Method | Route | Description |
|---|---|---|
| GET | `/order-items` | List all items |
| GET | `/order-items/{id}` | Get item by ID |
| POST | `/order-items` | Create new item |
| DELETE | `/order-items/{id}` | Delete item |

---

## ⚙️ Getting Started

### Prerequisites
- Java 17+
- PostgreSQL
- Maven

```bash
# Clone the repository
git clone https://github.com/Micaelatamir/order-management-api.git
cd order-management-api

# Set up the database in src/main/resources/application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/orderdb
spring.datasource.username=your_username
spring.datasource.password=your_password

# Run the application
./mvnw spring-boot:run
```

### Running with Docker Compose

```bash
docker-compose up -d
```

---

##  Authentication

The API uses Basic Auth via Spring Security. Set credentials in `application.properties`:

```properties
spring.security.user.name=admin
spring.security.user.password=admin123
```

Send the header in HTTP clients:

```
Authorization: Basic <base64(username:password)>
```

---

## Roadmap

- [x] Full CRUD for all entities
- [x] Spring Security with Basic Auth
- [x] DTO pattern + global exception handling
- [ ] Migrate Basic Auth to JWT
- [ ] Docker Compose setup
- [ ] Bean Validation (`@NotBlank`, `@Email`, etc.)
- [ ] Swagger / OpenAPI documentation
- [ ] Unit tests with JUnit + Mockito

---

##  Author

**Micaela Tamires** — Backend Developer focused on Java, Spring Boot, and software security.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/micaela-tamires-aa320b312/)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Micaelatamir)
