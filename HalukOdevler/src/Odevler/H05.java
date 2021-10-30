package Odevler;

import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class H05 {

	public static void main(String[] args) {
		/*  Problem Tan�m�
        Mesafeyi ve h�z� al�p s�reyi hesaplayan bir kod yaz�n�z.
        �rne�in:�stanbul ile Ankara aras� 400km olarak �l��lmektedir. Bu yolu ortalama
        120 km/saat h�zla giden bir ara� ne kadar s�rede hedefe var�r?

        �rnek Ekran ��kt�s�
        Mesafeyi giriniz: 400
        H�z� giriniz: 100
        S�re 4 saattir.
     */
     
		System.out.println("mesafe lütfen ");
		Scanner scan =new Scanner(System.in);
				
			int mesafe = scan.nextInt();
		
		System.out.println("h�z l�tfen ");
			int hiz=scan.nextInt();
			
			System.out.println(mesafe/hiz);
	}

}
