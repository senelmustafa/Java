package ForLoop;

import java.util.Iterator;

public class Q05 {

    public static void main(String[] args) {
// Aşağıdaki şekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####

    	for (int satir= 1; satir <=5; satir++) {
    		for (int sutun =0; sutun <=0; sutun++) {
				System.out.print("#");
				for (int sutun2 =1; sutun2 <=5; sutun2++) {
					System.out.print("#");
			}
			
		}System.out.println();
    }
}
}
