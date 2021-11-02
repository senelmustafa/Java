import java.util.Scanner;

import javax.swing.text.TableView.TableCell;

public class Modulus_03 {

	public static void main(String[] args) {
		
		System.out.println("Kimlik Numaranýzý giriniz");
		Scanner scan=new Scanner(System.in);
		int kimlik=scan.nextInt();
		
		int kimlikToplam=0;
		int sayiDeger=kimlik%10;
		kimlikToplam+=sayiDeger;
		kimlik/=10;
		//System.out.println(kimlik);
		sayiDeger=kimlik%10;
		kimlikToplam+=sayiDeger;
		kimlik/=10;
		
	System.out.println(kimlik);
	}

}
