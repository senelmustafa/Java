    package Sorular10_11_2021;

public class Q11 {
    public static void main(String[] args) {
	/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  harf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String  harf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // 1.yol
        System.out.println("istenilen str= " + harf.charAt(0) + " "
                + harf.substring(11,12) + " " + harf.toLowerCase().substring(8,9));

        // 2 .yol

      /*  int A=harf.indexOf("A");
        int L=harf.indexOf("L");
        int I=harf.indexOf("I");
        char A1=harf.charAt(A);
        char L1=harf.charAt(L);
        char I1=harf.toLowerCase().charAt(I);
        System.out.println(A1+" "+L1+ " "+I1);
        System.out.println(""+A1+L1+I1);
        */
        
        int A=harf.indexOf("A");
        int L=harf.indexOf("L");
        int I=harf.indexOf("I");
        char A1=harf.charAt(A);
        char L1=harf.charAt(L);
        char I1=harf.charAt(I);
        
        System.out.println(A1+" "+L1+" "+I1);
         
    }

}
