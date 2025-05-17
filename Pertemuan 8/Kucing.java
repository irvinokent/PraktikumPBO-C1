/*  Program     : Kucing.java
    Deskripsi   : Atribut dan method subclass Kucing.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 30 April 2025  */

public class Kucing extends Anabul {
    public Kucing() {
        super("");
    }

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Kucing " + getNama() + " melata.");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing " + getNama() + " berbunyi meong.");
    }
}
