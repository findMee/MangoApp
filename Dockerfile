FROM openjdk:8
COPY ./build/libs/mango-0.0.1.jar mango-0.0.1.jar
CMD ["java","-jar", "mango-0.0.1.jar"]