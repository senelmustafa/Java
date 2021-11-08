package StringMethod_Odev;

public class Bir {

	public static void main(String[] args) {
//		String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini “Java
//		ogrenmek cok guzel.” sekline getirin.

		String str="Java ogrenmek123 Cok guzel@";
		System.out.println(str.replaceAll("\\d","").replace("@", "").replace("C", "c"));
		 
		 
		
		
		
		
	}

}
