FROM openjdk:17

WORKDIR /app

COPY target/HealthProject4-0.0.1-SNAPSHOT.jar /app

EXPOSE 8083

CMD ["java", "-jar", "HealthProject4-0.0.1-SNAPSHOT.jar"]