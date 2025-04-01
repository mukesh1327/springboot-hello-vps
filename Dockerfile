# Stage 2: Runtime stage using OpenJDK runtime
FROM registry.access.redhat.com/ubi9/openjdk-17

WORKDIR /app

# # Copy the jar file from the build stage
COPY ./target/springboot-hello.jar springboot-hello.jar

# Expose the port the application will run on
EXPOSE 9001

# Entry point for the application
ENTRYPOINT ["java", "-jar", "springboot-hello.jar"]