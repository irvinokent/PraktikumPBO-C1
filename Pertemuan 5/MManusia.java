/*  Program     : MManusia.java
    Deskripsi   : Main class Manusia.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 21 Maret 2025  */

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS(
            "Satriyo",
            LocalDate.parse("2006-04-01"),
            "Jalan Seroja",
            15000000,
            "198302032006041002"
        );
        Pengusaha pe1 = new Pengusaha(
            "Adhy",
            LocalDate.parse("2000-01-01"),
            "Jalan Air",
            55000000,
            "000-556-773-212-000-5"
        );
        Petani pt1 = new Petani(
            "Nugraha",
            LocalDate.parse("1977-01-09"),
            "Jalan Bunga 9, Tembalang",
            5000000,
            "Wonogiri"
        );
        PNS p2 = new PNS(
            "Panji",
            LocalDate.parse("2010-04-01"),
            "",
            1000000,
            "198004212010041002"
        );

        p2.setAlamat("Jalan Panorama 111, Tembalang");

        System.out.println("Jumlah Manusia      : " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS          : " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha    : " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani       : " + Petani.getCounterPetani());

        System.out.println("\nPajak PNS p1        : " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 : " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1    : " + pt1.hitungPajak());

        System.out.println("\nMasa Kerja PNS p1           : " + p1.hitungMasaKerja() + " Tahun");
        System.out.println("Masa Kerja Pengusaha pe1    : " + pe1.hitungMasaKerja() + " Tahun");
        System.out.println("Masa Kerja Petani pt1       : " + pt1.hitungMasaKerja() + " Tahun\n");

        p1.cetakInfo();
        System.out.println("");
        pe1.cetakInfo();
        System.out.println("");
        pt1.cetakInfo();
        System.out.println("");
    }
}
