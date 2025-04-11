/*  Program     : PNS.java
    Deskripsi   : Atribut dan method class PNS.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 21 Maret 2025  */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS() {
        this("", LocalDate.now(), "", 0.0, "");
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int hitungMasaKerja() {  //  Dengan asumsi mengembalikan tahun.
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 8;
    }

    public double hitungPajak() {
        return (double) 10 / 100 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("  NIP                   : " + nip);
        System.out.println("  Masa Kerja            : " + hitungMasaKerja() + " Tahun");
        System.out.println("  Pajak                 : " + hitungPajak());
    }
}
