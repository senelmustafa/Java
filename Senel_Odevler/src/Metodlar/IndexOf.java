package Metodlar;

import java.util.Scanner;

import _03_IfStatement_TernaryOperator.IfElse_Koordinat;

public class IndexOf {

	public static void main(String[] args) {
	      // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, 
        //      kelimenin cumledeki kullanimina bakarak asagidaki 3 
		//cumleden uygun olani yazdirin
        //      - Girilen kelime cumlede kullanilmamis.
        //      - Girilen kelime cumlede 1 kere kullanilmis.
        //      - Girilen kelime cumlede 1’den fazla kullanilmis.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir cümle giriniz");
		String cumle=scan.nextLine();
		
		System.out.println("bir cümle giriniz");
		String kelime=scan.next();
		
		//int index=cumle.indexOf(kelime);
		int index=cumle.indexOf(kelime);
		if (index<0) {
		//	if (index<0) {
				//System.out.println("girilen kelime kullanılmamış");
		System.out.println("girilen kelime kullanılmamış");
		
	//		} else if(cumle.indexOf(kelime,index+1)==(-1)){
		    } else if(cumle.indexOf(kelime,index+1)==(-1)){
			//System.out.println("girilen kelime 1 kere kullanılmış");
	    System.out.println("girilen kelime 1 kere kullanılmış");
	    
		}else {
//				System.out.println("girilen kelime birden fazla kullanılmış");
			}
	}
}


