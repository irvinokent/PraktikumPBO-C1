/*  Program     : Main.java
    Deskripsi   : Main class generik Datum.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 30 April 2025  */

public class Main {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Iyenk"));
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Simba"));
        Datum<Burung> datumBurung = new Datum<>(new Burung("Yakob"));

        datumKucing.getIsi().bersuara();
        datumAnjing.getIsi().bersuara();
        datumBurung.getIsi().bersuara();
        System.out.println();

        ContohMetodeGenerik cmg = new ContohMetodeGenerik();

        cmg.printInfo(datumKucing);
        cmg.printInfo(datumAnjing);
        cmg.printInfo(datumBurung);
    }
}
