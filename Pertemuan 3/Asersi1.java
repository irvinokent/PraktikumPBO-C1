/*  Program     : Asersi1.java
    Deskripsi   : Demonstrasi asersi.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 7 Maret 2025  */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        if (x > 0) {
            System.out.println("x bilangan positif.");
        } else {
            assert x < 0: "Ada kesalahan kode.";
            
            System.out.println("x bilangan negatif");
        }
    }
}
