/*  Program     : MGaris.java
    Deskripsi   : Main class garis.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 19 Februari 2025  */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(0, -1);
        Titik T2 = new Titik(2, 1);
        Garis G1 = new Garis();
        Garis G2 = new Garis(T1, T2);

        System.out.print("Titik awal G1: ");
        G1.getT1().printTitik();
        System.out.print("Titik akhir G1: ");
        G1.getT2().printTitik();

        G2.setT1(new Titik(-1, -2));
        G2.setT2(new Titik(3, 2));
        System.out.println("\nGaris G2 setelah set: ");
        G2.printGaris();

        System.out.println("\nCounter garis: " + Garis.getCounterGaris());
        System.out.println("Panjang garis G1: " + G1.getPanjangGaris());
        System.out.println("Gradien garis G1: " + G1.getGradien());
        System.out.print("Titik tengah garis G1: ");
        G1.getTitikTengah().printTitik();

        System.out.println("\nApakah garis G1 dan G2 sejajar: " + G1.isSejajar(G2));
        G2.setT1(new Titik(0, 2));
        G2.setT2(new Titik(2, 0));
        System.out.println("Garis G2 setelah set: ");
        G2.printGaris();
        System.out.println("Apakah garis G1 dan G2 tegak lurus: " + G1.isTegakLurus(G2));

        System.out.print("\nPersamaan garis G1: ");
        G1.printPersamaanGaris();
        System.out.print("\nPersamaan garis G2: ");
        G2.printPersamaanGaris();
    }
}
