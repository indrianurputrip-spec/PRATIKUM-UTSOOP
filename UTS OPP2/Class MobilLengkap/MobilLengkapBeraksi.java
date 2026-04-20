public class MobilLengkapBeraksi {
    public static void main(String[] args) {
    mobil = new MobilLengkap();
        mobil.hidupkanMobil();
        mobil.ubahGigi();
        mobil.matikanMobil();
    }
}

class MobilLengkap {
    void hidupkanMobil() {
        System.out.println("Mobil dihidupkan");
    }

    void ubahGigi() {
        System.out.println("Gigi diubah");
    }

    void matikanMobil() {
        System.out.println("Mobil dimatikan");
    }
}