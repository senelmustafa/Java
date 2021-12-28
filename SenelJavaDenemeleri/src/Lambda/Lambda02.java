package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, -3, 7, 34, -22,60, 42, 55));
		ciftKareMax(list);
		System.out.print("toplam :");
		toplaEl1(list);
		toplaEl2(list);
		System.out.print("Çarp :");
		carpEl(list);
		carpEl2(list);
		System.out.println("***min***");
		min1(list);
		min2(list);
		min3(list);
		min4(list);
		
		System.out.println("------------");
		onbestenkBykKckTekSayi(list);
		ciftElKrKckByk(list);
		onbestenBykKckTekSayi(list);
		ciftKareKckByk(list);
		
	}

	public static void ciftKareMax(List<Integer> list) {
//	Optional<Integer>maxEl=	list.stream().filter(Lambda01::ciftBul).map(t -> t * t).reduce(Integer::max);
	Optional<Integer>maxEl=	list.stream().filter(Lambda01::ciftBul).map(t -> t * t).reduce(Math::max);
	//Math max da kullanılabilir ancak daha spesifik olduğu için hızlı çalışır
		System.out.println(maxEl);
	}
	
	//SORU 2;
	//Listedeki elemanların toplamını yazdırınız
	//Lamda Expression
	public static void toplaEl1(List<Integer>list) {
		Integer toplam=list.stream().reduce(0, (x,y) ->x+y);
		//x her zaman ilk değerini 0 alır.
		//y her zaman değerini list.stream(0) dan alır(akış)
		//x ilk değerden sonraki değerlerini işlemden alır.
		System.out.println(toplam);
	}

	//methos referance
	public static void toplaEl2(List<Integer>list) {
		//Optional<Integer> toplam=list.stream().reduce(Integer::sum);
		Optional<Integer> toplam=list.stream().reduce(Math::addExact);
	//	System.out.println(toplam);
		System.out.println("toplam 2: "+toplam);
	}
	////List'teki cift elemanlarin carpimini yazdiriniz.
	//Method Reference...
	public static void carpEl(List<Integer>list) {
		//Optional<Integer> toplam=list.stream().reduce(Integer::sum);
		Optional<Integer> carp=list.stream().filter(Lambda01::ciftBul).reduce(Math::multiplyExact);
		System.out.println(carp);
		
	}
////List'teki cift elemanlarin carpimini yazdiriniz.
	//Method expression....Kodu biz yazıyoruz..
	public static void carpEl2(List<Integer>list) {
		Integer carp=list.stream().filter(Lambda01::ciftBul).reduce(1,(x , y ) ->(x*y));
		Integer carp2=list.stream().filter(Lambda01::ciftBul).reduce(-1,(x , y ) ->(x*y));
	
		System.out.println(carp);
		System.out.println("-1"+carp2);
	
}
	//Listeki elemanlardan en küçüğünü dört farklı yöntemle yazdırınız
	//1.yöntem:Method Reference
	public static void min1(List<Integer>list) {
	Optional<Integer> min=	list.stream().reduce(Integer::min);
	System.out.println(min);
	}
	//2.yöntem
	//Math clasından 
	public static void min2(List<Integer>list) {
		Optional<Integer> min=	list.stream().reduce(Math::min);
		System.out.println(min);
		
}
	//3.yöntem 
	//elle giriş
	public static int minBul(int x,int y) {
		return x<y ? x:y;//x y den küçükse x değilse y yi al
		
	}
	public static void min3(List<Integer>list) {
		Optional<Integer> min=	list.stream().reduce(Lambda02::minBul);
		System.out.println(min);
}
	//4.method
	//Lamda Expression
	public static void min4(List<Integer>list) {
		Integer min=	list.stream().reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y);
		System.out.println(min);
		//MAX_VALUE vermemizin nedeni en yüksek olması gerek ki y den büyük olarak 
		//başlasın yoksa sonsuz döngüye dönüşür çözüm olmaz...
		
		
		
		
}

	//list teki 15 ten büyük en küçük tek sayıyı yazdırınız.
	public static void onbestenkBykKckTekSayi(List<Integer>list) {
	//	list.stream().filter(t ->t % 2 == 1).filter(t->t>15).reduce(Integer::min);
	  System.out.println( list.
			  stream().
			  filter(t ->t % 2 == 1 & t >15).//15 den büyük ve tek sayı şartı sağlandı.
			  reduce(Integer::min));
	  
	}
	//list çift elemanlarının karelerini küçüğe büyükten yazdırınız
	public static void ciftElKrKckByk(List<Integer>list) {
		System.out.println(list.stream().filter(Lambda01::ciftBul).map(t->t * t).sorted());
	}
	
	////list çift elemanlarının karelerini küçüğe büyükten yazdırınız
	//List'teki 15'ten buyuk en kucvuk tek sayiyi yazdiriniz
	public static void onbestenBykKckTekSayi(List<Integer> list) {
	    // list.stream().filter(t->t % 2 == 1).filter(t-> t>15).reduce(Integer::min);
	    System.out.println(list.
	            stream().//akısa girdi
	                    filter(t -> t % 2 == 1 & t > 15).//tek ve 15 den byk sarti
	                    reduce(Integer::min));//min deger reduce edildi
	}

	//list'in cift  elemanlarinin kareleri ni  kucuge buykten yazdiriniz
	public static void ciftKareKckByk(List<Integer> list){
	    list.
	            stream().
	            filter(Lambda01::ciftBul).
	            map(t->t*t).
	            sorted().//akısa giren elelmanlar naturel order'e gore siralanir
	            forEach(t->System.out.print(t + " "));//144 484 1156 1764 3600 

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	