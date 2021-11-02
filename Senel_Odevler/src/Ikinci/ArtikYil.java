package Ikinci;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
//ARTIK YIL
//4′e tam bölünen yıllar artık yıldır.
//100′e tam bölünen yıllar artık yıl değildir.
//400′e tam bölünen yıllar artık yıldır.
//4000′e tam bölünen yıllar artık yıl değildir.
		
		System.out.println("Lütfen bir yıl giriniz =");
		Scanner scan=new Scanner(System.in);
		int yil =scan.nextInt();
		
		if ((yil%4==0) && (yil%100==0) && (yil%400==0) && (yil%4000!=0)) {
			System.out.println("artık yıldır.");
			
		}else {
			System.out.println("artık yıl değildir");

		scan.close();
		}

		}
	
}