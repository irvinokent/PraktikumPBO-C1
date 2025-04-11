import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai() {
    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    protected String formatTanggal(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return date.format(formatter);
    }

    public Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    public LocalDate hitungBUP(int batasUsiaPensiun) {
        LocalDate tanggalBUP = tanggalLahir.plusYears(batasUsiaPensiun);
        return LocalDate.of(tanggalBUP.getYear(), tanggalBUP.getMonthValue(), 1).plusMonths(1);
    }

    public String getDeskripsiMasaKerja() {
        Period masaKerja = hitungMasaKerja();
        return masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan";
    }

    public String getTanggalLahirFormatted() {
        return formatTanggal(tanggalLahir);
    }

    public String getTMTFormatted() {
        return formatTanggal(tmt);
    }

    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + getTanggalLahirFormatted());
        System.out.println("TMT             : " + getTMTFormatted());
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
    }
}
