package Cevaplar10_11_2021;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        

        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
       
    	
    	Scanner scan =new Scanner(System.in);
    	System.out.println("lütfen adınızı ve soyadınızı giriniz :");
    	String isim= scan.nextLine();
    	
    	boolean bosMu=isim.toUpperCase().contains(" ");
    	boolean boslukVarMi = isim.isEmpty();
    	System.out.println(isim.length()+" "+bosMu+" "+boslukVarMi);
			
    	
//    	Scanner scan = new Scanner(System.in);
//        System.out.print("Bir string giriniz = "); // Java ogren
//        String text = scan.nextLine();
//
//        boolean boslukVarMi = text.contains(" ");
//        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true
//
//        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
//        boolean bosMu = text.isEmpty();
//        System.out.println("bosMu = " + bosMu); //bosMu = false
//        scan.close();
    	
    	
    	
		}
    }
 

