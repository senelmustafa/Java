package Cevaplar10_11_2021;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		/*
		 * Kullanicidan email girmesini isteyin
		 * 
		 * @ isareti icermiyorsa "gecerli bir email girin" yazdirin
		 * 
		 * @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
		 * 
		 * @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa
		 * "Lutfen gmail hesabinizi girin" yazdirin ORNEK: INPUT : techproed.com OUTPUT
		 * : "gecerli bir email girin " INPUT : techproed@gmail.com OUTPUT :
		 * "email onaylandi " INPUT : techproed@hotmail.com OUTPUT :
		 * "Lutfen gmail hesabinizi girin"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("email giriniz");
		String mail = scan.nextLine();

		if (!mail.contains("@")) {
			System.out.println("geçerli bir mail gir");

		} else if (mail.substring(mail.indexOf("@") + 1).equals("gmail.com")) {
			System.out.println("email onaylandı");

		} else {
			System.out.println("lütfen gmail hesabınızı giriniz.");
		}
	}

}
