public class EWallet extends MetodePembayaran {
    @Override
    public void bayar(double nominal) {
        System.out.println("Memotong saldo E-wallet sebesar Rp. " + nominal);
    }

    public void bayar(double nominal, String nomorHp) {
        System.out.println("Memotong saldo E-wallet sebesar Rp. " + nominal + " dari nomor " + nomorHp);
    }
    
}
