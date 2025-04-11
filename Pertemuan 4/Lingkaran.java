/*  Program     : Lingkaran.java
    Deskripsi   : Atribut dan method class Lingkaran.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 14 Maret 2025  */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border) {
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

    public void printInfo() {
        super.printInfo();
        System.out.println(" Jari: " + jari);
    }
}
