package bir;

public class Q_01 {

	public static void main(String[] args) {
	
		
		
		
		//konsolda alt satýra yazmak için \n yazarsak aþaðý satýra gönderir.
		
		
		int sayi=12345;
		int birler=sayi%10;
		int onler=(sayi/10)%10;
		int yuzler=(sayi/100)%10;
		int binler=(sayi/1000)%10;
		int onbinler=(sayi/10000)%10;

		//System.out.println(onbinler);
		//System.out.println(binler);
		//System.out.println(yuzler);
		//System.out.println(onler);
		//System.out.println(birler);
		
		System.out.println(onbinler+"\n"+binler+"\n"+yuzler+"\n"+onler+"\n"+birler);
		
		
		
	}

}
