import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String nidn;
    private final int BUP = 65;

    public DosenTetap() {
    }

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                      double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public double hitungTunjangan() {
        int masaKerjaTahun = hitungMasaKerja().getYears();
        return 0.02 * masaKerjaTahun * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + getTanggalLahirFormatted());
        System.out.println("TMT             : " + getTMTFormatted());
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + getDeskripsiMasaKerja());
        System.out.println("BUP             : " + formatTanggal(hitungBUP(BUP)));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan       : 2% x " + hitungMasaKerja().getYears() + " x Rp " +
                String.format("%,.2f", gajiPokok) + " = Rp " +
                String.format("%,.2f", hitungTunjangan()));
    }
}
