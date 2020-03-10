package org.example.helper;

import org.junit.Assert;
import org.junit.Test;

public class CommonUtilTest {
  @Test
  public void successTest(){
    Assert.assertEquals(3, CommonUtil.sum(1, 2));
  }
}
