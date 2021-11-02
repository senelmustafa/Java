package Ikinci;

import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Nested {

	public static void main(String[] args) {
//		Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
//		Kullanicidan bir sifre girmesini isteyin
//		Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
//		“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
//		Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
//		“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin

		System.out.print("lütfen bir şifre giriniz :");
		Scanner scan=new Scanner(System.in);
		char sifre=scan.next().charAt(0);
		
		
		if (sifre != 'A' && sifre!= 'z') {
			System.out.println("\nŞifre geçerli değil.\n Tekrar Deneyiniz.");
						
			 
		}else {
			System.out.println("Doğru şifre");
		}
		scan.close();
	}

}
