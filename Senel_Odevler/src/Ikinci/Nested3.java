package Ikinci;

import java.util.Scanner;

import javax.crypto.interfaces.DHPrivateKey;

public class Nested3 {

	public static void main(String[] args) {
//		Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. 
	//	Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
//		çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
//		Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın

		System.out.print("dört basamaklı bir sayı giriniz :");
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		
		if (sayi<1000 || sayi>9999) {
			System.out.println("4 basamaklı sayı girmelisiniz ");
						
		} else {// dort basamaklı sayıları yakalayacak
			
					if (sayi%5==0) { //beşe tam bölünür
						
							if (sayi%10==0) //tek mi çift mi
									System.out.println("beşe bölünen çift sayı");
							} else {
								System.out.println("beşe bölünen tek sayı ");
							}
						
		}	//else {
					System.out.println("tekrar deneyiniz");
					 
	}
		}
		
//	}

