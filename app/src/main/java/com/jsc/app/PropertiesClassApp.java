package com.jsc.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClassApp {
  public static void main(String[] args) {
    try {
      Properties properties = new Properties();
      properties.load(new FileInputStream("~/storage/shared/JavaNIDE/javastandardclasses/app/src/main/java/com/jsc/config.properties")); // ya suka suka si java nya aja dah

      System.out.println(properties.getProperty("database.name"));
    } catch(IOException err) {
      System.out.println("gagal nge load " + err);
    }

    // update 
    try {
      Properties properties = new Properties();
      properties.put("nama", "adi");
      properties.store(new FileOutputStream("name.properties"), "");
    } catch(IOException err) {
      System.out.println(err);
    }
  }
}
