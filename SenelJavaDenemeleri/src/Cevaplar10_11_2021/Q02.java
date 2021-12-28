package Cevaplar10_11_2021;

import java.util.Scanner;
import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

public class Q02 {
	public static void main(String[] args) {
		// Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye
		// ayırınız,
		// ad ayrı soyad ayrı sekilde ekrana yazdırınız.

		Scanner scan = new Scanner(System.in);
		String isim = scan.nextLine();

		String adi = (isim.substring(0, isim.indexOf(" ")).toUpperCase());
		String soyadi=isim.substring(isim.indexOf(" ")+1).toUpperCase();
		System.out.println("ADI 	:" + " " + adi);
		System.out.println("SOYADI  :" + " " + soyadi);

		scan.close();
	}
}
