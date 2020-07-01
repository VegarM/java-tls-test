FROM navikt/java:11-appdynamics
ENV CLASSPATH /asd
COPY ./test/ /asd/test
COPY ./entry.sh /asd/entry.sh
WORKDIR /asd
ENTRYPOINT []

CMD ["./entry.sh"]
