package com.jsc.app;

import java.util.Objects;

public class ObjectsClassApp {
  public static class DataApp {
    private String data;

    public DataApp(String data) {
      this.data = data;
    }

    public String getData() {
      return this.data;
    }

    public void setData(String data) {
      this.data = data;
    }

    public boolean equals(Object o) {
      if(this == o) return true;
      if(o == null || getClass() != o.getClass()) return false;
      DataApp data1 = (DataApp) o;
      return this.data != null ? this.data.equals(data1.data) : data1.data == null;
    }

    public int hashCode() {
      return this.data != null ? this.data.hashCode() : 0;
    }

    public String toString() {
      return "" + this.data + "";
    }

  }

  public static void main(String[] args) {
    execute(new DataApp("Adi"));

  }

  public static void execute(DataApp data) {
    // di cek dulu biar g null
    /*
    if(data != null) {
      System.out.println(data.toString()); // NullPointerException jika null
      System.out.println(data.hashCode()); // 0 jika null
    }*/

    // atau pake Objects 
    System.out.println(Objects.toString(data));
    System.out.println(Objects.hashCode(data));
  }
}
