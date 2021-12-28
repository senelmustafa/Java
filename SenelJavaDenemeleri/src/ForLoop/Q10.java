package ForLoop;

import java.util.Iterator;
import java.util.Scanner;

public class Q10 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
	 public static void main(String[] args) {
		 Scanner ekran=new Scanner(System.in);
		 System.out.println("harf giriniz : ");
		 String girilenharf=ekran.next();
		 String sesliHarfler="aeiuo";
		 String sessizHarfler="bcdfghjklmnprstvyzwq";
		 if (girilenharf.length()==1) {
		     
		         
		         if (sessizHarfler.contains(girilenharf)) {
		             
		             System.out.println("girilen harf sessizdir.");
		             
		             
		         }else if (sesliHarfler.contains(girilenharf)) {
		             System.out.println("sesli harf girildi.");
		         
		             
		         
		         }else {
		         
		             System.out.println("yanlış karakter girildi.");
		             
		         }
		     }
		     }
		 }