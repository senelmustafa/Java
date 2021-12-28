package Cevaplar10_11_2021;

import java.util.Scanner;

import javax.imageio.stream.ImageInputStreamImpl;

public class Q09 {

	public static void main(String[] args) {

		/*
		 * StringMethods: cift uzunlukta bir degiskenin
		 *  ilk yarisini konsolda yazdirmak
		 * icin bir Java programi yaziniz.
		 *  ORNEK: INPUT : Python OUTPUT : Pyt
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("bir değer giriniz");
		String str= scan.nextLine();
		
//		if (str.length()%2==0) {
//			System.out.println("değerin yarısı "+str.substring(0,str.length()/2));
//		}else {
//			System.out.println("tek uzunlukta girilmiş");
//		scan.close();
		
		if (str.length()%2==0){
			System.out.println("değerinin yarısı "+str.substring(0,str.length()/2));
			}else {
				System.out.println("tek uzunlukta girilmiş");
				scan.close();
			}
		
		
		}
		
	}

