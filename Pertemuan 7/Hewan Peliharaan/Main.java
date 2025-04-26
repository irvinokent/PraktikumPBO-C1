/*  Program     : Main.java
    Deskripsi   : Main class Anabul dan subclassnya.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 25 April 2025  */

public class Main {
    public static void main(String[] args) {
        Anabul[] anabul = new Anabul[4];
        anabul[0] = new Anabul("Ivan");
        anabul[1] = new Kucing("Iyenk");
        anabul[2] = new Anjing("Simba");
        anabul[3] = new Burung("Yakob");

        for (Anabul a : anabul) {
            a.gerak();
            a.bersuara();
        }
    }
}
