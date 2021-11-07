FROM maven:3.8.2-jdk-11

COPY . .

RUN mvn -DskipTests=true package

# set the startup command to execute the jar
CMD ["java", "-jar", "target/animebot-1.0-SNAPSHOT-jar-with-dependencies.jar"]