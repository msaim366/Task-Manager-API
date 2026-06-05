# Task Manager Application

A backend task management application built using Spring Boot, PostgreSQL, and Docker. The application provides RESTful APIs for creating, retrieving, updating, and deleting tasks while storing data in a PostgreSQL database.

## Technologies Used

* Java 21
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Docker
* Docker Compose
* Maven

## Features

* Create tasks
* View tasks
* Update tasks
* Delete tasks
* PostgreSQL database persistence
* Containerized deployment using Docker

## Project Structure

```text
src/
├── main/
│   ├── java/
│   └── resources/
├── test/
pom.xml
Dockerfile
docker-compose.yml
```

## Running with Docker

### Prerequisites

* Docker Desktop installed

### Build and Run

```bash
docker compose up --build
```

The application will start on:

```text
http://localhost:8080
```

The PostgreSQL database will run on:

```text
localhost:5432
```

### Stop the Application

```bash
docker compose down
```

## Database Configuration

PostgreSQL is configured through Docker Compose and automatically starts with the application.

Database Name: taskdb

Username: postgres

Password: postgres

## Author

Saim Muhammad
Bachelor of Software Engineering
Macquarie University
