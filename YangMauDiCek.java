package org.example.helper;

public class YangMauDiCek {
    public static boolean bilanganPrima(int input){
        int x=0;
        for (int i = 2; i <=input ; i++) {

            if(input%i==0){
                x++;
            }
        }
        if(x==1){
            System.out.println("Bilangan Prima");
            return true;
        }
        else{
            System.out.println("BukanBilanganPrima");
            return false;
        }
    }
    public static boolean ganjilGenap(int input){
        if(input %2==0){
            System.out.println("bilangan genap");
            return true;
        }
        else{
            System.out.println("Bilangan ganjil");
            return false;
        }
    }
    public static String pembagian(String bil1, String bil2){
        int i = Integer.parseInt(bil1);
        int j = Integer.parseInt(bil2);
        Integer z = i/j;
        String aa = Integer.toString(z);
        System.out.println(aa);
        return aa;
    }
}
