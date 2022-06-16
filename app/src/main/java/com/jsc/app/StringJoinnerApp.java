package com.jsc.app;

import java.util.StringJoiner;

public class StringJoinnerApp {
  public static void main(String[] args) {
    String[] nama = { "Adi", "Cahya", "Saputra" };
    StringJoiner joiner = new StringJoiner("-", "|", "|"); // delimiter, prefix, suffix

    for(String n : nama) {
      joiner.add(n); // string nya 
    }

    System.out.println(joiner.toString());
  }
}
