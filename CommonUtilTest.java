package org.example.helper;

import org.junit.Assert;
import org.junit.Test;

public class CommonUtilTest {
  @Test
  public void successTest(){
    Assert.assertEquals(3, CommonUtil.sum(1, 2));
  }

  @Test
  public void testMethodPrimeNumber(){Assert.assertEquals("Prime Number", CommonUtil.primeNumberValidation(2));}

  @Test
  public void testMethodNotPrimeNumber(){Assert.assertEquals("Not Prime Number", CommonUtil.primeNumberValidation(1));}

  @Test
  public void testMethodEvenNumber(){Assert.assertEquals("Ganjil", CommonUtil.evenOrOdd(3));}

  @Test
  public void testMethodOddNumber(){Assert.assertEquals("Genap", CommonUtil.evenOrOdd(2));}

  @Test
  public void testMethodDivByString(){Assert.assertEquals(0, CommonUtil.div(9, "asd"));}

  @Test
  public void testMethodDivByZero(){Assert.assertEquals(0, CommonUtil.div(9, "0"));}

  @Test
  public void testMethodDivSuccess(){Assert.assertEquals(12, CommonUtil.div(144,"12"));}




}