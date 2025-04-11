/*  Program     : Main.java
    Deskripsi   : Main class BangunDatar2 dan subclassnya.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 21 Maret 2025  */

public class Main {
    public static void main(String[] args) {
        // BangunDatar2 B1 = new BangunDatar2();   // Tidak bisa diinstansiasi.
        BangunDatar2 P1 = new Persegi2(10, "hitam", "putih");
        Persegi2 P2 = new Persegi2(5, "hitam", "putih");
        BangunDatar2 L1 = new Lingkaran2(7, "hitam", "putih");
        Lingkaran2 L2 = new Lingkaran2(14, "hitam", "putih");

        P1.printInfo();
        System.out.println("");
        P2.printInfo();
        System.out.println("");
        L1.printInfo();
        System.out.println("");
        L2.printInfo();

        System.out.println("\n" + P1.isEqualLuas(P2));
        System.out.println(P2.isEqualKeliling(L1));
        System.out.println(L1.isEqualLuas(L2));
        System.out.println(L2.isEqualKeliling(P1) + "\n");

        P2.zoomIN();
        P2.printInfo();
        System.out.println("");
        P2.zoomOut();
        P2.printInfo();
        System.out.println("");
        L2.zoom(90);
        L2.printInfo();
        System.out.println("");
        L2.zoom(200);
        L2.printInfo();
        System.out.println(""); //  Pemanggilan method bekerja sesuai ekspektasi.
    }
}
