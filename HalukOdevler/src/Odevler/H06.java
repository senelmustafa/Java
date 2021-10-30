package Odevler;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class H06 {

	public static void main(String[] args) {
		/*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut 
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		                   Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
		System.out.print("kilonuz lütfen");
		Scanner scan=new Scanner(System.in);
		int kilo=scan.nextInt();
		
		System.out.print("boy l�tfen");
		double boy=scan.nextDouble();
		double sonuc=(kilo)/(boy*boy);
		System.out.println(" Vucut Kitle Indeksiniz"+sonuc);
		
	}

}
