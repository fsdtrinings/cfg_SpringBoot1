FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/MovieBookingService-1.jar app.jar

EXPOSE 7003

ENTRYPOINT ["java", "-jar", "app.jar"]