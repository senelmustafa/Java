package Cevaplar10_11_2021;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger 
         * kelime 3 ve daha fazla harfden olusuyorsa 
         * son iki harfini 3 kere yan yana yazdirin.
         * degil ise girilen kelimeyi yazdirin
     
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
       
    	Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir isim giriniz :");
		String isim = scan.next();
		
	/*	if(str.length() >= 3) {
            System.out.println(str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2));
        }else {
            System.out.println(str);
        }*/
		
		
		if(isim.length()>=3) {
			System.out.println(isim.substring(isim.length()-3)+isim.substring(isim.length()-3)+isim.substring(isim.length()-3));
		}else {
			System.out.println();
		}
    }
}
