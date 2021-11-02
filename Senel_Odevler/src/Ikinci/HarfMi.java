package Ikinci;

import java.util.Scanner;

public class HarfMi {
	public static void main(String[] args) {
		System.out.println("bir karakter giriniz");
		Scanner scan=new Scanner(System.in);
		char karakter=scan.next().charAt(0);
		
		if ((karakter>='A' && karakter<='z') || (karakter>='a' && karakter<='z')) {
			System.out.println( "girdiğiniz karakter  "+ karakter+ " harfidir.");
			
		} else {
			System.out.println("girdiğini "+karakter+" değildir.");
scan.close();
		}
		
	}

	
		
	

}
