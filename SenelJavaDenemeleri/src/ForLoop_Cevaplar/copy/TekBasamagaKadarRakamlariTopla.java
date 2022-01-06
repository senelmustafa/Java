/**
 * 
 */
package ForLoop_Cevaplar.copy;

import java.util.Scanner;

/**
 * @author CEL�L
 *
 */
public class TekBasamagaKadarRakamlariTopla {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        
        int num=scan.nextInt();
        
        addDigits(num); 
        scan.close();
    }
    private static int addDigits(int num) {
        nasil("agam kolay gelsin method run oluyor");
        
        for (int i = 0; i < 5; i++) {
            num=sum(num);
        
        if (num<10) 
            break;
        }
        return num;
    }
    private static int sum(int num) {
        
        int toplam =0;
        int rakam =0;
        while (num>0) {
            
            rakam = num%10;
            toplam+=rakam;
            num/=10;
        }
        System.out.println("Girdiginiz sayinin rakamlar toplami: "+toplam);
    
        return toplam;
    }
    private static void gozunAydin(String goygoy) {
        System.out.println("gozunAydin calisti "+goygoy);
        
    }
    private static void nasil(String mesaj) {
        System.out.println("nas�l methodu calisti:"+mesaj);
        
        gozunAydin("helal olsun bu method calisti ise dewamkeee");
        
    }
    
    
}
