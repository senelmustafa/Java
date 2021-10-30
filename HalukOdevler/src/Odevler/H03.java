package Odevler;

import java.util.Scanner;

public class H03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
		 *  
		 *   Ex :
		 *   input  : 12345
		 *   output : 12
		 */
		Scanner scan=new Scanner(System.in);
				System.out.print("5 basamaklı bir sayı giriniz =");
				int sayi=scan.nextInt();
				
				int birler=sayi%10;
				int onlar=(sayi/10)%10;
				int binler=(sayi/1000)%10;
				int onbinler=(sayi/10000)%10;
				
				//System.out.println(birler );
				//System.out.println( onlar );
				//System.out.println( binler );
				//System.out.println( onbinler);
				
				System.out.println(birler+onlar+binler+onbinler);
		
	}

}
