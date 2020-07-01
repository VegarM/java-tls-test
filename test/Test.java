package test;

import java.io.InputStreamReader;
import java.net.URL;

public class Test {
  public static void main(String[] args) throws Exception {
    get("https://login.microsoftonline.com"); // get the crypto stuff initialized, seems to increase changes of the problem appearing
    get("https://google.com"); // get the crypto stuff initialized, seems to increase changes of the problem appearing
  }

  private static void get(String u) {
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
        System.out.println(u + " ok");
      }
    } catch (Exception e) {
      System.out.println(u + " not ok");
      e.printStackTrace();
    }
  }
}
