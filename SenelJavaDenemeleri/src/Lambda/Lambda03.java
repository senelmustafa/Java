package Lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {
		bykHrfTekrarsizSira(list);
		
		ciftKareTkrszTersSr(list);
		karakterSayisi(list);
		wIleBaslayan(list);
		xIleBaslayan(list);
		karakteriEnBuyukEl(list);
	}
	private static String printEl(String t) {// refere edilecek methos create edildi.
		System.out.print(t + " ");
		return t;
	}
		static List<String> list = new ArrayList<>(Arrays.asList(
			"mehmet","wemre","nilgux","yıldız","kader","emine","islam","islam","emre"));
	
	

	public static void bykHrfTekrarsizSira( List<String> list){
	    list.
	            stream().//akisa girdi
	           // map(t->t.toUpperCase()).//elelmanlar byk harf update edildi
	            map(String::toUpperCase).	//elelmanlar byk harf update edildi
	            sorted().		//alfabetik sira
	            distinct().		//tekrarsiz  yapildi
	            forEach(t->System.out.print(t + " "));//yazdirilidi
	            
	    //EMRE EMİNE KADER MEHMET NİLGUN YILDIZ İSLAM 

	}
	//list elemanlarının character sayısını ters saıralı olarak tekrarsız yazdırınız
	
	public static void karakterSayTekszTrsSrli(List<String>list) {
		list.stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(t->System.out.print(t + " "));
	}
	
	//List elemanlarini character sayisina gore kckten byk e gore yazdiriniz.
	public static void  karakterSayisiSiraliEl(List<String> list){
	    list.
	            stream().
	            sorted(Comparator.comparing(t->t.length())).//eleman character  sayisina gore ozel siralama yapildi
	            forEach(t->System.out.print(t + " "));
	}
	//list elemanlarinin son harfine gore ters sirali yazdiriniz
	public static void sonHarfTersSiraliEl(List<String> list){
	    list.
	            stream().
	            sorted(Comparator.
	                    comparing(t->t.toString().
	                            charAt(t.toString().length()-1)).//elemanin length()-1)-->son inedx'inin karakterini alir
	                    reversed()).//elemanin length()-1)-->son inedx'inin karakterini ters siralar z->a
	            forEach(t->System.out.print(t + " "));
	}

	//Cift sayili elemanlarin karelerini hesaplayan, tekrarli olanlari sadece bir kere buyukten kucuge dogru
	//yazdiran bir program yaziniz.
	public static void ciftKareTkrszTersSr(List<String> list) {
		list.stream().
		filter(t->t.length()%2==0).
		map(t->t.length()*t.length()).
		sorted(Comparator.reverseOrder()).
		distinct().
		forEach(t-> System.out.print(t+" "));
		
	}
	//list elemanlerının karakter sayısını 7 ve 7 den az olma durumunu kontrol ediniz.
	public static void karakterSayisi(List<String> list) {
	boolean	kontrol=list.
			stream().
			allMatch(t->t.length()<=7);//her bir elemanin harf sayısını<7 baktı
	if(kontrol)
		System.out.print("list elemanları 7 harften BÜYÜK değil");
	else {
		System.out.println("list elemanları 7 harften BÜYÜK");
	}
	System.out.println(kontrol);
	
	System.out.println(list.stream().allMatch(t->t.length()<=7) ? "list elemanları 7 harften BÜYÜK değil":"list elemanları 7 harften BÜYÜK ");;
	}
	
	//list elemanlarının "w" ile başlamasını kontrol ediniz.
	public static void wIleBaslayan(List<String> list) {
		System.out.println(list.
				stream().
				noneMatch(t->t.startsWith("w")) ? "hepsi W ile basliyor" : "bir tanesi W ile baslamiyor");
	}
	//list elemanlarının "x" ile biten en az bir elemanı konrtol ediniz.
	public static void xIleBaslayan(List<String> list) {
		System.out.println(list.
				stream().
				anyMatch(t->t.startsWith("w")) ? "x ile başlayan isim kimse ayağa kalsın ":"x ile başlayan isim mi olur???");;
	}
	
	 //Karakter sayisi en buyuk elemani yazdiriniz.
	public static void karakteriEnBuyukEl(List<String> list){
	    System.out.println(list.
	            stream().
	            sorted(Comparator.comparing(t -> t.toString().length()).//lenght karakter uzunluguna gore siraladi k->b
	                    reversed()).//ters sirlad b->k
	            findFirst());//ilk elelmani aldi

	}
	
}
//noneMatch(t -> t.startsWith("w"))--->  "hicbiri W ile baslamiyor" : "birileri W ile basliyor"
//allMatch(t -> t.startsWith("w")) --->  "hepsi W ile basliyor" : "bir tanesi W ile baslamiyor"
//anyMatch(t -> t.startsWith("w")) --->  "herhangibiri W ile basliyor" : "hicbiri W ile baslamiyor"