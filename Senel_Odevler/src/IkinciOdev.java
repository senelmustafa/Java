import java.util.Scanner;

import javax.naming.directory.DirContext;

import org.xml.sax.SAXNotRecognizedException;

public class IkinciOdev {

	public static void main(String[] args) {


//birinci Ödev	
		Scanner scan=new Scanner(System.in);
	int a,b;
	 
		System.out.println("Birinci sayýyý giriniz : " );
				a=scan.nextInt();
		System.out.println("Ýkinci Sayýyý giriniz");
				b=scan.nextInt();
				
				
		System.out.println("Toplam sayý ="+ (a+b)+ " Olur.");//toplam
		System.out.println("Farký:" + (a-b)+ " Olur.");//fark
		System.out.println("Çarpýmlar = "+(a*b)+ " Olur.");//çarpým
	
	
//Ýkinci Ödev
	
		//Scanner scan1=new Scanner(System.in);
	int c,d;
		System.out.println("Bir Kenarýn Uzunluðunu Yazýnýz=");
			c=scan.nextInt();
			
		System.out.println("Karenin Alaný= "+(c*c));
		System.out.println("Karenin Çevresi= "+(c*4));
			
		
//Üçüncü ödev
		
	double e;
		System.out.println("Çemberin Yarý Çapýný Giriniz =");
			e=scan.nextDouble();
		 
		System.out.println("Çemberin Çevresi= "+(e*2*3.14));//Çevre
		System.out.println("Dairenin Alaný= "+(3.14*e*e) );
		
//Dorducu Ödev
	
		double f;
		double g;
		double h;
		System.out.println("Dikdorgenler Prizmasýnýn Uzun Kenarýný giriniz =");
			f=scan.nextDouble();
		System.out.println("Dikdorgenler Prizmasýnýn Kýsa Kenarýný giriniz =");
			g=scan.nextDouble();
		System.out.println("Dikdorgenler Prizmasýnýn Yüksek Kenarýný giriniz =");
			h=scan.nextDouble();
		System.out.println("Dikdorgenler Prizmasýnýn Hacmi =" +(f*g*h));
		
//Beþinci Ödev
		
		String adi,soyadi ;
		System.out.println("Lüfen Ýsminizi Giriniz ");
			adi=scan.next();
		System.out.println("Lütfen soyisminizi Giriniz");
			soyadi=scan.next();
		
		System.out.println("Sayýn ;" +adi+" " + soyadi + " Kursumuza Kaydýnýz Alýnmýþtýr,Teþekkür Ederiz." );

		
//Altýncý Ödev
		
		System.out.println("Adýnýzý Giriniz :");
			adi=scan.next();
		System.out.println("Soyisminizi Giriniz");
			soyadi=scan.next();
		System.out.println("isim Soyisim ="+adi +" "+ soyadi);
	
	
//Yedinci Ödev
		
		System.out.println("Adýnýz LÜtfen =");
			adi=scan.next();
		System.out.println("Ýsminizin Ýlk Harfi :"+ adi.charAt(0));

	 
	
	}
	}
	

