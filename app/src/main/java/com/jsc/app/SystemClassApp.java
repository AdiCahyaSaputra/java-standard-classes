package com.jsc.app;

public class SystemClassApp {
  public static void main(String[] args) {
    // untuk mendapatkan waktu saat ini dalam milisecond
    System.out.println(System.currentTimeMillis());
    // untuk mendapatkan waktu saat ini dalam nanosecond
    System.out.println(System.nanoTime());

    // env variable di system 
    System.out.println(System.getenv("HOME"));

    // exit program java 
    System.exit(0); // bahkan langsung nge close IDE nya
    System.out.println("Saya tidak tampil");
  }
}
