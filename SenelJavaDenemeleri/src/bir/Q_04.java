package bir;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		System.out.print("birinci sayý =");
		Scanner scan=new Scanner(System.in);
		int sayi1=scan.nextInt();
		
		//Scanner scan=new Scanner(System.in);
		System.out.print("ikinci sayý =");
		int sayi2=scan.nextInt();
		
		System.out.println("topla ="+(sayi1+sayi2)+"\n"+"çarmpa ="+(sayi1*sayi2)+"\n"+"bölme ="+(sayi1/sayi2));
	}

}
