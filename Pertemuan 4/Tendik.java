import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;

    public Tendik() {
    }

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
    LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        int masaKerjaTahun = hitungMasaKerja().getYears();
        return 0.01 * masaKerjaTahun * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + getTanggalLahirFormatted());
        System.out.println("TMT             : " + getTMTFormatted());
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + getDeskripsiMasaKerja());
        System.out.println("BUP             : " + formatTanggal(hitungBUP(BUP)));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan       : 1% x " + hitungMasaKerja().getYears() + " x Rp " +
                String.format("%,.2f", gajiPokok) + " = Rp " +
                String.format("%,.2f", hitungTunjangan()));
    }
}
