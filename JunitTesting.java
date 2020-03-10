package org.example.helper;

import org.junit.Assert;
import org.junit.Test;

public class JunitTesting {
    @Test
    public void testBilanganPrima(){
        Assert.assertEquals(true, YangMauDiCek.bilanganPrima(11) );
    }
    @Test
    public void testGenapGanjil(){
        Assert.assertEquals(false, YangMauDiCek.ganjilGenap(1));
    }
    @Test()
    public void testAritmaticException() {
        try{
            YangMauDiCek.pembagian("10", "5");
        }
        catch (ArithmeticException e){

        }
    }
}
