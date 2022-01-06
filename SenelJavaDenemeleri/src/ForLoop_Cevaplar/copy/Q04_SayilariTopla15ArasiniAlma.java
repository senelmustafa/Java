package ForLoop_Cevaplar.copy;

import java.util.Scanner;

public class Q04_SayilariTopla15ArasiniAlma {

	public static void main(String[] args) {
		// Kullan�c�dan 5 adet say� isteyiniz
		// Bu say�lardan 5 ile 10 aras�ndakiler hari�, di�erlerinin toplam�n� bulunuz.
		// bu soruyu continue kullanarak ��z�n�z.
		
		Scanner scan = new Scanner(System.in);
		int toplam = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("sayi " + i + " giriniz : ");
			int sayi = scan.nextInt();
			if (sayi > 5 && sayi <10) {
				System.out.println("girilen sayi 5 ile 10 arasi old isleme alinmadi");
				continue;//ticari bekleme devam et komutudur....yok saymak pas ge� gibim bisey;
			}
			toplam += sayi;
		}
		System.out.println("girdiginiz sayilarin toplami : " + toplam);
		
		scan.close();
	}
}