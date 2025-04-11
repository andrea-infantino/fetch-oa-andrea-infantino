# Fetch Online Assessment - Andrea Infantino
This repo is my solution to the exercise that can be found [here](https://github.com/fetch-rewards/receipt-processor-challenge).

It a simple webservice built with Java Spring Boot. It is fully containerized using Docker, making it easy to test and deploy without needing to install Java or Maven locally.

## Technologies Used
- Java 17
- Spring Boot 3
- Maven
- Docker

## How to Build and Run with Docker
> No need to install Java or Maven on your machine — Docker takes care of everything.

### 1. Move to the Project Directory
```bash
cd fetch-oa
```

### 2. Build the Project
```bash
mvn clean package
```
This will generate a JAR file in the `target` directory.

### 3. Build the Docker Image
```bash
docker build -t fetch-oa .
```
This uses the included `Dockerfile` to package the application into a Docker image.

### 4. Run the Docker Container
```bash
docker run -p 8080:8080 fetch-oa
```
This will start the application and map port 8080 of the container to port 8080 of your local machine.

You can now access the application at `http://localhost:8080`.