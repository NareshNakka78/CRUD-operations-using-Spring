# CRUD-operations-using-Spring
This project demonstrates the implementation of CRUD (Create, Read, Update, Delete) operations using the Spring Framework. It is designed as a practical example for managing data in a RESTful API architecture. The application interacts with a database to perform these operations seamlessly, showcasing the capabilities of the Spring ecosystem.

Features
Create: Add new records to the database.
Read: Retrieve records from the database (single or multiple).
Update: Modify existing records.
Delete: Remove records from the database.

Technologies Used
Spring Boot: For building and running the application.
Spring Data JPA: For interacting with the database.
MySQL: Database management.
Lombok: To reduce boilerplate code.
Maven: Dependency management and build tool.
Postman: For API testing.

How to Run the Project
1. Clone the repository:
   git clone <repository-url>
2. Navigate to the project directory:
   cd <project-folder>
3. Configure the database in application.properties (or application.yml):
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
4. Run the application:
   mvn spring-boot:run
5. Access the APIs through http://localhost:8080/api/v1/ (adjust based on your configuration).

API Endpoints
POST /create: Add a new record.
GET /read/{id}: Retrieve a record by ID.
GET /read-all: Retrieve all records.
PUT /update/{id}: Update a record by ID.
DELETE /delete/{id}: Delete a record by ID.



