package Cevaplar10_11_2021;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
    /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
        
     */
    	System.out.print("Lütfen iki sayı giriniz :");
    	Scanner scan=new Scanner(System.in);
    	String  str1= scan.next();
    	String  str2= scan.next();
    
        
        String bir=(str1.replaceAll("\\D", ""));//karakterleri silin
        String iki=(str2.replaceAll("\\W", ""));
        
        Double f1 = Double.parseDouble(bir)+Double.parseDouble(iki);
        System.out.println("toplam= $"+f1);
        scan.close();
    }
}
