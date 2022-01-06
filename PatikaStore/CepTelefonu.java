package PatikaÖdevleri.PatikaStore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CepTelefonu extends Urunler {

    public CepTelefonu() {
    }

    public CepTelefonu(int id, double fiyat, int indirimOrani, int stokMiktari, String urunAdi, String marka,
                       String hafizaBilgisi, String ekranBoyutu, String pilGucu, String ram, String renk) {
        super(id, fiyat, indirimOrani, stokMiktari, urunAdi, marka, hafizaBilgisi, ekranBoyutu, pilGucu, ram, renk);
    }


    List<CepTelefonu> elimizdekiTelefonlar() {
        CepTelefonu mobile1 = new CepTelefonu(getId(), 5000, 10, 50, "Mi Note 10", "Xiaomi", "64 gb", "6.1", "4000", " 4 gb", "Mavi");
        CepTelefonu mobile2 = new CepTelefonu(getId(), 3000, 20, 20, "Galaxy Note 10", "Samsung", "128 gb", "6.5", "5000", " 6 gb", "Siyah");
        CepTelefonu mobile3 = new CepTelefonu(getId(), 7000, 5, 10, "Iphone 12", "Apple", "256 gb", "6.1", "5000", " 4 gb", "Gri");
        CepTelefonu mobile4 = new CepTelefonu(getId(), 6000, 15, 50, "P40 Pro", "Huawei", "512 gb", "6.3", "5000", " 6 gb", "Kirmizi");
        CepTelefonu mobile5 = new CepTelefonu(getId(), 2000, 5, 30, "ZenPhone", "Asus", "64 gb", "6.1", "5000", " 3 gb", "Gri");
        CepTelefonu mobile6 = new CepTelefonu(getId(), 1000, 5, 15, "T12", "Casper", "32 gb", "5.1", "3000", " 2 gb", "Gri");

        List<CepTelefonu> telefonlar = Arrays.asList(mobile1, mobile2, mobile3, mobile4, mobile5, mobile6);

        return telefonlar;
    }

    void kullaniciTelefonSecim(String[] arr, int secim) {

        List yazdir = elimizdekiTelefonlar().stream().filter(t -> t.getMarka().equalsIgnoreCase(arr[secim - 1])).collect(Collectors.toList());

        if (yazdir.size() == 0) {
            System.out.println("Girdiginiz markanin telefonu bulunmamaktadir");
            Runner.ekran();
        }else System.out.println(yazdir);
    }
}

