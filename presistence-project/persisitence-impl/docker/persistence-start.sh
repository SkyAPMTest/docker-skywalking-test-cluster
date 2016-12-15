#!/usr/bin/env bash

SKYWALKING_AGENT_FILE="/usr/skywalking/agent/skywalking-agent.jar"
SKYWALKING_OPTS=""

if [ ! -f "$SKYWALKING_AGENT_FILE" ]; then
    echo "skywalking agent file cannot be found."
else
    SKYWALKING_OPTS=" -Dusername=${USER_NAME} -DapplicationCode=${APPLICATION_CODE} -Dservers=${SERVER_LIST} -Dagent=${SKYWALKING_AGENT_FILE} -javaagent:$SKYWALKING_AGENT_FILE"
fi

$JAVA_HOME/bin/java $SKYWALKING_OPTS -jar /etc/skywalking/persistence-server/persistence-server.jar