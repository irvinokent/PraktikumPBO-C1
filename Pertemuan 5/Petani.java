/*  Program     : Petani.java
    Deskripsi   : Atribut dan method class Petani.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 21 Maret 2025  */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani() {
        this("", LocalDate.now(), "", 0.0, "");
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja,
                  String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsal_kota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public int hitungMasaKerja() {  //  Dengan asumsi mengembalikan tahun.
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 0;
    }

    public double hitungPajak() {
        return 0.0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("  Asal Kota             : " + asal_kota);
        System.out.println("  Masa Kerja            : " + hitungMasaKerja() + " Tahun");
        System.out.println("  Pajak                 : " + hitungPajak());
    }
}
