package Polimorfisme;

public class HewanPolimor {
    public static void main(String[] args) {
        hewan hewan1 = new hewan();
        hewan hewan2 = new Herbivora();
        hewan hewan3 = new Karnivora();
        hewan hewan4 = new Kelinci();

        hewan1.suara();
        hewan2.suara();
        hewan3.suara();
        hewan4.suara();
    }
}