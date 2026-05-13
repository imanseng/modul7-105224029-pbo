import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Buat ArrayList<LayananEkspedisi> (Upcasting).
        ArrayList<LayananEkspedisi> daftarPengiriman = new ArrayList<>();

        // Menambahkan data paket sesuai soal
        daftarPengiriman.add(new LayananReguler("REG-11", 2.0, 50.0, 50.0, 50.0));
        daftarPengiriman.add(new LayananExpress("EXP-22", 5.0, 10.0, 10.0, 10.0));
        daftarPengiriman.add(new LayananInternasional("INT-33", 3.0, 20.0, 20.0, 20.0, "Korea", 100.0));

        // Buat variabel totalPendapatanPerusahaan = 0.0
        double totalPendapatanPerusahaan = 0.0;

        // Gunakan perulangan untuk menelusuri isi koleksi:
        for (LayananEkspedisi layanan : daftarPengiriman) {
            // Panggil cetakResi().
            layanan.cetakResi();
            // Tambahkan hasil hitungOngkir() tanpa parameter ke variabel totalPendapatanPerusahaan.
            totalPendapatanPerusahaan += layanan.hitungOngkir();
            // Gunakan instanceof dan Downcasting:
            if (layanan instanceof LayananReguler) { // Jika Reguler: panggil hitungOngkir(true, 25) dan tampilkan harganya.
                LayananReguler reguler = (LayananReguler) layanan;
                double ongkirReguler = reguler.hitungOngkir(true, 25);
                System.out.println("Harga Ongkir: Rp " + ongkirReguler);
            } else if (layanan instanceof LayananExpress) { // Jika Express: panggil klaimAsuransi(1500000).
                LayananExpress express = (LayananExpress) layanan;
                express.klaimAsuransi(1500000.0);
            } else if (layanan instanceof LayananInternasional) { // Jika Internasional: panggil cetakManifest().
                LayananInternasional internasional = (LayananInternasional) layanan;
                internasional.cetakManifest();
            }
        }

        // cetak total pendapatan keseluruhan perusahaan dari ongkir dasar (sebelum promo member/jarak)
        System.out.println("TOTAL PENDAPATAN PERUSAHAAN : Rp " + totalPendapatanPerusahaan);
    }
}
