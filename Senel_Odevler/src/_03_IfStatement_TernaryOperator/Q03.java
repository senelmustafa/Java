package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy100*boy/100)(cm)
		
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
		System.out.print("boy ");
		Scanner scan= new Scanner(System.in);
		double boy=scan.nextDouble();
		System.out.print("kilo  :");
		double kilo=scan.nextDouble();
		
		double bmi=kilo/(boy/100*boy/100);
		
		if (bmi<=20 ) {
			System.out.println("oldukca zayifsiniz");
		} else if(20<bmi && bmi<=25){
			System.out.println("Normal sinirlardasiniz");
		}else if(25<bmi && bmi<=30){
			System.out.println("Sisman kategorisindesiniz");
		}else if(bmi>=30){
			System.out.println("Obez grubundasiniz.");
     
		}
}
}
