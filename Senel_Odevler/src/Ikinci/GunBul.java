package Ikinci;

import java.util.Scanner;

public class GunBul {

	public static void main(String[] args) {
//		Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal 
//		gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar” 
//		ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

		System.out.print("bir gün yazın =");
		Scanner scan=new Scanner(System.in);
		String gunBul=scan.next().toUpperCase();
		
		if (gunBul.equals("CUMA")) {
			System.out.println("Müslümanlar için kutsal bir gün");
		}
		if (gunBul.equals("cumartesi")) {
			System.out.println("Yahudiler için Kutsal bir gün");
			
		}
		if (gunBul.equals("Pazar")) {
			System.out.println("Hristiyanlar için kutsal bir gün");
		}
		
	}

}
