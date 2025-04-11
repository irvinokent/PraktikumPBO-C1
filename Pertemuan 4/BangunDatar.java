/*  Program     : BangunDatar.java
    Deskripsi   : Atribut dan method class BangunDatar.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 14 Maret 2025  */

public class BangunDatar {
    public int jmlSisi;
    public String warna;
    public String border;
    public static int counterBangunDatar = 0;

    // protected int jmlSisi;
    // protected String warna;
    // protected String border;
    // protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println(" Jumlah sisi: " + jmlSisi);
        System.out.println(" Warna: " + warna);
        System.out.println(" Border: " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek BangunDatar: " + counterBangunDatar);
    }
}
