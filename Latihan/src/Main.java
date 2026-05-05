import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<PerangkatPintar> perangkatPintars = new ArrayList<PerangkatPintar>();
        perangkatPintars.add(new LampuPintar());
        perangkatPintars.add(new AcPintar());
        for (PerangkatPintar perangkatPintar : perangkatPintars) {
            if (perangkatPintar instanceof AcPintar) // Soal 4
                ((AcPintar) perangkatPintar).aturSuhu(20);
            perangkatPintar.aktifkan();
        }

        /* Analsis: Pesan yang tercetak bisa berbeda sesuai perangkat aslinya masing-masing karena
        setiap perangkat pintar memiliki implementasi method aktifkan() yang berbeda (dioverride masing masing).
        Jadi meskipun list nya tipe data induk (PerangkatPintar), namun pembuatan objek tiap elemen nya memiliki implementasi
        method masing masing yang telah di override. sehingga ketika dipanggil method aktifkan, yang dipanggil punya
        method aktifkan subclass masing masing.
        */ 
    }
}
