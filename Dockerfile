FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/Final_Project-0.0.1-SNAPSHOT.jar finalproject.jar
ENTRYPOINT ["java", "-jar", "finalproject.jar"]
