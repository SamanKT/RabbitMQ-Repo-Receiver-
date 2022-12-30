FROM maven:3.8.3-openjdk-17 as build-maven
WORKDIR /maven
COPY rabbitmq-microservice-receiver/pom.xml .
RUN cd rabbitmq-microservice-receiver && mvn dependency:go-offline -B
COPY rabbitmq-microservice-receiver/src src
RUN cd rabbitmq-microservice-receiver && mvn install -DskipTests


FROM openjdk:17
COPY --from=build-maven maven/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"] 