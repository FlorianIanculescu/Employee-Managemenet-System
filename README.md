# Employee-Managemenet-System

[![Language](https://img.shields.io/badge/Language-Java%2017-blue?labelColor=gray&style=flat&link=https://www.java.com/en/)](https://www.java.com/en/)
[![Framework](https://img.shields.io/badge/Framework-Spring%206-green?style=flat&link=https://spring.io/)](https://spring.io/)
[![Framework](https://img.shields.io/badge/Framework-Spring%20Boot%203-green?style=flat&link=https://spring.io/projects/spring-boot)](https://spring.io/projects/spring-boot)
[![Database](https://img.shields.io/badge/Database-MySQL-blue?style=flat&link=https://www.mysql.com/)](https://www.mysql.com/)
[![IDE](https://img.shields.io/badge/IDE-IntelliJ-purple?style=flat&link=https://www.jetbrains.com/idea/)](https://www.jetbrains.com/idea/)
[![Tools](https://img.shields.io/badge/Tools-Postman%20IDEA-orange?style=flat&link=https://www.postman.com/)](https://www.postman.com/)
[![Tools](https://img.shields.io/badge/Tools-MySQL%20Workbench-blue?style=flat&link=https://www.mysql.com/products/workbench/)](https://www.mysql.com/products/workbench/)

## Introduction
This project is a comprehensive example of building a RESTful API using Spring Boot, incorporating various essential components to create a robust and secure application. With full CRUD (Create, Read, Update, Delete) support, JPA/Hibernate for database operations, Spring Security for authentication and authorization, and advanced exception handling, this project serves as an excellent starting point for building RESTful services with Spring.

## Technologies Used

- Spring Boot: The project is built using the Spring Boot framework, which simplifies the development of production-ready applications.

- JPA (Java Persistence API) and Hibernate: Database persistence is managed using JPA with Hibernate as the underlying implementation. This ensures efficient and object-relational mapping.

- Spring Security: The application includes Spring Security for authentication and authorization, ensuring secure access to the REST endpoints.

- Exception Handling: Comprehensive exception handling is implemented to provide meaningful error messages and handle various types of exceptions gracefully.

- MySQL Database: The project is connected to a MySQL database, allowing for efficient data storage and retrieval.

## Project Structure
The project follows a standard Spring project structure with packages organized based on functionality:

- **'com.employeemanagement' :** Root package for the project.

- **'controller' :** Houses REST controllers responsible for handling incoming HTTP requests and managing CRUD operations while coordinating business logic execution.
  
- **'entity' :** Defines entity classes for database mapping in Spring Boot.

- **'exception' :** Includes custom exception classes and implements exception handling mechanisms to ensure graceful error handling.

- **'repository' :** Provides JPA repositories for interacting with the underlying database, offering convenient methods for data access.

- **'security' :** Contains configuration classes related to Spring Security, including authentication and authorization configurations.

- **'service' :** Implements business logic and orchestrates interactions between controllers and repositories.

## How to Run the Project
1. **Clone the Repository:**
```
git clone https://github.com/your-username/spring-rest-project.git

cd spring-rest-project
```

2. **Configure Database:**

  - Update the application.properties file with your MySQL database configuration.

3. **Build and Run:**
```
./mvnw spring-boot:run
```
  The application will start on 'http://localhost:8080'.

## API Endpoints
The API exposes the following endpoints for performing CRUD operations:

- **Create a new employee:**
  <pre>
  <b>POST</b> : '/api/employees'
  </pre>
  
- **Retrieve all employees:**
  <pre>
  <b>GET</b> : '/api/employees'
  </pre>
  
- **Retrieve a specific employee by ID:**
  <pre>
  <b>GET</b> : '/api/employees/employees{id}'
  </pre>
  
- **Update an existing employee:**
  <pre>
  <b>PUT</b> : '/api/employees'
  </pre>
  
- **Delete an employee by ID:**
  <pre>
  <b>DELETE</b> : '/api/employees/employees{id}'
  </pre>
  
## Authentication and Authorization
Ensuring the security of the API is very important, and this project uses Spring Security to achieve just that. Spring Security offers a robust framework for authentication and authorization, allowing to safeguard the endpoints against unauthorized access effectively. Spring Security give the flexibility to customize authentication mechanisms, such as username-password authentication to suit the application's specific needs.

![Rest API Endpoints](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/0fcef0d3-72e1-4ad8-bea4-5e40eb87e16b)

Additionally, in this project it's define access control policies, such as role-based access control (RBAC) to restrict or grant access to different parts of the API based on user roles or specific attributes. 

![Users   Roles](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/b4f3cd62-0a92-4d3d-9329-86261aa3adc7)

![Spring Security](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/f4acdcea-c0e7-4136-a85d-fd1fd33cd34b)

## Exception Handling
Exception handling is a crucial aspect of any robust application, and this project employs advanced mechanisms to handle exceptions gracefully, thereby enhancing the overall user experience. By providing detailed error messages, this API can assists developers and end-users alike in understanding the nature of encountered issues, facilitating troubleshooting and resolution.

## Spring Boot Dependencies
- **Spring Web** - This dependency help to quickly set up and configure web-related functionalities, such as handling HTTP requests, serving static resources, and managing web application contexts.
- **Dev Tools** - This is a tool used for enhancing developer productivity in Spring Boot applications. It enables automatic application restarts, hot swapping of code changes, and enhanced error reporting during development. 
- **Spring Data JPA** - This is a dependency used in Spring Boot applications to simplify the setup and configuration of data access using the Java Persistence API (JPA). It provides pre-configured Spring beans, annotations, and utilities to interact with relational databases using JPA, allowing developers to easily implement database operations such as CRUD (Create, Read, Update, Delete) operations and queries.
- **Spring Security** - It is used to add authentication and authorization features to Spring Boot applications, ensuring that only authorized users can access certain parts of the application.
- **Spring MySQL Driver** - This driver is used for connecting Spring Boot applications to MySQL databases. It facilitates communication between the application and the MySQL database, enabling data retrieval, manipulation, and storage.

## MySQL Database and JPA / Hibernate
This API use MySQL database with JPA (Java Persistence API) and Hibernate. MySQL serves as the relational database management system, facilitating the storage of employee-related information and JPA with Hibernate, provides a powerful framework for mapping Java objects to relational database tables, thus streamlining the interaction between the application and the MySQL database. This integration abstracts away much of the complexity associated with database operations.

![Database Schema](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/ab2f9c45-59fd-431b-827b-e4991bca104c)

## Gallery

- Get all the employees from database:
  
![GET ALL EMPLOYEES](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/9cc4aea3-556d-42d5-abd3-ad781d80a272)

- Get employee by id:
  
![GET EMPLOYEE BY ID](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/9bf85201-bf47-43bc-870b-5e3e49dd4ab3)

- Create a new employee:

![POST OK](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/062fa828-5282-4f18-b442-fb133ccde41e)

- Database before and after creating a new employee:

![POST DATABASE](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/f6350458-2409-4ffb-8afb-d89dfb7edbe4)

- Updating an employee:

![PUT OK](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/603398d7-37cb-4f5e-ab1b-517e1b52531e)

- Database before and after updating an employee:

![DATABASE AFTER PUT](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/e44ab707-e938-4314-9c66-08edf6742666)

- Deleting an employee:
  
![DELETE REQUEST](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/7e8d3991-654d-4b8a-ace0-6903ad5a47a1)

- Database before and after deleting an employee:

![DATABASE DELETE](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/6fa29af8-2d7b-447d-970c-57563089eab2)

- BAD id for get employee:

![BAD ID FOR GET](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/f807f157-757f-4b10-a364-0b8d8103a3ee)

- Unauthorized creating a new employee:

![FOPRBIDDEN POST](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/ef40da51-4dda-4356-9be1-3c45aa136764)

- Unauthorized deleting a new employee:
  
![FORBIDDEN DELETE](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/ec287881-2e9f-4a89-b887-e0c3a7d6c31c)

- Unauthenticated (bad password):

![BAD password](https://github.com/FlorianIanculescu/Employee-Managemenet-System/assets/46021975/136f30fc-6e0c-4dff-be61-56b7b5658c5c)

## License
The code in this repository is not licensed in any way.
