FROM openjdk:11-jre-slim

LABEL org.opencontainers.image.authors="spoljak@profinit.eu"

RUN adduser --system --group app

USER app

WORKDIR /home/app/mosaic

ADD target/mosaics3uploaderlibrary-0.0.1-SNAPSHOT.jar mosaics3uploaderlibrary-0.0.1-SNAPSHOT.jar

EXPOSE 9006

ENTRYPOINT ["java","-jar","mosaics3uploaderlibrary-0.0.1-SNAPSHOT.jar"]