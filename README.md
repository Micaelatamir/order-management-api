# 📦 Order Management API

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-4.0.4-green?style=for-the-badge&logo=springboot"/>
  <img src="https://img.shields.io/badge/PostgreSQL-18-blue?style=for-the-badge&logo=postgresql"/>
  <img src="https://img.shields.io/badge/Spring%20Security-✔-brightgreen?style=for-the-badge&logo=springsecurity"/>
  <img src="https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge"/>
</p>

---

## 🇧🇷 Português

### Sobre o projeto

API REST de gerenciamento de pedidos desenvolvida do zero com **Java + Spring Boot + PostgreSQL**.
O projeto faz parte do meu portfólio como desenvolvedora Back-end e foi construído com foco em boas práticas de arquitetura em camadas, segurança e organização de código.

### ✨ Funcionalidades

- ✅ Cadastro, listagem, busca e exclusão de **Usuários**
- ✅ Cadastro, listagem, busca e exclusão de **Produtos**
- ✅ Criação e gerenciamento de **Pedidos** vinculados a usuários
- ✅ Gerenciamento de **Itens de Pedido** com produto e quantidade
- ✅ Autenticação via **Spring Security** com Basic Auth
- ✅ Padrão **DTO** para proteger dados sensíveis (ex: senha nunca exposta)
- ✅ Tratamento global de exceções com mensagens personalizadas

### 🏗️ Arquitetura

O projeto segue a arquitetura em camadas padrão do Spring:

```
Controller → Service → Repository → Database
```

```
src/
├── controller/     # Recebe as requisições HTTP
├── service/        # Regras de negócio
├── repository/     # Acesso ao banco de dados
├── model/          # Entidades JPA
├── dto/
│   ├── request/    # Dados que chegam do cliente
│   └── response/   # Dados retornados ao cliente
├── exception/      # Tratamento global de erros
└── security/       # Configuração de segurança
```

### 🛠️ Tecnologias utilizadas

| Tecnologia | Versão |
|---|---|
| Java | 17 |
| Spring Boot | 4.0.4 |
| Spring Data JPA | - |
| Spring Security | - |
| PostgreSQL | 18 |
| Hibernate | 7.2.7 |
| Maven | - |

### 📋 Endpoints

#### 👤 Users
| Método | Rota | Descrição |
|---|---|---|
| GET | `/users` | Lista todos os usuários |
| GET | `/users/{id}` | Busca usuário por ID |
| POST | `/users` | Cria novo usuário |
| DELETE | `/users/{id}` | Remove usuário |

#### 📦 Products
| Método | Rota | Descrição |
|---|---|---|
| GET | `/products` | Lista todos os produtos |
| GET | `/products/{id}` | Busca produto por ID |
| POST | `/products` | Cria novo produto |
| DELETE | `/products/{id}` | Remove produto |

#### 🛒 Orders
| Método | Rota | Descrição |
|---|---|---|
| GET | `/orders` | Lista todos os pedidos |
| GET | `/orders/{id}` | Busca pedido por ID |
| POST | `/orders` | Cria novo pedido |
| DELETE | `/orders/{id}` | Remove pedido |

#### 🧾 Order Items
| Método | Rota | Descrição |
|---|---|---|
| GET | `/order-items` | Lista todos os itens |
| GET | `/order-items/{id}` | Busca item por ID |
| POST | `/order-items` | Cria novo item |
| DELETE | `/order-items/{id}` | Remove item |

### ▶️ Como rodar o projeto

**Pré-requisitos:** Java 17+, PostgreSQL, Maven

```bash
# Clone o repositório
git clone https://github.com/Micaelatamir/order-management-api.git

# Configure o banco de dados no application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/orderdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# Rode o projeto
./mvnw spring-boot:run
```

### 🔐 Autenticação

A API usa **Basic Auth**. Configure suas credenciais no `application.properties`:

```properties
spring.security.user.name=seu_usuario
spring.security.user.password=sua_senha
```

---

## 🇺🇸 English

### About

A REST API for order management built from scratch with **Java + Spring Boot + PostgreSQL**.
This project is part of my Back-end developer portfolio, built with a focus on layered architecture best practices, security, and clean code organization.

### ✨ Features

- ✅ CRUD for **Users**, **Products**, **Orders** and **Order Items**
- ✅ Authentication via **Spring Security** with Basic Auth
- ✅ **DTO pattern** to protect sensitive data (password never exposed)
- ✅ Global exception handling with custom messages
- ✅ JPA/Hibernate for database mapping
- ✅ Auto-fill of `createdAt` using `@PrePersist`

### 🛠️ Tech Stack

| Technology | Version |
|---|---|
| Java | 17 |
| Spring Boot | 4.0.4 |
| Spring Data JPA | - |
| Spring Security | - |
| PostgreSQL | 18 |
| Hibernate | 7.2.7 |
| Maven | - |

### ▶️ How to run

**Requirements:** Java 17+, PostgreSQL, Maven

```bash
# Clone the repository
git clone https://github.com/Micaelatamir/order-management-api.git

# Set up the database in application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/orderdb
spring.datasource.username=your_username
spring.datasource.password=your_password

# Run the project
./mvnw spring-boot:run
```

---

## 👩‍💻 Autora | Author

**Micaela Tamir**

[![GitHub](https://img.shields.io/badge/GitHub-Micaelatamir-black?style=for-the-badge&logo=github)](https://github.com/Micaelatamir)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Micaela%20Tamir-blue?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/micaela-tamir)

---

<p align="center">Micaela Tamir</p>
