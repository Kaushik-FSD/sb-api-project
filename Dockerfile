FROM eclipse-temurin:21-jdk-jammy AS build
LABEL authors="vivekanand"

WORKDIR /app

COPY . .

RUN chmod +x ./mvnw && ./mvnw clean package -DskipTests


FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]