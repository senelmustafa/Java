package Ikinci;

public class BasitMatematik {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("x = " + x);
		System.out.println("++x degeri = " + ++x);//11 önce atama yaptı
		System.out.println("x = " + x);//11 en son atanan değerimiz
		
		x = 10;
		System.out.println("\nx++ degeri = " + x++);//11 değerini çıkarken 11 atadı fakat buraya yazdırmaz.
		System.out.println("x = " + x);	//12.satırda çıkarken atadığı değeri buraya yazdırır.
		
		x = 10;
		System.out.println("\nx-- degeri = " + x--);//10
		System.out.println("x = " + x);//9 16.satırda çıkarken bir azalttı değeri 17. satıra yazdırdı.
		
		x = 10;
		System.out.println("\n--x degeri = " + --x); //önce azalttı 
		System.out.println("x = " + x);//en sonki değer budur.

	}

}
