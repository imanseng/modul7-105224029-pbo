public class LayananInternasional extends LayananEkspedisi {
    // Atribut tambahan: String negaraTujuan dan double nilaiBarangUSD
    private String negaraTujuan;
    private double nilaiBarangUSD;

    // Konstruktor LayananInternasional dengan inisialisasi tambahan negara dan nilai USD.
    public LayananInternasional(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    // Override hitungOngkir()
    @Override
    public double hitungOngkir() {
        // Tarif ongkir dasar = Rp 200.000 per Kg (dari Berat Efektif).
        double ongkirDasar = 200000.0 * hitungBeratEfektif(); 
        double pajak = 0.0;
        // Pajak Bea Cukai: Jika nilaiBarangUSD lebih dari 50 USD, maka dikenakan pajak sebesar 20% dari nilai ongkir dasar tersebut
        if (nilaiBarangUSD > 50.0) {
            pajak = 0.20 * ongkirDasar;
        }
        // Nilai kembalian adalah total dari ongkir dasar + pajak (jika ada).
        return ongkirDasar + pajak;
    }

    // Buat void cetakManifest(). Cetak: "Manifest Internasional ke [negaraTujuan] - Deklarasi Nilai: $[nilaiBarangUSD]"
    public void cetakManifest() {
        System.out.println("Manifest Internasional ke " + negaraTujuan + " - Deklarasi Nilai: $" + nilaiBarangUSD);
    }
}
