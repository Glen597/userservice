FROM openjdk:17-jdk-alpine

WORKDIR     /app

COPY . .

RUN chmod +x ./gradlew

RUN ./gradlew shadowJar

EXPOSE 8080

CMD [ "java", "-jar", "build/libs/userService-1.0-SNAPSHOT-all.jar" ]
