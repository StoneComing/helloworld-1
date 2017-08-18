FROM 10.162.197.95:5000/cse-jre:8u111

WORKDIR /home/apps/
ADD target/app.tar.gz .

ENTRYPOINT ["java", "-jar", "/home/apps/helloworld-1.0.0-SNAPSHOT.jar"]

