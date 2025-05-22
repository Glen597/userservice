# 👤 UserService API

A clean and lightweight RESTful microservice built with **Java**, **JAX-RS (Jersey)**, **Grizzly**, and **Gradle**. It demonstrates how to create a standalone HTTP API server with basic in-memory CRUD operations for managing users.

> 🧪 Live API: [https://username-application-latest.onrender.com/api/users](https://username-application-latest.onrender.com/api/users)
  
> 📦 Example request: `GET /api/users`

---

## 🚀 Features

- `GET /api/users` – Retrieve all users
- `GET /api/users/{id}` – Retrieve a specific user by ID
- `POST /api/users` – Create a new user
- `DELETE /api/users/{id}` – Delete a user by ID

> Data is stored in-memory using a `HashMap` (non-persistent, for demonstration purposes).
>
> ## 🛠️ Tech Stack

- Java 17
- JAX-RS (Jersey 3.x)
- Grizzly HTTP Server
- Gradle (Kotlin DSL)
- Docker
- Render (for deployment)

---

## 💡 Project Purpose

This project was created as part of my Java microservices learning path and is featured in my **CV and developer portfolio**. It reflects my ability to:
- Set up a microservice from scratch using industry standards
- Deploy and run it live using Docker and Render
- Write clean, testable, and maintainable backend code


## 📦 Sample API Usage (Postman or cURL)

### ➕ Create a User

```http
POST https://userservice.onrender.com/api/users
Content-Type: application/json

{
  "name": "Alice",
  "email": "alice@example.com"
}

### Get All Users

```http
GET https://userservice.onrender.com/api/users

### Get a User by ID

```http
GET https://userservice.onrender.com/api/users/1

### ❌ Delete a User

```http
DELETE https://userservice.onrender.com/api/users/1

### 🧪 Run Locally
# 1. Clone the Repository

git clone https://github.com/yourusername/userservice.git
cd userservice

# 2. Build & Run

./gradlew run

```http
The service will be available at http://localhost:8080/api/users

### 📄 License
This project is for educational/demo purposes.
Feel free to use, improve, or extend it as needed.
