package com.jsc.app;

import java.util.StringTokenizer;

public class StringTokenizerApp {
  public static void main(String[] args) {
    String name = "Adi Cahya Saputra";

    // sama aja kek split
    StringTokenizer tokenizer = new StringTokenizer(name, " "); // string, delimiter

    while(tokenizer.hasMoreTokens()) { // ketika di nextToken nin masih ada, maka..
      String token = tokenizer.nextToken(); // tapi dia bakal motong str nya ketika method ini dipanggil / lazy split

      System.out.println(token);
    }

  }
}
