package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda01 {

	public static void main(String[] args) {
		/*
		 * 1) Lambda "Functional Programming" "Functional Programming" de
		 * "Nasil yaparim?" degil "Ne yaparim?" dusunulur. 
		 * 2) "Structured Programming" * de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur 3)
		 * "Functional Programming" hiz, code kisaligi, code okunabilirligi ve hatasiz
		 * code yazma acilarindan cok faydalidir. 
		 * 4) Lambda sadece
		 * collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak
		 * map'lerde kullanılmaz.  kullanmak hatasız code kullanmaktır.
		 */

		List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42));
		printStructured(list);// method call

		System.out.println("\n*****");
		printFunctional(list);// lambda expression

		System.out.println("\n*****");// method referans
		printFunctional1(list);

		System.out.println("\n*****");
		printCiftElStructured(list);

		System.out.println("\n*****");
		printCiftElFunctional1(list);

		System.out.println("\n\n*ikiye bölünen");
		printCiftElFunctional2(list);

		System.out.println("\n\n*ikiye bölünen 60 dan küçük");
		printCiftAltmisKucuk(list);

		System.out.println("\n\n*20 den büyük");
		tekYirmidenbuyukPrint(list);

		System.out.println("\n\nçift kare");
		ciftKarePrint(list);

		System.out.println("\n\nTek Küp");
		printTekKup(list);
		
		System.out.println("\n\nCift KaraKök");
		printciftKareKup(list);
		
		System.out.println("\nEn Büyük Eleman");
		maxElFunction(list);
	}

////structured Programming ile list elemanlerinin  tamamini aralarına boşluk bırakarak yazdiriniz
	public static void printStructured(List<Integer>list) {
		for (Integer w : list) {
			System.out.print(w + " ");
		}

	}

	public static void printFunctional(List<Integer> list) {
		list.stream().forEach(t -> System.out.print(t + " "));// lambda expression :lambda idadesi
		// stream() dataları yukarıdan aşağıya akış haline getirir.
		// for each datanın parametresine göre her bir elemanı işler
		// ->lambda operatorü
		// lambda expression çok tavsiye edilmez daha çok METHOD REFERENCE kullanılır..

	}

//Method Reference -" kendi create ettiiğimiz veya java dan aldığımız method ile
	// classname :: MethodName
	private static void printEl(int t) {// refere edilecek methos create edildi.
		System.out.print(t + " ");

	}

	private static void printFunctional1(List<Integer> list) {
		list.stream().forEach(Lambda01::printEl);

	}

	// structured Programming ile list elemanlerinin
//cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
	public static void printCiftElStructured(List<Integer> list) {
		for (Integer w : list) {
			if (w % 2 == 0) {
				System.out.print(w + " ");

			}

		}
		// functional Programming ile list elemanlerinin
		// cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz

	}

	public static void printCiftElFunctional1(List<Integer> list) {
		list.stream().filter(t -> t % 2 == 0).forEach(Lambda01::printEl);
		// filter istenen şarta göre filtreleme yapar if gibi
	}

public static boolean ciftBul(int i) {
		return i % 2 == 0;
	}

	public static void printCiftElFunctional2(List<Integer> list) {
		list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::printEl);
		// filter istenen şarta göre filtreleme yapar if gibi
	}

//Functional Programming ile list elemanlarinin  
//cift olanalrinin 60 dan kucuk olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz
	public static void printCiftAltmisKucuk(List<Integer> list) {
		list.stream().filter(t -> t % 2 == 0 & t < 60).forEach(Lambda01::printEl);

	}

	// Functional Programming ile list elemanlarinin tek olanalrini veya 20 dan
	// buyuk
	// olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz
	public static void tekYirmidenbuyukPrint(List<Integer> list) {
		list.stream().filter(t -> t % 2 == 1 || t > 20).forEach(Lambda01::printEl);
	}

	//// Functional Programming ile list elemanlarinin cift olanlarinin
	// karelerini ayni satirda aralarina bosluk birakarak yazdiriniz
	public static void ciftKarePrint(List<Integer> list) {
		list.stream().filter(Lambda01::ciftBul).map(t -> t * t).forEach(Lambda01::printEl);
	}

	public static void ciftKarePrint1(List<Integer> list) {
		list.
		stream().
		filter(Lambda01::ciftBul).
		map(t -> t * t).
		forEach(Lambda01::printEl);
	}

	//// Functional Programming ile list elemanlarinin tek olanlarinin
	// kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak yazdiriniz
	public static void printTekKup(List<Integer> list) {
		list.
		stream().
		filter(t -> t % 2 == 1).
		map(t -> t * t * t + 1).
		forEach(Lambda01::printEl);
	}

	// Functional Programming ile list elemanlarinin cift olanlarinin
	// karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
	public static void printciftKareKup(List<Integer> list) {
		list.
		stream().
		filter(Lambda01::ciftBul).
		map(Math::sqrt).
		forEach(t->System.out.println(t+" "));
		
	}//listin en büyük elemanını yazınız.
	private static void maxElFunction(List<Integer> list) {
		Optional<Integer> maxEl=list.stream().reduce(Math::max);
		System.out.println(maxEl);
		
	}
}
