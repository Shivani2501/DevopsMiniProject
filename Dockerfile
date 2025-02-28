FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/SPE_MP-1.0-SNAPSHOT.jar scientific-calculator.jar
CMD ["java", "-jar", "scientific-calculator.jar"]