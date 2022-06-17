package com.jsc.app;

public class MathApp {
  public static void main(String[] args) {

    int min = Math.min(200, 560);
    int max = Math.max(600, 601);

    System.out.println(min);
    System.out.println(max);

    short r = 7;
    int circle = (int) Math.floor(Math.PI * ( r * r ));

    System.out.println(circle);

  }
}
