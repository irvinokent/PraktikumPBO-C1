import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;

    public DosenTamu() {
    }

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                     double gajiPokok, String fakultas, String nidk, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public String getNidk() {
        return nidk;
    }

    public LocalDate getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public void setTanggalBerakhirKontrak(LocalDate tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    public String getMasaKontrakBerakhir() {
        LocalDate today = LocalDate.now();
        Period sisa = Period.between(today, tanggalBerakhirKontrak);
        return sisa.getMonths() + " bulan " + sisa.getDays() + " hari";
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + getTanggalLahirFormatted());
        System.out.println("TMT             : " + getTMTFormatted());
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + getDeskripsiMasaKerja());
        System.out.println("Kontrak Berakhir: " + formatTanggal(tanggalBerakhirKontrak) +
                           " (" + getMasaKontrakBerakhir() + " lagi)");
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan       : 2.5% x Rp " +
                           String.format("%,.2f", gajiPokok) + " = Rp " +
                           String.format("%,.2f", hitungTunjangan()));
    }

    protected String formatTanggal(LocalDate date) {
        int day = date.getDayOfMonth();
        String month = date.getMonth().getDisplayName(TextStyle.FULL, new Locale("id", "ID"));
        int year = date.getYear();
        return day + " " + month + " " + year;
    }
}
