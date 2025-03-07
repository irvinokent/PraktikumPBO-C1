/*  Program     : AngkaSialException.java
    Deskripsi   : Demonstrasi eksepsi.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 7 Maret 2025  */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial!");
    }
}
