FROM openjdk:17-slim as build

MAINTAINER company.az

COPY build/libs/accounts-0.0.1.jar /app/

WORKDIR /app/

ENTRYPOINT ["java"]

CMD ["-jar", "/app/accounts-0.0.1.jar"]