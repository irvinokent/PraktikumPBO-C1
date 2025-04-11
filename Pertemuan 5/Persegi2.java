/*  Program     : Persegi2.java
    Deskripsi   : Atribut dan method class Persegi2.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 21 Maret 2025  */

public class Persegi2 extends BangunDatar2 implements IResize {
    private double sisi;

    public Persegi2() {
        setJmlSisi(4);
    }

    public Persegi2(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

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

    public void zoomIN() {
        sisi *= 1.1;
    }

    public void zoomOut() {
        sisi *= 0.9;
    }

    public void zoom(int percent) {
        sisi *= (double) percent / 100;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(" Sisi: " + sisi);
    }
}
