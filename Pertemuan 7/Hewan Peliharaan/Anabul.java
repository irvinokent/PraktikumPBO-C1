/*  Program     : Anabul.java
    Deskripsi   : Atribut dan method class Anabul.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 25 April 2025  */

public class Anabul {
    private String nama;

    public Anabul() {
        this("");
    }

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println("Anabul " + nama + " bergerak.");
    }

    public void bersuara() {
        System.out.println("Anabul " + nama + " bersuara.");
    }
}
