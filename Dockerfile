FROM openjdk:17-jdk-alpine

WORKDIR     /app

COPY build/libs/userService-1.0-SNAPSHOT.jar app.jar


RUN ./gradlew shadowJar

EXPOSE 8080

CMD [ "java", "-jar", "app.jar" ]
