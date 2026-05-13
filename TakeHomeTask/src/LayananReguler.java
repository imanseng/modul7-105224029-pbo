public class LayananReguler extends LayananEkspedisi {
    // Konstruktor LayananReguler memanggil konstruktor superclass
    public LayananReguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // Override hitungOngkir(). Tarif dasar adalah Rp 15.000 per Kg (dihitung dari Berat Efektif).
    @Override
    public double hitungOngkir() {
        return 15000.0 * hitungBeratEfektif();
    }

    // Buat metode double hitungOngkir(boolean isMember, int jarakKm)
    public double hitungOngkir(boolean isMember, int jarakKm) {
        // Ambil tarif dasar (panggil metode override di atas)
        double tarifDasar = hitungOngkir();
        // Jika isMember bernilai true, berikan diskon 10% dari tarif dasar.
        if (isMember == true) {
            tarifDasar *= 0.9;
        }
        // Setelah dipotong diskon (jika ada), tambahkan surcharge jarak jauh sebesar Rp 500 per jarakKm.
        tarifDasar += (500.0 * jarakKm);
        return tarifDasar;
    }
}
