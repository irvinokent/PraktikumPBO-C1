/*  Program     : Persegi.java
    Deskripsi   : Atribut dan method class Persegi.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 14 Maret 2025  */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    /*  Konstruktor di bawah tidak bekerja jika atribut-atribut dari
        class BangunDatar di-set ke private karena tidak diwariskan
        secara langsung ke sublcass Persegi. Tetapi bekerja apabila
        atribut-atribut tersebut di-set ke protected karena diwarsikan
        langung ke subclass.    */

    // public Persegi(double sisi, String warna, String border) {
    //     jmlSisi = 4;
    //     this.warna = warna;
    //     this.border = border;
    //     this.sisi = sisi;
    // }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(sisi, 2) * 2);
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(" Sisi: " + sisi);
    }

    /*  Overriding method static sebaiknya jangan dilakukan. Tidak baik bagi
        kesehatan mental programmer.    */

    // public static void printCounterBangunDatar() {
    //     System.out.println("Jumlah objek BangunDatar: " + counterBangunDatar);
    // }
}
