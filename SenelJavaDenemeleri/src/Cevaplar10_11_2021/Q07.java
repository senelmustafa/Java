package Cevaplar10_11_2021;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {

		/*
		 * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
		 * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
		 * Test data: ali eme all
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("isminizi giriniz");
		String isim = scan.nextLine();

	 	char c1 = isim.charAt(0);// ilk karakterini verir
		char c2 = isim.charAt(1);// 2
		char c3 = isim.charAt(2);// 3

		/*/// if ile çözüm
		if (isim.length() == 3) {
			if (c1 != c2 && c1 != c3 && c2 != c3) {
				System.out.println("girilen isim üç harfli ve unique");
			} else {
				System.out.println("girilen isim 3 harfli ama unique değil");

			}
		} else {
			System.out.println("girdiğin isim 3 hafli değildir");
		}
		String sonuc = isim.length() == 3 ? ((c1 != c2 && c1 != c3 && c2 != c3) ? "girilen isim üç harfli ve unique "
				: "girilen isim 3 harfli ama unique değil") : "girdiğin isim 3 hafli değildir";
		System.out.println("\n*****************************\n"+sonuc);
		scan.close();*/
	String    netice=isim.length()==3 ? ((c1!=c2 && c2!=c3 && c2!=c3) ? "girilen enique farklı" : "enuque farklı değil" ) :"girilen isim 3 harfli değil";
	System.out.println(netice);
	}
}