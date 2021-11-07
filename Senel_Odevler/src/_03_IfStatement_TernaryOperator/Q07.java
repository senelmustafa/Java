package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 System.out.print ("bir karakter giriniz =");
		Scanner scan=new Scanner(System.in);
		char harf=scan.next().charAt(0);
		
		if ('A'<=harf && harf<='Z') {
			System.out.println("büyük");
			
		} else if ('a'<=harf && harf<='z') {
			System.out.println("küçük");
			
		} else if ('0'<=harf && harf<='9') {
			System.out.println("rakam girdiniz");
		}else {
			System.out.print ("hatalı bir giriş yaptınız.");
		}
 
		}
 
	}

 