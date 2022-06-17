package com.jsc.app;

import java.math.BigInteger;

public class BigNumber {
  public static void main(String[] args) {
    BigInteger x = new BigInteger("10000000000000000000"); // pake ini jika Long masih kurang banyak
    BigInteger y = new BigInteger("10000000000000000000"); // pake ini jika Long masih kurang banyak
    
    BigInteger tambah = x.add(y); // operasi math nya g pake operator + tapi pake method. add(), subsract(), multiply(), divide, 

    System.out.println(tambah);
    System.out.println(tambah instanceof BigInteger);
     
    // BigDecimal y = new BigDecimal("100000000000"); // pake ini jika double masih kurang banyak (floating point)
  }
}
