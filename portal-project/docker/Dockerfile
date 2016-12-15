FROM tomcat:8.0.39-jre8

ENV USER_NAME=test \
    APPLICATION_CODE=test \
    SERVER_LIST=127.0.0.1:34000

RUN mkdir -p /usr/local/skywalking/agent

COPY catalina.sh /usr/local/tomcat/bin
ADD portal.war /usr/local/tomcat/webapps

VOLUME /usr/local/skywalking/agent
RUN chmod +x /usr/local/tomcat/bin/*.sh

EXPOSE 8080

ENTRYPOINT ["/usr/local/tomcat/bin/catalina.sh", "jpda", "run"]




