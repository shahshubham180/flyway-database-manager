FROM openjdk:11
EXPOSE 8082
ADD target/flyway-database-manager-0.0.1-SNAPSHOT.jar flyway-database-manager-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/flyway-database-manager-0.0.1-SNAPSHOT.jar"]