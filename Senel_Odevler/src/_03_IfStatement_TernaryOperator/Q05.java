package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		System.out.println("yas ve kilonuzu giriniz");
		Scanner scan=new Scanner(System.in);
		int yas=scan.nextInt();
		int kilo=scan.nextInt();
			
		  if (yas>18 && kilo<50 ) {
			System.out.println("kan bağışı yapamaz !!!");
			
		  }else if(yas>18 && kilo>50) {;
				System.out.println("Kan bağışı yapabilir");
				}
			 else  
			System.out.println("kan bağışı yapamaz");
		  scan.close();
		}
			 
		 
	 
	 

	}
	 
