package PatikaÖdevleri.PatikaStore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Laptop extends Urunler {
    public Laptop() {
    }

    public Laptop(int id, double fiyat, int indirimOrani, int stokMiktari, String urunAdi, String marka, String hafizaBilgisi,
                  String ekranBoyutu, String pilGucu, String ram, String renk) {
        super(id, fiyat, indirimOrani, stokMiktari, urunAdi, marka, hafizaBilgisi, ekranBoyutu, pilGucu, ram, renk);
    }

    List<Laptop> elimizdekiLaptoplar() {

        Laptop laptop1 = new Laptop(getId(), 1500, 10, 50, "Nirvana", "Casper", "128 gb", "15.6", "4000", " 4 gb", "Siyah");
        Laptop laptop2 = new Laptop(getId(), 2000, 5, 40, "G50", "Lenovo", "128 gb", "15.6", "5000", " 4 gb", "Siyah");
        Laptop laptop3 = new Laptop(getId(), 25000, 15, 60, "Pavilion", "HP", "256 gb", "15.6", "5000", " 6 gb", "Gri");
        Laptop laptop4 = new Laptop(getId(), 3000, 25, 70, "TUF", "Asus", "256 gb", "17", "3000", " 6 gb", "Kirmizi");
        Laptop laptop5 = new Laptop(getId(), 4000, 10, 30, "MateBook", "Huawei", "1512 gb", "15.6", "4000", " 8 gb", "Mavi");
        Laptop laptop6 = new Laptop(getId(), 5000, 20, 50, "GalaxyBook", "Samsung", "512 gb", "13.3", "5000", " 8 gb", "Siyah");
        Laptop laptop7 = new Laptop(getId(), 8000, 25, 40, "Razer X", "Monster", "1 tb", "15.6", "5000", " 16 gb", "Gri");
        Laptop laptop8 = new Laptop(getId(), 12000, 15, 10, "Macbook Air", "Apple", "1 tb", "13.3", "5000", " 16 gb", "Gri");

        List<Laptop> laptoplar = Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8);

        return laptoplar;
    }

    void kullaniciLaptopSecim(String[] arr, int secim) {
        List yazdir = elimizdekiLaptoplar().stream().filter(t -> t.getMarka().equalsIgnoreCase(arr[secim - 1])).collect(Collectors.toList());

        if (yazdir.size() == 0) {
            System.out.println("Girdiginiz markanin laptopu bulunmamaktadir");
            Runner.ekran();
        } else System.out.println(yazdir);
    }
}
