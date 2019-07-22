FROM openjdk:8

RUN mkdir /backend
WORKDIR /backend
COPY ./gradlew /backend
COPY ./build.gradle /backend
COPY ./settings.gradle /backend
COPY ./src /backend/src
COPY ./gradle /backend/gradle
ENTRYPOINT ["sh", "./gradlew", "bootRun"]