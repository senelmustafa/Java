package Ikinci;

import java.util.Scanner;

public class KarisikSoru2 {

	public static void main(String[] args) {
		  // Soru 8) Kullanicidan maas icin bir teklif isteyin 
        //      ve asagidaki degerlere gore cevap yazdirin.  
        //      Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 
        //      60 – 80.000 arasinda ise “Konusabiliriz”, 
        //      60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin 
        
		System.out.println("maaş için bir teklif veriniz =");
		Scanner scan=new Scanner(System.in);
		int teklif= scan.nextInt();
		
		if (teklif>=80000) {
			System.out.println("kabul ediyorum ");
			
			
			} else if (teklif>60000) {
				System.out.println("görüşebiliriz");{

			}
			
			 
		} else {
			System.out.println("kabul etmiyorum.");
		}
				scan.close();
				
				}

}
