# Base com Java 17
FROM eclipse-temurin:17-jdk-alpine

# Diretório da aplicação
WORKDIR /app

# Copiar JAR gerado
COPY build/libs/subscription-service-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta 8083
EXPOSE 8083

# Executar o app
ENTRYPOINT ["java", "-jar", "app.jar"]
