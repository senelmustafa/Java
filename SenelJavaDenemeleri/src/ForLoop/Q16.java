package ForLoop;

import java.util.Iterator;

public class Q16 {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */
    	int harf=65;
    	for (int baba = 0; baba <6; baba++) {

    		for (int evlat = 0; evlat <=baba; evlat++) {
    		
    			System.out.print((char)(harf+baba)+" ");
			}
    		System.out.println();
			
    	}
    }	
    }
  
 