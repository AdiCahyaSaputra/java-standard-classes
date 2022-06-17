package com.jsc.app;

public class NumberClassApp {
  public static void main(String[] args) {
    // Setiap tipe data number tidak primitif pasti punya method bawaan buat nge convert number
    Integer intValue = 17;
    Double doubleValue = intValue.doubleValue();
    Long longValue = doubleValue.longValue();

    // Konversi str ke number (primitif)
    String x = "275";
    int xInt = Integer.parseInt(x);
    double xDouble = Double.parseDouble(x);

    // konversi str ke number (non primitif)
    Integer xInteger = Integer.valueOf(x);
    Long xLong = Long.valueOf(x);

  }
}


