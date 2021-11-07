package Ikinci;

import java.util.Scanner;

public class MaasTeklif {

	public static void main(String[] args) {
//		Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin. 
//		Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 
//		60 – 80.000 arasinda ise “Konusabiliriz”, 
//		60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
		
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("gün nosunu Pazardan başlayaran yazınız");
		int gunNo=scanner.nextInt();
		
		String gunAdi="";
		
		switch (gunNo) {
				case 0:
					gunAdi="Pazar";
				break;
				
				 
					case 1:
					gunAdi="Pazartesi";
					break;
				
				 
					case 2:
					gunAdi="Salı";
					break;
				
				 
					case 3:
					gunAdi="Çarşamba";
					break;
				
				 
					case 4:
					gunAdi="Perşembe";
					break;
				
				 
					case 5:
					gunAdi="Cuma";
					break;
				
				 
					case 6:
					gunAdi="Cumartesi";
					break;
				
		default:
			System.out.println("geçerli bir gün giriniz");
		}
				System.out.println(gunAdi);
				System.out.println("kaç gün sonrası olduğunu merak ediyorum");
				int xGunSonra=scanner.nextInt();
				gunNo =(gunNo+xGunSonra)%7;
				switch (gunNo) {
				case 0:
					gunAdi="Pazar";
				break;
				
				 
					case 1:
					gunAdi="Pazartesi";
					break;
				
				 
					case 2:
					gunAdi="Salı";
					break;
				
				 
					case 3:
					gunAdi="Çarşamba";
					break;
				
				 
					case 4:
					gunAdi="Perşembe";
					break;
				
				 
					case 5:
					gunAdi="Cuma";
					break;
				
				 
					case 6:
					gunAdi="Cumartesi";
					break;
				
		}
		
	}
	}


