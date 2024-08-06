# Blog App API

## Overview

This project is a Blog application built using Spring Boot, Spring Security, JWT, Spring Data JPA (Hibernate), and a MySQL database.
It demonstrates how to create robust REST APIs with various functionalities, including user authentication, CRUD operations, pagination, and more.

## Features

- **REST API Basics:**
  - Resource, Sub-resource, URI, HTTP methods, HTTP status codes.
- **CRUD Operations:**
  - Create, Read, Update, Delete functionalities for blog posts and users.
- **Pagination and Sorting:**
  - APIs for paginated and sorted results.
- **Authentication & Authorization:**
  - Login, Sign-in, and Signup functionalities.
  - Secure APIs using Spring Security and JWT (JSON Web Token).
  - In-memory and DB authentication and authorization.
  - Role-based security.
- **DTOs and Lombok:**
  - Use Data Transfer Objects (DTOs) for API data handling.
  - Lombok for boilerplate code reduction.
- **Exception Handling & Validation:**
  - Custom exception handling for REST APIs.
  - API validation with Spring Boot.
- **Spring Data JPA:**
  - Query methods, one-to-many and many-to-many JPA mappings.
- **API Testing:**
  - Test APIs using Postman REST Client.
- **JWT (JSON Web Token):**
  - Configuration and usage in Spring Security.
  - Secure REST APIs with JWT.
  - JWT integration with Login API.
- **API Versioning:**
  - Implemented versioning for REST APIs using different strategies.

## Technologies Used

- **Spring Boot** - Framework for building Java-based applications.
- **Spring Security** - Authentication and authorization framework.
- **JWT** - Token-based authentication mechanism.
- **Spring Data JPA (Hibernate)** - ORM framework for database interactions.
- **MySQL** - Relational database management system.
- **Lombok** - Library to reduce boilerplate code.
- **Postman** - Tool for testing APIs.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven or Gradle
- MySQL Database
- Postman (for API testing)

### Setup

1. **Clone the Repository:**

   ```bash
   git clone # Blog App API

API Endpoints
Blog Posts:

GET /api/posts - List all posts.

POST /api/posts - Create a new post.

GET /api/posts/{id} - Get a post by ID.

PUT /api/posts/{id} - Update a post.

DELETE /api/posts/{id} - Delete a post.

Authentication:

POST /api/auth/signup - Register a new user.

POST /api/auth/login - Login and get a JWT token.

Pagination and Sorting:

GET /api/posts?page=0&size=10&sort=title,desc - Paginated and sorted posts.

Contact

Author: Ramyalakshmi.M

Email: ramyagandhi16@gmail.com

GitHub:  https://github.com/Ramyalakshmi-tech/BlogApp.git


