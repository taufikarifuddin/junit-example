package org.example.helper;

import com.sun.org.apache.xerces.internal.impl.dv.DatatypeException;

public class CommonUtil {
  public static int sum(int bil1, int bil2){
    return bil1 + bil2;
  }

  public static String evenOrOdd(int number){
    if(number%2 != 0)
      return "Ganjil";

    return "Genap";
  }

  public static String primeNumberValidation(int number){
      if(number >= 2){
        for(int i = 2; i < number; i++){
          if(number%i == 0)
            return "Not Prime Number";
        }
        return "Prime Number";
      }
      return "Not Prime Number";
  }

  public static int div(int bil1, String bil2){
    try {
        int temp = Integer.parseInt(bil2);
        return bil1/temp;
    }catch (ArithmeticException e){
        return 0;
    }catch (NumberFormatException e){
        return 0;
    }
  }
}