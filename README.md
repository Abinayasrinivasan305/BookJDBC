# Book Management System

This project is a simple Book Management System implemented in Java using JDBC for database connectivity. It allows you to perform CRUD (Create, Read, Update, Delete) operations on a books database.

## Features

- **Add a Book**: Insert a new book into the database.
- **View Books**: Retrieve and display all books from the database.
- **Update a Book**: Modify details of an existing book.
- **Delete a Book**: Remove a book from the database.

## Prerequisites

- JDK 8 or higher
- MySQL Database
- JDBC Driver for MySQL

## Database Setup

1. Install MySQL and create a database named `bookdb`.
2. Create a table named `book` with the following structure:

```sql
CREATE TABLE book (
    bno INT PRIMARY KEY,
    bname VARCHAR(255) NOT NULL,
    bprice FLOAT NOT NULL
);

jdbcvalidation/
│
├── Dbconnection.java
├── AddBook.java
├── ViewBooks.java
├── UpdateBook.java
├── DeleteBook.java
├── Main1.java
└── README.md
Dbconnection.java
Handles the connection to the MySQL database.

AddBook.java
Contains the functionality to add a new book to the database.

ViewBooks.java
Contains the functionality to retrieve and display all books from the database.

UpdateBook.java
Contains the functionality to update details of an existing book.

DeleteBook.java
Contains the functionality to delete a book from the database.

Main1.java
The entry point of the application that provides a menu to choose different CRUD operations.
Usage
    Clone the Repository: Clone this repository to your local machine.
         git clone https://github.com/yourusername/Bookmanagement.git
    Set up the Database Connection: Update the Dbconnection.java file with your MySQL database credentials.
    // Example configuration
       private static final String URL = "jdbc:mysql://localhost:3306/bookdb";
       private static final String USER = "yourusername";
       private static final String PASSWORD = "yourpassword";





