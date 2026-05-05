public class KartuKredit extends MetodePembayaran {
    @Override
    public void bayar(double nominal) {
        System.out.println("Mencetak tagihan kartu kredit sebesar Rp. " + nominal);
    }

    public void verifikasiPIN() {
        System.out.println("Memverifikasi PIN kartu kredit... BERHASIL!");
    }
}
