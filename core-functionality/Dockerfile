FROM openjdk:21-jdk-slim

WORKDIR /app
COPY . .

RUN chmod +x gradlew
RUN ./gradlew :wrapper
RUN ./gradlew :core-functionality:clean :core-functionality:build -x test

EXPOSE 8080

CMD ["java", "-jar", "core-functionality/build/libs/core-functionality.jar"]
