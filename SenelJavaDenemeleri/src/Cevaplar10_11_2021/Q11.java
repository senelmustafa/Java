package Cevaplar10_11_2021;

public class Q11 {
	public static void main(String[] args) {
		/*
		 * Asagidaki String degiskenini kullanarak konsolda A L i yazdiriniz. String
		 * pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
		String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char A = pickName.charAt(pickName.indexOf("A"));// A yı bul
		char L = pickName.charAt(pickName.indexOf("L"));
		char İ = pickName.toLowerCase().charAt(pickName.indexOf("i"));

		System.out.println("ALİ " + A + " " + L + " " + İ);

		
	}

}
