package Overriding;

public class BentukBeraksi {
    public static void main(String[] args) {
        bentuk bentuk1 = new bentuk();
        bentuk bentuk2 = new Segitiga();
        bentuk bentuk3 = new Persegi();

        bentuk1.gambar();
        bentuk2.gambar();
        bentuk3.gambar();
    }
}
