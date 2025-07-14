# 📚 Book Management System

A Spring Boot web application to manage books in a library. It includes role-based login using Spring Security — **Users** can view books, and **Librarians** can add or delete books.

---

## 🚀 Features

- ✅ Login using Spring Security
- 📖 View books (Users)
- ➕ Add, ✏️ Update, ❌ Delete books (Librarians)
- 🔒 Role-based authorization
- 🧠 Thymeleaf for front-end templates
- 💾 MySQL database integration
- 🛠 CRUD operations with Spring Data JPA

---

## 🖥️ Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring MVC + Spring Security
- Spring Data JPA (Hibernate)
- Thymeleaf (HTML)
- MySQL
- Git + GitHub

---

## 🔐 User Roles

| Role      | Permissions                          |
|-----------|--------------------------------------|
| **User**  | Can only view (read) books           |
| **Librarian** | Can add, update, delete books    |

---

## ⚙️ How to Run the Project

### 💽 Requirements

- Java JDK 17 or higher
- Maven
- MySQL Server

### 🔧 Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/24ksandeep/book-management-system.git
   cd book-management-system

