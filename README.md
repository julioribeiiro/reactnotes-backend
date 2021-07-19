# Notes App
## Spring Boot, Postgres, JPA, Rest API Tutorial
Build Restful CRUD API for a simple notes application using Spring Boot, Postgres and JPA.

## Requirements
  1. Java - 1.8.x
  2. Maven - 3.x.x

## Setup
1. Clone the application

    `git clone git@github.com:julioribeiiro/reactnotes-backend.git`

2. Build Postgres Server in Docker

    `docker run --name postgres-server -dp 5432:5432 -e POSTGRES_PASSWORD=docker postgres`

3. Build and run the app using maven

    `mvn spring-boot:run`

The app will start running at http://localhost:8080.

## Explore Rest APIs Swagger

http://localhost:8080/swagger

You can test them using postman or any other rest client.
