package Odevler;

import java.util.Scanner;

public class H08 {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
		
		System.out.print("birinci sayıyı giriniz =");
		Scanner scan=new Scanner(System.in);
		int sayi1=scan.nextInt();
	
		System.out.print("ikinci sayıyı giriniz =");
		int sayi2=scan.nextInt();
		
		System.out.print("üçüncü sayıyı giriniz =");
		int sayi3=scan.nextInt();
		
		double sonuc=(((sayi1*sayi1)-(sayi2*sayi2))/(sayi3*3));
		System.out.println(sonuc);
		
	}

}
