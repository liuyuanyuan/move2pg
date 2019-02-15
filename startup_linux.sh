#!/bin/bash
export APP_HOME=$(cd "$(dirname "$0")";pwd)
echo $APP_HOME
#export JAVA_HOME=$currpaths/jre8_linux64
echo $JAVA_HOME
$JAVA_HOME/bin/java  -cp "$APP_HOME/dist/orcl2pg.jar"  -Xms256m -Xmx512m  lyy.pg.orcl.view.MainView
