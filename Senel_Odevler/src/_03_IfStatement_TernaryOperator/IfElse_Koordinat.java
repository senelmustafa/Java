package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class IfElse_Koordinat {
    public static void main(String[] args) {
        //// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
    	Scanner scan=new Scanner(System.in);
    	System.out.println("x kordinatını giriniz");
    	
    	int x=scan.nextInt();
    	System.out.println("y kordinatını giriniz");
    	int y=scan.nextInt();
    	if (x==0 && y==0 ) {
    		System.out.println("böyle bir gölge yok");
    	}else if(x>0 && y>0) {
    		System.out.println("birinci böge");
    		
    	}else if(x<0 && y>0) {
    		System.out.println("ikinci bölge");
    		
    	}else if(x<0 & y<0) {
    	System.out.println("üçüncü bölge");
    
    	}else  if (x>0 && y<0) {
    		System.out.println("dördüncü bölge");
    }
}
}