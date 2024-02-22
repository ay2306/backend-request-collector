FROM openjdk:17-jdk-slim AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN chmod +x ./mvnw
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR demo


ARG _DB_ADDRESS
ARG _DB_PORT
ARG _DB_DATABASE
ARG _DB_USERNAME
ARG _DB_PASSWORD
# Setting ENV variables
ENV DB_ADDRESS=${_DB_ADDRESS}
ENV DB_PORT=${_DB_PORT}
ENV DB_DATABASE=${_DB_DATABASE}
ENV DB_USERNAME=${_DB_USERNAME}
ENV DB_PASSWORD=${_DB_PASSWORD}

COPY --from=build target/*.jar brcApplication.jar
ENTRYPOINT ["java", "-jar", "brcApplication.jar"]