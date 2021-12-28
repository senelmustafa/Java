package Cevaplar10_11_2021;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

    	
    	Scanner scan = new Scanner(System.in);
		System.out.print("İsminizi Giriniz ");
		String  Isim = scan.nextLine();
		
		char ilkharf=Isim.toUpperCase().charAt(0);//ilk harfi aldı
		char ikinciHarf=Isim.toUpperCase().charAt(Isim.indexOf(" ")+1); //baştan ilk boşluktakinden sonra var olan harfi aldı
		char ucuncuHarf=Isim.toUpperCase().charAt(Isim.lastIndexOf(" ")+1);//sondan ilk boşluktaki harften sonra başlayan harfi aldı 
		 
		System.out.println("isminizin baş harfleri :"+ilkharf+"."+ikinciHarf+"."+ucuncuHarf);
		 
				
				
    }       
}
