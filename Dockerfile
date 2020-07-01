FROM navikt/java:11-appdynamics
ENV CLASSPATH /asd
COPY ./test/ /asd/test
ENTRYPOINT ["/bin/bash", "-c", "cd /asd && javac test/Test.java && java -Dhttps.protocols=\"TLSv1.2\" test.Test && sleep 10"]
