public class Mahasiswa {
    String nama;
    String nim;

    void tampilkanNama() {
        System.out.println("Nama: " + nama);
    }

    void tampilkanNim() {
        System.out.println("NIM: " + nim);
    }

    void olahraga() {
        System.out.println("Olahraga favorit: Sepak bola");
    }

    // TAMBAHKAN BAGIAN INI:
    public static void main(String[] args) {
        // Membuat objek dari class Mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        
        // Mengisi nilai atribut
        mhs.nama = "Indria Nurputri Pratiwi";
        mhs.nim = "12345678";
        
        // Memanggil method
        mhs.tampilkanNama();
        mhs.tampilkanNim();
        mhs.olahraga();
    }
}