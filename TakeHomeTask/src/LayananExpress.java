public class LayananExpress extends LayananEkspedisi {
    // Konstruktor LayananExpress memanggil konstruktor superclass.
    public LayananExpress(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // Override hitungOngkir(). Tarif dasar adalah Rp 30.000 per Kg (dihitung dari Berat Efektif)
    @Override
    public double hitungOngkir() {
        return 30000.0 * hitungBeratEfektif();
    }

    // Buat void klaimAsuransi(double nilaiBarang)
    public void klaimAsuransi(double nilaiBarang) {
        // Jika nilai barang > Rp 1.000.000, cetak: "Klaim Asuransi VIP Rp[nilai] untuk resi [nomorResi] sedang diproses prioritas.". 
        if (nilaiBarang > 1000000.0) {
            System.out.println("Klaim Asuransi VIP Rp" + nilaiBarang + " untuk resi " + nomorResi + " sedang diproses prioritas.");
        } else { // Jika tidak, cetak: "Klaim Asuransi Standar diproses dalam 7 hari kerja."
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja.");
        }
    }
}
