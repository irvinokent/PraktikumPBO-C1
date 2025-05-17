/*  Program     : Datum.java
    Deskripsi   : Atribut dan method class generik Datum.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 30 April 2025  */

public class Datum<T> {
    private T isi;

    public Datum() {
        this.isi = null;
    }

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isi) {
        this.isi = isi;
    }
}
