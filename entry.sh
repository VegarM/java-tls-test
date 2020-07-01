#!/bin/bash
java test/Test.java
echo Testing with TLS 1.2
java -Dhttps.protocol="TLSv1.2" test.Test
echo Testing with TLS 1.3
java -Dhttps.protocol="TLSv1.3" test.Test
echo Testing with default
java test.Test

