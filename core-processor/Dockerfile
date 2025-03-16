FROM openjdk:21-jdk-slim

WORKDIR /app
COPY . .

RUN chmod +x gradlew
RUN ./gradlew :wrapper
RUN ./gradlew :core-processor:clean :core-processor:build -x test

EXPOSE 8080

CMD ["java", "-jar", "core-processor/build/libs/core-processor.jar"]
