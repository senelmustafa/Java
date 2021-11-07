package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
    	System.out.print("sayi gir =");
    	Scanner scan=new Scanner(System.in);
    	int y =scan.nextInt();
    	
    	String result=(y>=0) ? ((y<10) ? ("rakam") : ("pozitif sayi")) : ("negatif sayi") ;
    	System.out.print(result);
    	
    	if (y>=0) {
    		if(y<10) {
    			System.out.println("rakam");
    			
    		}else {
				System.out.println("pozitif sayı");
			}
    	}else {
			System.out.println("negatif sayi");
		}
    }
}
