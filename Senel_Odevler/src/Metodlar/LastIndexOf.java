package Metodlar;

import java.util.Scanner;

public class LastIndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin, 
        // harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir cümle giriniz");
		
		String cumle=scan.nextLine();
		System.out.println("Lütfen varlığını kontrol etmek için bir harf giriniz");
		
		char krk=scan.next().charAt(0);
		
		int sayi=cumle.lastIndexOf(krk);
			if (sayi==-1) {
				System.out.println("harf cümlede kullanılmamış");
				
				
			} else {
				System.out.println("harf cümlede kullanılmış");
scan.close();
			}
		

	}

}
