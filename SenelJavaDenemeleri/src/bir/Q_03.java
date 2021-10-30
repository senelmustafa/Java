package bir;

import java.nio.channels.NoConnectionPendingException;
import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		//girilen bilgileri alt alta yazdýrýyoruz
		System.out.print("Kullanýcý adýnýzý giriniz =");
		Scanner scan=new Scanner(System.in);
		String adi=scan.nextLine();
		System.out.print("soyadýnýzý giriniz =");
		String sAdi=scan.nextLine();
		System.out.print("yaþ =");
		int yas=scan.nextInt();
		System.out.print("boyunuzu giriniz =");
		int boy=scan.nextInt();
		System.out.println(   adi +"\n" +   sAdi+"\n"   + yas+"\n" +   boy+"\n");
		
		 
scan.close();
	}

}
