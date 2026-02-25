
# Simple Library Management System (Java & MySQL)

A robust desktop-based application designed to streamline library operations, focusing on efficient data management and logical backend processing. This project serves as a demonstration of Core Java proficiency, JDBC integration, and Relational Database management.

## Core Functionalities

* **Book Inventory Management:** Complete CRUD operations (Create, Read, Update, Delete) for books, including tracking titles, authors, genres, and stock levels.
* **Member Records:** Systematic storage and management of library member profiles and unique membership IDs.
* **Borrowing & Returning Logic:** Backend implementation of transaction workflows, including due date calculations and availability status updates.
* **Authentication:** Secure login module for administrators to manage the system's sensitive data.
* **Search & Filter:** Optimized queries to retrieve specific data from the MySQL database based on multiple criteria.

## Tech Stack & Tools

* **Language:** Java (JDK 11 or higher)
* **Database:** MySQL
* **Driver:** JDBC (Java Database Connectivity)
* **Build Tool:** Maven / Standard Java Project Structure
* **IDE:** IntelliJ IDEA / Eclipse / NetBeans

## Project Structure

The project follows a clean, modular architecture to ensure code readability and maintainability:

* `src/model`: Entity classes representing the data schema (Book, Member, Transaction).
* `src/controller`: Core business logic and database interaction handlers.
* `src/util`: Utility classes for database connection strings and helper methods.
* `src/view`: Functional UI components built with Java Swing/AWT.

## Installation & Setup

1. **Prerequisites:**
* Java Development Kit (JDK) 11+ installed.
* MySQL Server running on your local machine.


2. **Database Configuration:**
* Create a new database: `CREATE DATABASE simple_library_db;`.
* Execute the SQL scripts provided in the `/sql` folder to initialize tables.


3. **Connection Setup:**
* Update the database credentials (URL, Username, Password) in the `DBConnection.java` or configuration file.


4. **Run the Application:**
* Compile the project and execute the `Main` class to start the system.



## Key Learnings

* Solid understanding of JDBC for seamless communication between Java and MySQL.
* Implementing **DAO (Data Access Object)** patterns for cleaner backend logic.
* Handling **SQL exceptions** and managing database connection pools effectively.




