# Spring Boot Simple Web Service

This project is a simple web service using Spring Boot, which includes both a backend server and an API endpoint for managing student data.

## Requirements
- Java 17 or later
- Maven or Gradle
- Spring Boot (2.x or 3.x)
- IDE (IntelliJ IDEA, Eclipse, VS Code) or command line tools

## Installation & Setup

### 1. Clone the Repository
```sh
git clone https://github.com/yourusername/springboot-webservice.git
cd springboot-webservice
```

### 2. Build the Project
If using **Maven**:
```sh
mvn clean package
```
If using **Gradle**:
```sh
./gradlew build
```

### 3. Run the Application
If using **Maven**:
```sh
mvn spring-boot:run
```
If using **Gradle**:
```sh
./gradlew bootRun
```
If running as a JAR file:
```sh
java -jar target/springboot-webservice-0.0.1-SNAPSHOT.jar
```

## API Endpoints

### 1. Home Page (Frontend)
- **URL:** `http://localhost:8080/`
- **Description:** Serves the `index.html` page from the `templates/` directory.

### 2. Student API (JSON Response)
- **URL:** `http://localhost:8080/api/students`
- **Method:** GET
- **Response:**
```json
["Alice", "Bob", "Charlie"]
```

## Project Structure
```
src/main/java/com/example/demo/
├── controller/
│   ├── HomeController.java
│   ├── StudentController.java
├── Application.java (Main Spring Boot class)
src/main/resources/
├── static/ (CSS, JS, images)
├── templates/
│   ├── index.html (Frontend page)
├── application.properties (Configuration file)
```

## Configuration
Modify `application.properties` if needed:
```
spring.application.name=SpringBootWebService
server.port=8080
```

## How to Stop the Server
Use **Ctrl + C** to stop the running Spring Boot server.

## License
This project is licensed under the MIT License.

---
### Happy Coding! 🚀