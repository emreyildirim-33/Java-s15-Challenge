# Java OOP Advanced Library Automation

An advanced Java Object-Oriented Programming project focused on library automation, domain modeling, class hierarchies, encapsulation, inheritance, composition, abstraction, polymorphism, and Java Collections.

The project simulates a console-based library management system with books, authors, readers, categories, borrowing operations, return operations, invoices, and collection-based data management.

## Overview

This project demonstrates how a library automation system can be modeled using object-oriented design principles in Java.

The main goal is to design a structured console application with meaningful class relationships, reusable domain models, and collection-based data handling.

The system includes core library operations such as adding books, searching books, listing books by category or author, borrowing books, returning books, generating invoices, and enforcing borrowing limits.

## Tech Stack

* Java
* Maven
* Object-Oriented Programming
* Java Collections Framework
* List
* Set
* Map
* Abstract classes / Interfaces
* Console application design
* UML-based class design

## Core Concepts

* Object-Oriented Design
* Encapsulation
* Inheritance
* Composition
* Abstraction
* Polymorphism
* Class hierarchy design
* Interface / abstract class usage
* Java Collections
* List-based data handling
* Set-based uniqueness handling
* Map-based storage
* Console-based user flow
* Domain-driven class modeling

## Domain Model

The project is based on a library automation domain with entities such as:

* Book
* Author
* Reader
* Library user
* Category
* Invoice
* Borrowing record
* Return operation
* Library inventory

The application models relationships between books, authors, users, categories, and borrowing operations.

## Main System Capabilities

The console application is designed to support operations such as:

* Add a new book to the system
* Search books by ID
* Search books by name
* Search books by author
* Update existing book information
* Delete books from the system
* List books by category
* List books by author
* Borrow books if available
* Return borrowed books
* Track which user borrowed which book
* Generate invoice records when a book is borrowed
* Refund or reverse invoice behavior when a book is returned
* Enforce a maximum borrowing limit of 5 books per user

## Object-Oriented Design Requirements

The project structure applies OOP principles such as:

* Meaningful package organization
* Encapsulated class fields
* At least one inheritance relationship
* At least one abstract class or interface
* Composition between related domain objects
* Polymorphic method behavior
* Minimum 10 domain-related classes
* Clear class relationships
* Collection-based storage and lookup logic

## Collection Usage

The project uses Java Collections to solve domain problems.

### List

Used for ordered collections such as books, users, or transaction records.

### Set

Used where uniqueness is required, such as categories, authors, or unique domain objects.

### Map

Used for fast lookup and storage operations, such as finding books or users by ID.

## Example Application Flow

```text
Library System
↓
Book Management
↓
User / Reader Management
↓
Borrow Book
↓
Generate Invoice
↓
Track Borrowed Book
↓
Return Book
↓
Update Availability
```

## Project Structure

```text
src/
 └── main/
     └── java/
         └── ...
             ├── model/
             ├── service/
             ├── repository/
             ├── abstraction/
             ├── automation/
             └── Main.java
```

## What This Project Demonstrates

* Designing a console-based Java application
* Creating meaningful domain classes
* Building object relationships with OOP principles
* Applying encapsulation across class fields
* Using inheritance for shared behavior
* Using composition for connected domain objects
* Defining abstract classes or interfaces
* Applying polymorphism for flexible behavior
* Managing data with List, Set, and Map structures
* Modeling borrowing and returning workflows
* Structuring a larger Java OOP project
* Translating a real-world domain into Java classes

## Getting Started

### Prerequisites

Make sure you have the following installed:

* Java 17+
* Maven
* IntelliJ IDEA or another Java IDE

### Installation

Clone the repository:

```bash
git clone https://github.com/emreyildirim-33/java-oop-advanced-library-automation.git
cd java-oop-advanced-library-automation
```

Run the project from your IDE or with Maven:

```bash
mvn test
```

## Notes

This project focuses on advanced Java OOP design, domain modeling, class relationships, Java Collections, and console-based library automation logic.

The main purpose is to demonstrate object-oriented thinking, reusable class structure, and collection-based data management through a library automation scenario.

## Repository

GitHub: https://github.com/emreyildirim-33/java-oop-advanced-library-automation
