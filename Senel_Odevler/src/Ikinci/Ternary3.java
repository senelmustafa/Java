package Ikinci;

import java.util.Scanner;

public class Ternary3 {

	public static void main(String[] args) {
// "Ternary"
//Soru -Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

		System.out.print("Lütfen iki sayı yazınız");
		Scanner scan=new Scanner(System.in);
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		String sonuc=(sayi1<sayi2) ? "birinci sayı küçük " :(sayi1==sayi2) ? "sayılar eşit" :"ikinci sayı küçük"  ;
		System.out.println("\nGİRİLEN SAYILAR HAKKINDA RAPOR\n\n"+""+"\nBirinci Soru "+sonuc);

		
		//Soru2-Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		String tekCift= sayi1%2==0 ? "çift" : "tek";
		System.out.println("\nİkinci Soru "+ "" +"\nBirinci sayı ="+tekCift);
		System.out.println(sayi1%2==0 ? "çift" : "tek");//daha kısa
//Soru3-Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		double mutlakDeger=sayi1>=0 ? sayi1 : ((-1)*sayi1) ;
		
		System.out.println("\nÜçüncü Soru " +" "+"\nBirinci Sayının Mutlak Değeri ="+Math.abs(sayi1));
		System.out.println(mutlakDeger);

//Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
		//negatifse sayinin karesini yazdirin
		String nedir=sayi1<0.0 ? "(sayi*sayi)" :"pozitif";
		System.out.println("\nDördüncü Soru "+" "+"\nsayı ="+nedir);
		System.out.println(sayi1>0 ? "sayi1 pozitif" :sayi1*sayi1);
		scan.close();
	}

}
