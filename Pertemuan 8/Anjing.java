/*  Program     : Anjing.java
    Deskripsi   : Atribut dan method subclass Anjing.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 30 April 2025  */

public class Anjing extends Anabul {
    public Anjing() {
        super("");
    }

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Anjing " + getNama() + " melata.");
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing " + getNama() + " bersuara guk-guk.");
    }
}
