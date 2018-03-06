FROM java:8
VOLUME /tmp
ADD build/libs/Reward*.jar app.jar
EXPOSE 8080
RUN bash -c 'touch /app.jar'

# To see work around for bug, uncomment this line...
#RUN bash -c '([[ ! -d $JAVA_SECURITY_DIR ]] && ln -s $JAVA_HOME/lib $JAVA_HOME/conf) || (echo "Found java conf dir, package has been fixed, remove this hack"; exit -1)'

ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/micros", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar", "-debug"]