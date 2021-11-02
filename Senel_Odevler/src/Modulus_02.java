import java.util.Scanner;

public class Modulus_02 {

	public static void main(String[] args) {
		
		System.out.println("rakam giriniz");
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		
		int sayiToplam=0;
		int rakam=sayi%10;
		sayiToplam+=rakam;
		sayi/=10;
		
		System.out.println(sayi);
		
		rakam=sayi%10;
		sayiToplam+=rakam;
		sayi/=10;
	
		System.out.println(sayi);
		
		
		
		

	}

}
