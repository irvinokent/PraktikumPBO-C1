/*  Program     : Main.java
    Deskripsi   : Main class BangunDatar dan subclassnya.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 14 Maret 2025  */

public class Main {
    public static void main(String[] args) {
        BangunDatar heksagon = new BangunDatar(6, "putih", "hitam");
        Persegi square = new Persegi(5, "merah", "kuning");
        Lingkaran circle = new Lingkaran(20, "hijau", "biru");

        BangunDatar.printCounterBangunDatar();

        System.out.println("\nInfo heksagon: ");
        heksagon.printInfo();

        System.out.println("\nInfo persegi: ");
        square.printInfo();
        System.out.println("Luas persegi adalah: " + square.getLuas());
        System.out.println("Keliling persegi adalah: " + square.getKeliling());
        System.out.println("Diagonal persegi adalah: " + square.getDiagonal());

        System.out.println("\nInfo lingkaran: ");
        circle.printInfo();
        System.out.println("Luas lingkaran adalah: " + circle.getLuas());
        System.out.println("Keliling lingkaran adalah: " + circle.getKeliling());
        System.out.println("Diameter lingkaran adalah: " + circle.getDiameter());
    }
}
