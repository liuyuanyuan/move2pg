@echo off
set APP_HOME=%cd%
echo %APP_HOME%
::set JAVA_HOME=%APP_HOME%\jre8_win64
echo %JAVA_HOME%
"%JAVA_HOME%\bin\java.exe" -classpath "%APP_HOME%\dist\orcl2pg.jar" -Djava.ext.dirs="%JAVA_HOME%\lib\ext"; -Xms256m -Xmx512m lyy.pg.orcl.view.MainView
pause