package com.jsc.app;

import java.util.Arrays;

public class ArraysApp {
  public static void main(String[] args) {
    int[] numbers = {
      2,4,26,87,55,0,9,56,79,1,7,5,17
    };

    // sort 
    Arrays.sort(numbers);

    // sout array 
    System.out.println(Arrays.toString(numbers));

    // binary search 
    System.out.println(numbers[Arrays.binarySearch(numbers, 55)]);

    // copy
    int[] results = Arrays.copyOf(numbers, 4);
    System.out.println(Arrays.toString(results));

    int[] results2 = Arrays.copyOfRange(numbers, 4, 9);
    System.out.println(Arrays.toString(results2));
  
  }
}
