import java.time.LocalDate;

public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen() {
    }

    public Dosen(String nip, String nama, LocalDate tanggalLahir,
    LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + getTanggalLahirFormatted());
        System.out.println("TMT             : " + getTMTFormatted());
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
    }
}
