FROM java:8-jdk-alpine

COPY ./target/Spring_App-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch Spring_App-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","Spring_App-0.0.1-SNAPSHOT.jar"]
