/*  Program     : Lingkaran2.java
    Deskripsi   : Atribut dan method class Lingkaran2.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 21 Maret 2025  */

public class Lingkaran2 extends BangunDatar2 implements IResize {
    private double jari;

    public Lingkaran2() {
        setJmlSisi(1);
    }

    public Lingkaran2(double diameter, String warna, String border) {
        super(1, warna, border);
        jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * Math.pow(jari, 2);
    }

    public double getKeliling() {
        return Math.PI * jari * 2;
    }

    public double getDiameter() {
        return jari * 2;
    }

    public void zoomIN() {
        jari *= 1.1;
    }

    public void zoomOut() {
        jari *= 0.9;
    }

    public void zoom(int percent) {
        jari *= (double) percent / 100;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(" Jari: " + jari);
    }
}
