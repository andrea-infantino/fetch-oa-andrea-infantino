# Use a base image with Java runtime
FROM openjdk:17-jdk-slim

# Create a working directory
WORKDIR /app

# Copy the compiled JAR into the container
COPY target/*.jar app.jar

# Expose the default Spring Boot port
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
