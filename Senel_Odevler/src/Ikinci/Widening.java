package Ikinci;

public class Widening {

	public static void main(String[] args) {
	//birinci k�s�m	
		byte a=100;
		short b=a;
		int c=a;
		long d=a;
		float e=a;
		double f=a;
		
		System.out.println( "x "+ a+"  b "+b+" c "+c+"  d "+d+"  e "+e+"   f  "+f);
//ikinci k�s�m
		
		int buyuk=500;
		short orta=(short) buyuk;
		byte kucuk=(byte) buyuk;
		
			System.out.println("buyuk  :"+buyuk+"  orta  :" +orta + "  kucuk :"+kucuk);
		
		
//�cuncu odev
		float ondalik=2.10136f;
			System.out.println(ondalik);
			
//dorduncu odev
		
		double sayi1=255.36;
		int sayi2= (int) sayi1;
		byte sayi3=(byte) sayi2;
		
			System.out.println( "1.say� ="+sayi1+" 2.sayi="+sayi2+" 3.sayi="+sayi3);

		
//besinc �dev		
		int sayi4=100;
		int sayi5=50;
	
			System.out.println("iki say�y� b�l= "+sayi4/sayi5);
		
//alt�nc� �dev
		int sayi6=500;
		double sayi7=255.5;
		
			System.out.println("b�lme i�lemi ba�las�n ="+sayi6/sayi7);
		
//yedinci �dev
			
			byte veri1=100;
			short veri2=200;
			int veri3=300;
			long veri4=400;
			float veri5=5.1236f;
			double veri6=255.36;
			
			System.out.println("byte + short topla ="+(veri1+veri2));
			System.out.println("int * long= "+(veri3*veri4));
			System.out.println("float * double= "+(veri5*veri6));
			
			
			
			
			
			
		
		
		
		
	}

}
