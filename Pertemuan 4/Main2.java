import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("===== DATA TENAGA KEPENDIDIKAN =====");
        Tendik t1 = new Tendik(
            "197905232010011002",
            "Rina Mustika",
            LocalDate.of(1979, 5, 23),
            LocalDate.of(2010, 1, 1),
            4000000,
            "Bagian Administrasi"
        );
        t1.printInfo();

        System.out.println("\n===== DATA DOSEN TETAP =====");
        DosenTetap d1 = new DosenTetap(
            "198010102005121001",
            "Dr. Budi Santosa",
            LocalDate.of(1980, 10, 10),
            LocalDate.of(2005, 12, 1),
            6000000,
            "Fakultas Teknik",
            "100200300"
        );
        d1.printInfo();

        System.out.println("\n===== DATA DOSEN TAMU =====");
        DosenTamu d2 = new DosenTamu(
            "19901220202302001",
            "Dr. Sinta Wulandari",
            LocalDate.of(1990, 12, 20),
            LocalDate.of(2023, 2, 1),
            4500000,
            "Fakultas Ekonomi",
            "DK554433",
            LocalDate.of(2025, 12, 31)
        );
        d2.printInfo();
    }
}
