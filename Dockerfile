# Usa a imagem base do OpenJDK 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo JAR gerado pelo Maven/Gradle
COPY target/*.jar backend.jar

# Expõe a porta 25000
EXPOSE 25000

# Comando para rodar a aplicação
CMD ["java", "-jar", "backend.jar", "--server.port=25000"]
