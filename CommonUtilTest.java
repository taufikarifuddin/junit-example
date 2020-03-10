package org.example.helper;

import org.junit.Assert;
import org.junit.Test;

public class CommonUtilTest {
  @Test
  public void successTest(){
    Assert.assertEquals(3, CommonUtil.sum(1, 2));
  }

  @Test
  public void testMethod1(){Assert.assertEquals("Prime Number", CommonUtil.primeNumberValidation(2));}

  @Test
  public void testMethod2(){Assert.assertEquals("Ganjil", CommonUtil.evenOrOdd(3));}

  @Test
  public void testMethod(){Assert.assertEquals(0, CommonUtil.div(9, "asd"));}
}