FROM java:8-jdk-alpine

COPY target/hackathon-time-api-0.0.1-SNAPSHOT.jar /usr/app/

COPY src/main/resources/latlongdata.csv /usr/app/
COPY src/main/resources/sarjapur_osm_nodes.txt /usr/app/
COPY src/main/resources/sample_routes_data_0.json /usr/app/
COPY src/main/resources/sample_routes_data_1.json /usr/app/
COPY src/main/resources/sample_routes_data_2.json /usr/app/
COPY src/main/resources/sample_routes_data_3.json /usr/app/
COPY src/main/resources/sample_routes_data_4.json /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch hackathon-time-api-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","hackathon-time-api-0.0.1-SNAPSHOT.jar"]