package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		System.out.print("birinci sayı");
		
		Scanner scan= new Scanner(System.in);
		double sayi1=scan.nextDouble();
		System.out.print("ikinci sayi ");
		double sayi2=scan.nextDouble();
		
		System.out.print("toplama için  -->1 \ncıkarma için -->2 \nÇarpma için  -->3 \nBölme için -->4");
		
		int islem=scan.nextInt();//kullanıcı seçim yaptı
		
		
		
		 if (islem==1) {
			 System.out.println("Toplama  "+ " " + (sayi1+sayi2));
		}else if (islem==2) {
		    System.out.println("çıkartma "+ " " +( sayi1-sayi2));
		}else if (islem==3) {
			System.out.println("Çarpma"+" "+ (sayi1*sayi2));
		}else if (islem==4) {
			System.out.println("Bölme"+" "+ (sayi1/sayi2));
		}
		 else {
			 System.out.println("hatalı giriş yaptınız ");
		}
		
		
		
		
		
		
	}

}
