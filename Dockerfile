FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/gateway-0.0.1-SNAPSHOT.jar /app/gateway.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "gateway.jar"]
