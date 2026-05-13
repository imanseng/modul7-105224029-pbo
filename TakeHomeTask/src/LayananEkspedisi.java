public class LayananEkspedisi {
    // Atribut menggunakan access modifier protected agar dapat diturunkan langsung ke subclass
    protected String nomorResi;
    protected double beratAktualKg;
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    // Konstruktor
    public LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Buat metode double hitungBeratEfektif() yang mengembalikan nilai tertinggi antara berat aktual dan berat volumetrik. (Rumus volumetrik = (P x L x T) / 6000).
    public double hitungBeratEfektif() {
        double volumetrik = (panjang * lebar * tinggi) / 6000.0; // rumus volumetrik
        return Math.max(beratAktualKg, volumetrik); // Mengembalikan nilai tertinggi diantara berat aktual dan berat volumetrik
    }

    // Buat metode void cetakResi() yang mencetak nomor resi dan Berat Efektif yang digunakan.
    public void cetakResi() {
        System.out.println("Nomor Resi: " + nomorResi);
        System.out.println("Berat Efektif: " + hitungBeratEfektif() + " Kg");
    }

    // Buat metode polymorphic double hitungOngkir() yang mengembalikan 0.0.
    public double hitungOngkir() {
        return 0.0;
    }
}
