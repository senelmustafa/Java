package ForLoop;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// Kullanıcıdan 5 adet sayı isteyiniz
		// Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
		// bu soruyu continue kullanarak çözünüz.

		Scanner scan = new Scanner(System.in);
int toplam=0;
		for (int i = 1; i <=5; i++) {
			System.out.print("sayı "+i+" giriniz :");
			int sayi=scan.nextInt();
			
			if (sayi>5 && sayi<10) {
				
				System.out.println("girilen 5 ile 10 arası olduundan işleme alınmadı");
				continue;//bekleme devam et komutudur.
				
			} toplam+=sayi;
		}System.out.println(toplam);
	}

}
