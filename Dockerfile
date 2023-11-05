FROM  tomcat:9.0.82-jdk11-temurin-focal
COPY build/libs/myapp610-0.1-plain.war $CATALINA_HOME/webapps/ROOT.war