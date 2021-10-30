package Odevler;

import java.util.Scanner;
import java.util.InputMismatchException;

public class H09 {

	public static void main(String[] args) {
		/*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */
		
		
		System.out.print("Adınız Soyadınız =");
		Scanner scan=new Scanner(System.in);
		String ad=scan.nextLine();// aynı satıra iki kelime yazdırmak için "nextLine" kullanıyoruz.
		
		System.out.print("Yaş =");
		double yas=scan.nextInt();
		
		System.out.print("Kilo=");
		double kilo=scan.nextInt();
		
		System.out.print("Boy=");
		double boy =scan.nextFloat();
		
		System.out.print("Salona Devam Edeceği Ay=");
		double ay=scan.nextInt();
		
		double ucret=ay*20;
		System.out.print("Ücretiniz ="+ ucret+"$ dır.");
		scan.close();;
	}

}
