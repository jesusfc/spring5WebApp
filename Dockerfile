FROM openjdk:11-jdk-oracle
COPY "./target/spring5WebApp-0.0.1-SNAPSHOT.jar" "spring5WebApp.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring5WebApp.jar"]