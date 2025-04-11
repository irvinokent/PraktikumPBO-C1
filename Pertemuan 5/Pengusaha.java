/*  Program     : Pengusaha.java
    Deskripsi   : Atribut dan method class Pengusaha.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 21 Maret 2025  */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha() {
        this("", LocalDate.now(), "", 0.0, "");
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja,
                     String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public int hitungMasaKerja() {  //  Dengan asumsi mengembalikan tahun.
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 0;
    }

    public double hitungPajak() {
        return (double) 15 / 100 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("  NPWP                  : " + npwp);
        System.out.println("  Masa Kerja            : " + hitungMasaKerja() + " Tahun");
        System.out.println("  Pajak                 : " + hitungPajak());
    }
}
