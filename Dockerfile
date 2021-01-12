
FROM openjdk:8-jdk-alpine
VOLUME /temp
ADD target/demo-0.0.1-SNAPSHOT.war app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar"]