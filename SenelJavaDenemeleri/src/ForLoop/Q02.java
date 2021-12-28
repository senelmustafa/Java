package ForLoop;

public class Q02 {
	public static void main(String[] args) {

// 0-255 e kadar olan harflerin ,
		// sayı ve harf değerini konsola yazdırınız.

		for (int i = 0; i <= 1300; i++) {
			char harf=(char) i;//veriable char dan buyuk olduğu
			//için data casting komutu kullanılır
			System.out.println(i+"- "+harf);
		}

	}
}
