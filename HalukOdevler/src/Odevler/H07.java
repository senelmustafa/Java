package Odevler;

import java.util.Scanner;

public class H07 {

	public static void main(String[] args) {
		/*
    	 * Kullanicidan alacaginiz vize2 vize2 ve final notlarini 
    	 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
    	 */
		
		System.out.println("vize");
			Scanner scan=new Scanner(System.in);
			double vize1=scan.nextDouble();
			
			System.out.println("vize2");
			double vize2=scan.nextDouble();
		System.out.println("final");
			double final1=scan.nextDouble();
			
			double ort=((((vize1+vize2)/2)*0.30+((final1*0.30)/100)));


					
			
		System.out.println("geçme notu"+ort);

	}

}
