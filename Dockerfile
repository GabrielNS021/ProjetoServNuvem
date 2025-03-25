FROM alpine:latest

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/*.jar backend.jar

EXPOSE 8080

CMD ["java", "-jar", "backend.jar", "--server.port=25000"]
