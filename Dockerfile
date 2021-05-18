FROM openjdk:11

ADD target/DB_LAB_4-6-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
