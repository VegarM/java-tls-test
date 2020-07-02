package test;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.InetAddress;

public class Test {
  public static void main(String[] args) throws Exception {
    while(true) {
      var address = InetAddress.getByName("login.microsoftonline.com");
      get("https://login.microsoftonline.com/NAVtestB2C.onmicrosoft.com/v2.0/.well-known/openid-configuration?p=B2C_1A_idporten_ver1", address.getHostAddress());

      address = InetAddress.getByName("google.com");
      get("https://google.com", address.getHostAddress());
    }
  }

  private static void get(String u, String a) {
    try {
      var url = new URL(u);
      var conn = url.openConnection();
      conn.connect();
      try (var in = conn.getInputStream(); var in2 = new InputStreamReader(in)) {
        var buf = new char[100];
        while(true) {
          int read = in2.read(buf);
          if(read < 100) break;
        }
        System.out.println("[GREP] +++ " + a + ", " + u);
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("[GREP] --- " + a + ", " + u);
    }
  }
}
