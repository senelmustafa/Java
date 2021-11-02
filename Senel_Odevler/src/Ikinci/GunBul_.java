package Ikinci;

import java.util.Scanner;

public class GunBul_ {

	public static void main(String[] args) {
		 System.out.println("bir gün yazınız =");
		 Scanner scan=new Scanner(System.in);
		 String gun =scan.next().toUpperCase();
		 
		 if (gun.equals("PAZARTESİ")|| gun.equals("SALI")||gun.equals("ÇARŞAMBA") || gun.equals("PERŞEMBE") || gun.equals("CUMA") || gun.equals("CUMARTESİ") || gun.equals("PAZAR")) {
			 
	            	 
			// System.out.println( ""+gun.charAt(0) +gun.toUpperCase().charAt(1)+ gun.toUpperCase().charAt(2));
			  System.out.println(gun.substring(0, 1).toUpperCase() + gun.substring(1));
	}else {
		 System.out.println("Gecerli gun ismi giriniz");
	}
		 
}
	}
