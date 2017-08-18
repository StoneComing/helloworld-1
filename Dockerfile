FROM openjdk:latest

WORKDIR /home/apps/
ADD target/app.tar.gz .

ENTRYPOINT ["java", "-jar", "/home/apps/helloworld-1.0.0-SNAPSHOT.jar"]