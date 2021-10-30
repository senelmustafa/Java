package Odevler;

public class H01_ {

	public static void main(String[] args) {
		//byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiriniz.
				byte byteMin=-128;
				byte byteMax=127;
				
				double shortMin=-32.768;
				double shortMax= 32.767;	
				
				double intMin = -2147483646;
				double intMax = 2147483646;
				
				double longMin=-9223372036854755807f;
				double longMax= 9223372036854755807f;
				
				float floatMin=	-2.123456f;
				float floatMax= 2.123456f;

				
				System.out.print(byteMin+" "+byteMax+" "+shortMin+" "+shortMax+" "+intMin+" "+intMax+" "+	longMin	+" "+floatMax);

	}

}
