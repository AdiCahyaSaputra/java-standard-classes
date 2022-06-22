package com.jsc.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
  public static void main(String[] args) {
    String text = "Adi Cahya Saputra Programmer Akhir Zaman";
    Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

    Matcher match = pattern.matcher(text);

    while(match.find()) {
      System.out.println(match.group());
    }
    
  }
}
