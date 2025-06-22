FROM eclipse-temurin:17-jdk-alpine
COPY build/libs/*.jar health-check-service.jar
ENTRYPOINT ["java", "-jar", "/health-check-service.jar"]