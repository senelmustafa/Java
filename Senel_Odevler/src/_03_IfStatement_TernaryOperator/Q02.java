package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
	
		System.out.print("birinci sayı");
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		
		System.out.print("ikinci sayi ");
		int b=scan.nextInt();
		
		System.out.print("üçüncü sayi ");
		int c=scan.nextInt();
		
		
		
		if ((double==a+b>c>a-b) && (double==a+c>b>a-c) && (double==a=b=c) ) {
			System.out.println("bu bir ücgen");	
		}else if (a+c>b>a-c) {
			System.out.println("bu bir ücgen");	
		}else if (b+c>a>b-c) {
			System.out.println("bu bir ücgen");	
		}else if(a=b=c) {
			System.out.println("eşkenar üçgen");
		}
				

	}

}
