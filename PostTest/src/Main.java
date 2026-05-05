import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<MetodePembayaran> m1 = new ArrayList<MetodePembayaran>();
        m1.add(new EWallet());
        m1.add(new KartuKredit());
        for (MetodePembayaran metodePembayaran : m1) {
            if (metodePembayaran instanceof EWallet) {
                ((EWallet) metodePembayaran).bayar(100000, "081234567890");
            } else if (metodePembayaran instanceof KartuKredit) {
                ((KartuKredit) metodePembayaran).verifikasiPIN();
                ((KartuKredit) metodePembayaran).bayar(100000);
            } else {
                metodePembayaran.bayar(100000);
            }
        }
    }
}
