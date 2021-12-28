package Cevaplar10_11_2021;

import java.net.SocketAddress;
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		/*
		 * 
		 * Kullanıcıdan aldığınız Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi
		 * özel forma dönüştürün Kredi kartı numarasını kontrol edin, yoksa 16 haneden
		 * küçük olursa "Geçersiz kredi kartı numarası" yazdırın. input : John White
		 * 1234234534561478 output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın
		 * baş harfleri ve soyadı büyük olmalıdır)
		 */

		/*
		 * Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 * 1) \\d ==> tum rakamlar 0->9 \\D ==> tum rakam disi character ler 0->9 _
		 * disindaki hersey 2) \\w ==> A->Z a->z \\W ==> A->Z a->z tum harf disi
		 * character ler 3) \\s ==> space \\S ==> space disindaki hersey
		 */
		System.out.println("Lütfen Adınızı Soyadınızı Giriniz  =");
		Scanner scan = new Scanner(System.in);
		String adi = scan.nextLine();
		System.out.println("Lütfen 16 Haneli Kredi Kartı Numaranızı Giriniz  =");
		String kKarti = scan.next();

		if (kKarti.length() == 16) {
			adi = (adi.substring(0, adi.indexOf(" ")).toUpperCase() + " "
					+ (adi.substring(adi.indexOf(" ") + 1).toUpperCase()));
			kKarti = "**** **** ****" + (kKarti.substring(kKarti.length() - 4));

		} else {
			System.out.print("lutfen 16 haneli kart numarasi giriniz :");
		}

		System.out.println(adi + " " + kKarti);
		scan.close();

		// if (kartno.length() == 16) {
//
//			isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
//			soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
//			kartno = "**** **** **** " + kartno.substring(kartno.length() - 4);
//
//		} else {

	}
}
