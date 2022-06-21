package com.jsc.app;

import java.util.UUID;

public class UUIDapp {
  public static void main(String[] args) {
    // Generate 10 UUID (Universal Unique Identifier)
    for(short i = 0; i <= 10; i++) {
      UUID uuid = UUID.randomUUID();
      String stringUUID = uuid.toString();
      System.out.println(stringUUID);
    }
  }
}
