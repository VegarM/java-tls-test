#!/bin/bash
set -x

javac test/Test.java
java test.Test

# wget -v -O - https://google.com
# wget -v -O - https://login.microsoftonline.com/NAVtestB2C.onmicrosoft.com/v2.0/.well-known/openid-configuration?p=B2C_1A_idporten_ver1

# for v in 1 2 3; do
#   java -Dhttps.protocols="TLSv1.${v}" test.Test
# done

# java -Djdk.tls.client.protocols="TLSv1,TLSv1.1,TLSv1.2" -Dhttps.protocols="TLSv1,TLSv1.1,TLSv1.2" -Djavax.net.debug="all" test.Test
