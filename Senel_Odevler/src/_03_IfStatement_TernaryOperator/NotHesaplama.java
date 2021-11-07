package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        /*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. ÖRNEKOLARAK>>Vize geçme ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.

        todo  :  Koşul kısmı
 			eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 arasında ise  
 			BA, 70(70 dahil)   ile 80 arasında ise 
 			BB, 60(60dahil) ile 70 arasında ise 
 			CB, 50(50 dahil) ile 60 arasında ise 
 			CC, 40(40 dahil) ile 50 arasında ise 
 			DC, 30(30 dahil) ile 40 arasında ise 
 			DD, 30 'dan düşük ise FF  gelmeli.
 			
         */
System.out.print("Vize sınav sonucunuzu giriniz");
Scanner scan= new Scanner(System.in);
double vize1=scan.nextDouble();
System.out.print("vize yüzdesini giriniz  :");
double vYuzde=scan.nextDouble();

System.out.print("final notunuz =");
double final1=scan.nextDouble();

System.out.print("final yuzdesini giriniz =");
double yfinal=scan.nextDouble();

double ort=(vize1*vYuzde/100)+(final1*yfinal/100);
System.out.println(ort);

if(ort>=90) {
	System.out.print("Geçme notunuz AA");
	
}else if (ort>=80) {
	System.out.println("Geçme notunuz BA");
}
else if (ort>=70) {
	System.out.println("Geçme notunuz BB");
} 
else if (ort>=60) {
	System.out.println("Geçme notunuz CB");
}
else if (ort>=50) {
	System.out.println("Geçme notunuz CC");
	
}else if (ort>=40) {
	System.out.println("Geçme notunuz DC");
	
}else if (ort>=30) {
	System.out.println("Geçme notunuz DD");
}else {
	System.out.println("KALDINIZ");
}

    }
}
