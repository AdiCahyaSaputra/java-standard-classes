package com.jsc.app;

/**
 * Imutable Object 
 * ketika kita memanipulasi string, maka java akan
 * membuat object string baru / tidak menimpa string
 * yang lama.
 *
 * Note: Jika data sudah banyak, tidak di sarankan
 * menggunakan string. Gunakan string buffer atau 
 * string builder
 * */

public class StringApp {
  public static void main(String[] args) {
    String name = "Adi Cahya Saputra";
    String nameLower = name.toLowerCase();
    String nameUpper = name.toUpperCase();

    System.out.println(name);
    System.out.println(nameLower);
    System.out.println(nameUpper);

    System.out.println(name.length());

    String[] names = name.split(" ");
    for(String nameSplitted : names) {
      System.out.println(nameSplitted);
    }

    System.out.println(name.startsWith("Adi"));
    System.out.println(name.endsWith("Saputra"));

    // System.out.println(" ".isBlank());
    System.out.println(" ".isEmpty());
    System.out.println("".isEmpty());
  }
}






