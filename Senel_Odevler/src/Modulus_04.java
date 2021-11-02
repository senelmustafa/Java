import java.util.Scanner;

public class Modulus_04 {

	public static void main(String[] args) {
//birinci Problem;
		
//		int birinciSayi=sayiGir%10;
//		int ikinciSayi=	(sayiGir/10)%10;					//(sayiGir/100);
//		int ucuncuSayi=(sayiGir/100)%10;
//		int dorduncu =sayiGir/10;
//		System.out.println("birinci sayi"+birinciSayi);
//		System.out.println("ikinci sayi"+ikinciSayi);	
//		System.out.println("ucuncu sayi"+ucuncuSayi);	
//		System.out.println("sayıların toplamı= "+(birinciSayi+ikinciSayi+ucuncuSayi));
		
//	ikinci Problem	;
		
//		System.out.println("dört basamaklı bir sayı giriniz =");
//		Scanner scanner=new Scanner(System.in);
//		int sayi=scanner.nextInt();
//		
//		int birinci=sayi%10;
//		int ikinciSayi=(sayi/10)%10;
//		int ucuncuSayi=(sayi/100)%10;
//		int dorduncu=(sayi/1000)%10;
//		
//		System.out.println(birinci);
//		System.out.println(ikinciSayi);
//		System.out.println(ucuncuSayi);
//		System.out.println(dorduncu);
//		
//		System.out.println((birinci+ikinciSayi+ucuncuSayi+dorduncu));
	
//ucuncu Problem;
		
		System.out.print("kimlik numaranızı giriniz =");
		Scanner scan=new Scanner(System.in);
		double kimlik=scan.nextDouble();
		
		double bir=kimlik%10;
		double iki=(kimlik/10)%10;
		double uc=(kimlik/100)%10;
		double dort=(kimlik/1000)%10;
		double bes=(kimlik/10000)%10;
		int toplam=(int) (bir+iki+uc+dort+bes);
		
		System.out.println(bir);
		System.out.println(iki);
		System.out.println(uc);
		System.out.println(dort);
		System.out.println(bes);
		
		System.out.println(toplam);
		
				
		
		

	}

}
