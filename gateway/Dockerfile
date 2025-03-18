FROM openjdk:21-jdk-slim

WORKDIR /app
COPY . .

RUN chmod +x gradlew
RUN ./gradlew :wrapper
RUN ./gradlew :gateway:clean :gateway:build -x test

EXPOSE 8080

CMD ["java", "-jar", "gateway/build/libs/gateway.jar"]
