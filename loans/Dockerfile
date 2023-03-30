FROM openjdk:17-slim as build

COPY build/libs/loans-0.0.1.jar /app/

WORKDIR /app/

ENTRYPOINT ["java"]

CMD ["-jar", "loans-0.0.1.jar"]