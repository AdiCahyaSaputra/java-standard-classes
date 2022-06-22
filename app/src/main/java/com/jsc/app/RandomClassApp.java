package com.jsc.app;

import java.util.Random;

public class RandomClassApp {
  public static void main(String[] args) {
    Random random = new Random();

    for(short i = 0; i <= 10; i++) {
      int randomNum = random.nextInt(100); // random dari 0 - 100
      System.out.println(randomNum);
    }

  }
}
