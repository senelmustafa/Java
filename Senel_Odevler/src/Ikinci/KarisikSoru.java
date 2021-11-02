package Ikinci;

import java.util.Scanner;

public class KarisikSoru {

	public static void main(String[] args) {
		   // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, 
        // calisan erkekse 65 yasindan buyukse emekli olabilir
		
		System.out.print("lütfen cinsiyetiniz giriniz ");
		Scanner scan= new Scanner(System.in);
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		System.out.println("lütfen yas giriniz =");
		double yas=scan.nextDouble();
		
		if (cinsiyet=='K') {
			
			
			if (yas>=60 ) {
				System.out.println("emekli olabilirsiniz");
			} else {
				System.out.println("henüz emekli olamazsınız.");
			}			
			
			
			
			
		} else if(cinsiyet=='E') {
				if (yas>=65) {
					System.out.println("emekli olabilirsiniz.");
				} else {
					System.out.println("emekli olamazsınız.");
				}
		}else {
			System.out.println("geçerli bir karakter giriniz.");
		scan.close();
		}
				
	}

}
