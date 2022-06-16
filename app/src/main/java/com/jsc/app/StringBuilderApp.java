package com.jsc.app;

/**
 * StringBuffer butuh pararel agar thread safe tapi tidak
 * optimal, sedangkan StringBuilder kebalikannya
 *
 * Note: Pararel adalah mengerjakan sesuatu secara bersamaan
 * */

public class StringBuilderApp {
  public static void main(String[] args) {
    // Tanpa StringBuilder
    String nama = "Adi";
    nama += " Cahya";
    nama += " Saputra";

    System.out.println(nama);

    // Yg terjadi di memori adalah :
    // Adi
    // Adi Cahya
    // Adi Cahya Saputra

    // Menggunakan StringBuilder
    StringBuilder builder = new StringBuilder();
    builder.append("Adi");
    builder.append(" Cahya");
    builder.append(" Saputra");

    String fullname = builder.toString(); // Cuma 1 slot di memori

    System.out.println(fullname);

  }
}
