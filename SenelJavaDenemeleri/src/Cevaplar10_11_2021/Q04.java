package Cevaplar10_11_2021;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

    	Scanner scan = new Scanner(System.in);
		System.out.print("4 harfli bir kelime giriniz =");
		String  kelime = scan.nextLine();
		
		String d=(kelime.substring(3));
		String u=(kelime.substring(2,3));
		String i=(kelime.substring(1,2));
		String b=(kelime.substring(0,1));
		System.out.println(d+u+i+b);
		scan.close();
    }
}
