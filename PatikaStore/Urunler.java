package PatikaÖdevleri.PatikaStore;

public class Urunler {

    private int id = 101;
    private double fiyat;
    private int indirimOrani;
    private int stokMiktari;
    private String urunAdi, marka, hafizaBilgisi, ekranBoyutu, pilGucu, ram, renk;

    public int getId() {
        this.id++;
        return id;
    }

    public double getFiyat() {
        return fiyat;
    }

    public int getIndirimOrani() {
        return indirimOrani;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public void setIndirimOrani(int indirimOrani) {
        this.indirimOrani = indirimOrani;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setHafizaBilgisi(String hafizaBilgisi) {
        this.hafizaBilgisi = hafizaBilgisi;
    }

    public void setEkranBoyutu(String ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public void setPilGucu(String pilGucu) {
        this.pilGucu = pilGucu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public String getMarka() {
        return marka;
    }

    public String getHafizaBilgisi() {
        return hafizaBilgisi;
    }

    public String getEkranBoyutu() {
        return ekranBoyutu;
    }

    public String getPilGucu() {
        return pilGucu;
    }

    public String getRam() {
        return ram;
    }

    public String getRenk() {
        return renk;
    }

    public String[] getMarkalar() {
        return markalar;
    }

    public Urunler() {
    }

    public Urunler(int id, double fiyat, int indirimOrani, int stokMiktari, String urunAdi,
                   String marka, String hafizaBilgisi, String ekranBoyutu, String pilGucu,
                   String ram, String renk) {
        this.id = id;
        this.fiyat = fiyat;
        this.indirimOrani = indirimOrani;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.hafizaBilgisi = hafizaBilgisi;
        this.ekranBoyutu = ekranBoyutu;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;

    }

    static String[] markalar = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};


    @Override
    public String toString() {
        return
                "Id : " + id +
                        ", Fiyat : " + fiyat + "TL" +
                        ", Indirim Orani : % " + indirimOrani +
                        ", Stok Miktari : " + stokMiktari +
                        ", Urun Adi : '" + urunAdi +
                        ", \nMarka : '" + marka +
                        ", Hafiza Bilgisi : " + hafizaBilgisi +
                        ", Ekran Boyutu : '" + ekranBoyutu +
                        ", Pil Gucu : " + pilGucu +
                        ", Ram : " + ram +
                        ", Renk : " + renk;
    }
}
