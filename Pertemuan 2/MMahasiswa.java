/*  Program     : Mahasiswa.java
    Deskripsi   : Main class mahasiswa.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 26 Februari 2025  */

public class MMahasiswa {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("101", "Dr. Sahal", "Informatika");
        Dosen dosen2 = new Dosen("102", "Dr. Annabil", "Informatika");
        MataKuliah matkul1 = new MataKuliah("201", "MBD", 3);
        MataKuliah matkul2 = new MataKuliah("202", "PBO", 3);
        Kendaraan kendaraan1 = new Kendaraan("301", "motor");
        Kendaraan kendaraan2 = new Kendaraan("302", "mobil");

        Mahasiswa mhs1 = new Mahasiswa("401", "Sahal", "Informatika");
        mhs1.addMatKul(matkul1);
        mhs1.addMatKul(matkul2);
        mhs1.setDosenWali(dosen1);
        mhs1.setKendaraan(kendaraan1);

        Mahasiswa mhs2 = new Mahasiswa("402", "Annabil", "Informatika");
        mhs2.addMatKul(matkul1);
        mhs2.addMatKul(matkul2);
        mhs2.setDosenWali(dosen2);
        mhs2.setKendaraan(kendaraan2);

        System.out.println("Jumlah SKS mahasiswa 1: " + mhs1.getJumlahSKS());
        System.out.println("Jumlah mata kuliah mahasiswa 1: " + mhs1.getJumlahMatKul());
        System.out.println("Detail mahasiswa 1:");
        mhs1.printDetailMhs();

        System.out.println("\nJumlah SKS mahasiswa 2: " + mhs2.getJumlahSKS());
        System.out.println("Jumlah mata kuliah mahasiswa 2: " + mhs2.getJumlahMatKul());
        System.out.println("Detail mahasiswa 2:");
        mhs2.printDetailMhs();
    }
}
