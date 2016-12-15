FROM openjdk:8-jdk

ENV USER_NAME=test \
    APPLICATION_CODE=test \
    SERVER_LIST=127.0.0.1:34000

RUN mkdir -p /etc/skywalking/agent && mkdir -p /etc/skywalking/persistence-server/libs

COPY persistence-server.jar /etc/skywalking/persistence-server
ADD libs /etc/skywalking/persistence-server/libs
COPY persistence-start.sh /etc/skywalking/persistence-server
RUN chmod +x /etc/skywalking/persistence-server/persistence-start.sh

VOLUME /etc/skywalking/agent

WORKDIR /etc/skywalking/persistence-server
CMD ["/etc/skywalking/persistence-server/persistence-start.sh"]