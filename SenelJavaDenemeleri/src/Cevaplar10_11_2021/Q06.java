package Cevaplar10_11_2021;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
    	System.out.print("Lütfen email adresinizi giriniz =");
    	Scanner scan =new Scanner(System.in);
    	String email =scan.next();
//    	String bir=scan.next();
//    	String iki=scan.next();
    	
    	//String yazdir=email.replace("hotmail", "gmail");
       //  System.out.println(yazdir);
    		System.out.println("Hotmail İçin ->1 i\nGmail için   ->2 yi \ndeğerlerinden birini giriniz =");
    		char deger=scan.next().charAt(0);
			switch (deger) {
			case '1':
				System.out.println(email+"@hotmail.com");
				break;
			case '2':
				System.out.println(email+"@gmail.com");
				break;
			default:
				System.out.println("Lütfen geçerli biri email adresi giriniz...");
				break;
			
			}scan.close();
		}
    
    }

