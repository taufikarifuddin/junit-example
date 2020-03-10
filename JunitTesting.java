package org.example.helper;

import org.junit.Assert;
import org.junit.Test;

public class JunitTesting {
    @Test
    public void testBilanganPrima(){
        Assert.assertEquals(true, YangMauDiCek.bilanganPrima(11) );
    }
    @Test
    public void testBilanganPrima2(){
        Assert.assertEquals(false, YangMauDiCek.bilanganPrima(8) );
    }
    @Test
    public void testGenapGanjil(){
        Assert.assertEquals(false, YangMauDiCek.ganjilGenap(1));
    }
    @Test
    public void testGenapGanjil2(){
        Assert.assertEquals(true, YangMauDiCek.ganjilGenap(2));
    }
    @Test
    public void testAritmaticException() {
        try{
            YangMauDiCek.pembagian("10", "0");
        }
        catch (ArithmeticException e){

        }
    }
    @Test
    public void testPembagi2(){
        try{
                YangMauDiCek.pembagian("aaaa", "aaa");
            }
            catch (RuntimeException e) {
            }
    }

}
