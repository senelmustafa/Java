import java.util.Scanner;

import javax.naming.directory.DirContext;

import org.xml.sax.SAXNotRecognizedException;

public class IkinciOdev {

	public static void main(String[] args) {


//birinci �dev	
		Scanner scan=new Scanner(System.in);
	int a,b;
	 
		System.out.println("Birinci say�y� giriniz : " );
				a=scan.nextInt();
		System.out.println("�kinci Say�y� giriniz");
				b=scan.nextInt();
				
				
		System.out.println("Toplam say� ="+ (a+b)+ " Olur.");//toplam
		System.out.println("Fark�:" + (a-b)+ " Olur.");//fark
		System.out.println("�arp�mlar = "+(a*b)+ " Olur.");//�arp�m
	
	
//�kinci �dev
	
		//Scanner scan1=new Scanner(System.in);
	int c,d;
		System.out.println("Bir Kenar�n Uzunlu�unu Yaz�n�z=");
			c=scan.nextInt();
			
		System.out.println("Karenin Alan�= "+(c*c));
		System.out.println("Karenin �evresi= "+(c*4));
			
		
//���nc� �dev
		
	double e;
		System.out.println("�emberin Yar� �ap�n� Giriniz =");
			e=scan.nextDouble();
		 
		System.out.println("�emberin �evresi= "+(e*2*3.14));//�evre
		System.out.println("Dairenin Alan�= "+(3.14*e*e) );
		
//Dorducu �dev
	
		double f;
		double g;
		double h;
		System.out.println("Dikdorgenler Prizmas�n�n Uzun Kenar�n� giriniz =");
			f=scan.nextDouble();
		System.out.println("Dikdorgenler Prizmas�n�n K�sa Kenar�n� giriniz =");
			g=scan.nextDouble();
		System.out.println("Dikdorgenler Prizmas�n�n Y�ksek Kenar�n� giriniz =");
			h=scan.nextDouble();
		System.out.println("Dikdorgenler Prizmas�n�n Hacmi =" +(f*g*h));
		
//Be�inci �dev
		
		String adi,soyadi ;
		System.out.println("L�fen �sminizi Giriniz ");
			adi=scan.next();
		System.out.println("L�tfen soyisminizi Giriniz");
			soyadi=scan.next();
		
		System.out.println("Say�n ;" +adi+" " + soyadi + " Kursumuza Kayd�n�z Al�nm��t�r,Te�ekk�r Ederiz." );

		
//Alt�nc� �dev
		
		System.out.println("Ad�n�z� Giriniz :");
			adi=scan.next();
		System.out.println("Soyisminizi Giriniz");
			soyadi=scan.next();
		System.out.println("isim Soyisim ="+adi +" "+ soyadi);
	
	
//Yedinci �dev
		
		System.out.println("Ad�n�z L�tfen =");
			adi=scan.next();
		System.out.println("�sminizin �lk Harfi :"+ adi.charAt(0));

	 
	
	}
	}
	

