package com.jsc.app;
import java.util.Scanner;

public class ScannerApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // System.in itu artinya dari konsol / terminal (sebenernya bisa dari mana aja sih, dari file kek atau dimana)

    System.out.println("Hallo, nama mu siapa ? ");
    String name = scanner.nextLine(); // untuk membaca nilai string 

    System.out.println("Umur mu berapa ? ");
    int age = scanner.nextInt(); // untuk membaca nilai int

    System.out.println("Hallo " + name + ", umur mu " + age + ". Salam Kenal yah");
    scanner.close();
  
  }
}
