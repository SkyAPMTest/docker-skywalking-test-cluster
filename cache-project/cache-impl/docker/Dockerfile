FROM openjdk:8-jdk

ENV USER_NAME=test \
    APPLICATION_CODE=test \
    SERVER_LIST=127.0.0.1:34000

RUN mkdir -p /etc/skywalking/agent && mkdir -p /etc/skywalking/cache-server/libs

COPY cache-server.jar /etc/skywalking/cache-server
ADD libs /etc/skywalking/cache-server/libs
COPY cache-start.sh /etc/skywalking/cache-server
RUN chmod +x /etc/skywalking/cache-server/cache-start.sh

VOLUME /etc/skywalking/agent
ENTRYPOINT ["/etc/skywalking/cache-server/cache-start.sh"]