/*  Program     : Asersi2.java
    Deskripsi   : Demonstrasi asersi.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 7 Maret 2025  */

class Lingkaran {   //  Only one public class is allowed in a file.
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;

        assert jariJari > 0: "Jari-jari tidak boleh nol!";

        //  Concept error: Assertion is used to check code logics,
        //  not preventing faulty inputs or such, use if-else instead.

        Lingkaran l = new Lingkaran(jariJari);
        double keliling = l.hitungKeliling();

        System.out.println("Keliling lingkaran: " + keliling);
    }
}
