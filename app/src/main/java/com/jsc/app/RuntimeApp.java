package com.jsc.app;

public class RuntimeApp {
  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime(); // Bukan memory di hardware tapi yg dari JVM (yg buat nge jalanin java)
    System.out.println("Available Processors " + runtime.availableProcessors());
    System.out.println("Free Memory " + runtime.freeMemory());
    System.out.println("Total Memory " + runtime.totalMemory());
    System.out.println("Max Memory " + runtime.maxMemory());
  }
}
