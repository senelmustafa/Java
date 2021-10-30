package Odevler;

import java.util.Scanner;

public class H02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan uc basamakli bir sayi alin 
		 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
		 * 
		 * 
		 * Ornek : Inputs : 853 
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 *          Girdiginiz sayinin onlar basamagi : 5 
		 *          Girdiginiz sayinin yuzler basamagi : 8
		 * 
		 * 
		 */
		
		System.out.print("üc basamaklı bir sayı giriniz;");
		Scanner scan=new Scanner(System.in);
		int sayiGir=scan.nextInt();
		
		int birinciSayi=sayiGir%10;
		int ikinciSayi=	(sayiGir/10)%10;					//(sayiGir/100);
		int ucuncuSayi=(sayiGir/100)%10;
		int dorduncu =sayiGir/10;
		System.out.println("birinci sayi"+birinciSayi);
		System.out.println("ikinci sayi"+ikinciSayi);	
		System.out.println("ucuncu sayi"+ucuncuSayi);	
		
		
	}

}
