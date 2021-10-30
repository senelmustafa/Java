package Odevler;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class H010 {

	public static void main(String[] args) {
		 /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?

        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */
		System.out.println("Kaç günlük iş var =");
		Scanner scan=new Scanner(System.in);
		int gun=scan.nextInt();
		
		System.out.println("Kaç Kişi Çalışacak  =");
		int kisi=scan.nextInt();
		
		int bitirme=(gun/kisi);
		
		System.out.println("bu iş "+"\""+ bitirme + "\" "+ " günde biter.");
		
		scan.close();

	}

}
