package com.jsc.app;

import java.util.Base64;

public class Base64App {
  public static void main(String[] args) {
    String ori = "Adi Cahya Saputra";
    String encoded = Base64.getEncoder().encodeToString(ori.getBytes());

    System.out.println(encoded);

    // decode 
    byte[] decoded = Base64.getDecoder().decode(encoded); // return nya array byte
    String result = new String(decoded);

    System.out.println(result);
  }
}
