import javax.annotation.processing.AbstractProcessor;

public class Concatenation {

	public static void main(String[] args) {
	String str1="java";
	String str2="guzel";
			int sayi1=5;
			int sayi2=4;
			
			System.out.println("java güzel 54= "+str1+" " + str2 +" "+ sayi1+sayi2);
			System.out.println("java 5 güzel = "+str1+" "+sayi1+" "+str2);
			System.out.println("Java 94       ="+str1+ " "+(sayi1+sayi2)+sayi2);
			System.out.println("java 19       ="+str1+(sayi1-sayi2)+(sayi1+sayi2));
			System.out.println("54 güzel    ="+sayi1+sayi2+" "+str2);

	}

}
