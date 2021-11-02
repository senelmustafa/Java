import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class Modulus_01 {

	public static void main(String[] args) {
		System.out.println("4 basamaklı rakamm gir ");
		Scanner scan=new Scanner(System.in);
		int  sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		System.out.println(sayi);
		System.out.println(rakam);
		System.out.println(rakamlarToplami);
		
	}

}
