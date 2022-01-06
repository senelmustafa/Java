package PatikaÖdevleri.PatikaStore;

import java.util.Scanner;

public class Runner {
    static Urunler urunler = new Urunler();
    static CepTelefonu cepTelefonu = new CepTelefonu();
    static Laptop laptop = new Laptop();

    public static void main(String[] args) {

        ekran();
    }

    static void ekran() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Listeden marka seciniz");
        for (int i = 0; i < urunler.getMarkalar().length; i++) {
            System.out.println((i + 1) + ". " + urunler.getMarkalar()[i]);
        }
        int secimMarka = scan.nextInt();
        switch (secimMarka) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9:
                System.out.println("1.Cep telefonu\n2.Laptop");
                int secimTelLap = scan.nextInt();
                switch (secimTelLap) {
                    case 1:
                        cepTelefonu.kullaniciTelefonSecim(urunler.getMarkalar(), secimMarka);
                        break;
                    case 2:
                        laptop.kullaniciLaptopSecim(urunler.getMarkalar(), secimMarka);
                        break;
                    default:
                        System.out.println("Lutfen listeden secim yapiniz");
                        ekran();
                        break;
                }
                break;
            default:
                System.out.println("Lutfen listeden secim yapiniz");
                ekran();
                break;
        }
    }
}



