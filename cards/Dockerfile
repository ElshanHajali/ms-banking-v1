FROM openjdk:17-slim as build

COPY build/libs/cards-0.0.1.jar /app/

WORKDIR /app/

ENTRYPOINT ["java"]

CMD ["-jar", "cards-0.0.1.jar"]