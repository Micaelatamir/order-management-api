

# 📦 Order Management API

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.4-green?style=for-the-badge&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-18-blue?style=for-the-badge&logo=postgresql)
![Spring Security](https://img.shields.io/badge/Spring%20Security-✔-brightgreen?style=for-the-badge&logo=springsecurity)
![Docker](https://img.shields.io/badge/Docker-✔-2496ED?style=for-the-badge&logo=docker)

---

## 🇧🇷 Português

### Sobre o projeto

API REST de gerenciamento de pedidos desenvolvida do zero com **Java + Spring Boot + PostgreSQL**.  
O projeto faz parte do meu portfólio como desenvolvedora Back-end e foi construído com foco em boas práticas de arquitetura em camadas, segurança e organização de código.

---

### ✨ Funcionalidades

- ✅ CRUD completo de **Usuários**, **Produtos**, **Pedidos** e **Itens de Pedido**
- ✅ Autenticação via **Spring Security** com Basic Auth
- ✅ Padrão **DTO** para proteger dados sensíveis (senha nunca exposta nas respostas)
- ✅ Tratamento global de exceções com mensagens personalizadas
- ✅ Mapeamento de entidades com **JPA/Hibernate**
- ✅ Preenchimento automático de `createdAt` com `@PrePersist`

---

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

---

### 🗄️ Modelagem do banco de dados

```
Users ──< Orders ──< Order_Items >── Products
```

| Entidade      | Descrição                                |
|---------------|------------------------------------------|
| `users`       | Usuários cadastrados no sistema          |
| `products`    | Produtos disponíveis para compra         |
| `orders`      | Pedidos vinculados a um usuário          |
| `order_items` | Itens de cada pedido (produto + qtd)     |

---

### 🛠️ Tecnologias utilizadas

| Tecnologia        | Versão  |
|-------------------|---------|
| Java              | 17      |
| Spring Boot       | 4.0.4   |
| Spring Data JPA   | -       |
| Spring Security   | -       |
| PostgreSQL        | 18      |
| Hibernate         | 7.2.7   |
| Maven             | -       |
| Docker            | -       |

---

### 📋 Endpoints

#### 👤 Users

| Método | Rota          | Descrição              |
|--------|---------------|------------------------|
| GET    | `/users`      | Lista todos os usuários |
| GET    | `/users/{id}` | Busca usuário por ID   |
| POST   | `/users`      | Cria novo usuário      |
| DELETE | `/users/{id}` | Remove usuário         |

<details>
<summary>📨 Exemplo de requisição — POST /users</summary>

```json
{
  "name": "Micaela Tamir",
  "email": "micaela@email.com",
  "password": "senha123"
}
```

**Resposta (201 Created):**
```json
{
  "id": 1,
  "name": "Micaela Tamir",
  "email": "micaela@email.com"
}
```
> 🔒 A senha **nunca é retornada** nas respostas — protegida pelo padrão DTO.
</details>

---

#### 📦 Products

| Método | Rota             | Descrição               |
|--------|------------------|-------------------------|
| GET    | `/products`      | Lista todos os produtos |
| GET    | `/products/{id}` | Busca produto por ID    |
| POST   | `/products`      | Cria novo produto       |
| DELETE | `/products/{id}` | Remove produto          |

<details>
<summary>📨 Exemplo de requisição — POST /products</summary>

```json
{
  "name": "Teclado Mecânico",
  "price": 299.90,
  "description": "Teclado mecânico ABNT2 com switch blue"
}
```

**Resposta (201 Created):**
```json
{
  "id": 1,
  "name": "Teclado Mecânico",
  "price": 299.90,
  "description": "Teclado mecânico ABNT2 com switch blue"
}
```
</details>

---

#### 🛒 Orders

| Método | Rota           | Descrição              |
|--------|----------------|------------------------|
| GET    | `/orders`      | Lista todos os pedidos |
| GET    | `/orders/{id}` | Busca pedido por ID    |
| POST   | `/orders`      | Cria novo pedido       |
| DELETE | `/orders/{id}` | Remove pedido          |

<details>
<summary>📨 Exemplo de requisição — POST /orders</summary>

```json
{
  "userId": 1
}
```

**Resposta (201 Created):**
```json
{
  "id": 1,
  "userId": 1,
  "createdAt": "2026-05-07T10:30:00"
}
```
</details>

---

#### 🧾 Order Items

| Método | Rota                | Descrição              |
|--------|---------------------|------------------------|
| GET    | `/order-items`      | Lista todos os itens   |
| GET    | `/order-items/{id}` | Busca item por ID      |
| POST   | `/order-items`      | Cria novo item         |
| DELETE | `/order-items/{id}` | Remove item            |

<details>
<summary>📨 Exemplo de requisição — POST /order-items</summary>

```json
{
  "orderId": 1,
  "productId": 1,
  "quantity": 2
}
```

**Resposta (201 Created):**
```json
{
  "id": 1,
  "orderId": 1,
  "productId": 1,
  "productName": "Teclado Mecânico",
  "quantity": 2,
  "unitPrice": 299.90,
  "totalPrice": 599.80
}
```
</details>

---

### ▶️ Como rodar o projeto

#### Pré-requisitos
- Java 17+
- PostgreSQL
- Maven

```bash
# Clone o repositório
git clone https://github.com/Micaelatamir/order-management-api.git

# Acesse a pasta do projeto
cd order-management-api

# Configure o banco de dados em src/main/resources/application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/orderdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# Execute a aplicação
./mvnw spring-boot:run
```

#### 🐳 Rodando com Docker Compose

> Em breve: o `docker-compose.yml` está sendo adicionado ao projeto.

```bash
docker-compose up -d
```

---

### 🔐 Autenticação

A API utiliza **Basic Auth** via Spring Security.  
Configure as credenciais no `application.properties`:

```properties
spring.security.user.name=admin
spring.security.user.password=admin123
```

Nos clientes HTTP, envie o header:
```
Authorization: Basic <base64(usuario:senha)>
```

---

### 🗺️ Próximos passos (Roadmap)

- [ ] Migração de Basic Auth para **JWT**
- [ ] Adição de **Docker Compose** para facilitar execução
- [ ] **Validação de dados** com Bean Validation (`@NotBlank`, `@Email`, etc.)
- [ ] Documentação interativa com **Swagger / OpenAPI**
- [ ] Testes unitários com **JUnit + Mockito**

---

## 🇺🇸 English

### About

A REST API for order management built from scratch with **Java + Spring Boot + PostgreSQL**.  
This project is part of my back-end developer portfolio, focused on layered architecture best practices, security, and clean code organization.

---

### ✨ Features

- ✅ Full CRUD for **Users**, **Products**, **Orders**, and **Order Items**
- ✅ Authentication via **Spring Security** with Basic Auth
- ✅ **DTO pattern** to protect sensitive data (password never exposed)
- ✅ Global exception handling with custom messages
- ✅ JPA/Hibernate for database mapping
- ✅ Auto-fill of `createdAt` using `@PrePersist`

---

### 🛠️ Tech Stack

| Technology        | Version |
|-------------------|---------|
| Java              | 17      |
| Spring Boot       | 4.0.4   |
| Spring Data JPA   | -       |
| Spring Security   | -       |
| PostgreSQL        | 18      |
| Hibernate         | 7.2.7   |
| Maven             | -       |
| Docker            | -       |

---

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
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Micaela%20Tamir-blue?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/micaela-tamires-aa320b312/)

---

> 🌟 *"Código é poesia. E eu tô escrevendo a minha história linha por linha."*
