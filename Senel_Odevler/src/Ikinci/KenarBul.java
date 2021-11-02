package Ikinci;

import java.util.Scanner;

public class KenarBul {

	public static void main(String[] args) {
		System.out.println("Şeklin bir kenarını giriniz  =");
		Scanner scan=new Scanner(System.in);
		double birKenar=scan.nextDouble();
		
		System.out.println("Şeklin diğer kenarını giriniz  =");
		double ikinciKenar=scan.nextDouble();
		
		if (birKenar==ikinciKenar) {
			System.out.println("Şeklimiz bir karedir.");
			
		}

		if (birKenar!=ikinciKenar) {
			System.out.println("bu bir kare değildir dikdortgendir.");
			scan.close();
		}
	}

}
