/*  Program     : Mahasiswa.java
    Deskripsi   : Atribut dan method class mahasiswa.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 26 Februari 2025  */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // static {
    //     listMatKul = new ArrayList<>();
    // }

    public Mahasiswa() {
        nim = "";
        nama = "";
        prodi = "";
        listMatKul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        listMatKul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setListMatKul(ArrayList<MataKuliah> listMatKul) {
        this.listMatKul = listMatKul;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    public int getJumlahSKS() {
        int jumlahSKS = 0;

        for (int i = 0; i < listMatKul.size(); i++) {
            jumlahSKS += listMatKul.get(i).getSks();
        }

        return jumlahSKS;
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public void printMhs() {
        System.out.println(" NIM: " + nim);
        System.out.println(" Nama: " + nama);
        System.out.println(" Prodi: " + prodi);
    }

    public void printDetailMhs() {
        System.out.println(" NIM: " + nim);
        System.out.println(" Nama: " + nama);
        System.out.println(" Prodi: " + prodi);
        System.out.println(" Mata kuliah: ");

        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println("  " + listMatKul.get(i).getNama());
        }

        System.out.println(" Dosen wali: " + dosenWali.getNama());
        System.out.println(" Nomor plat kendaraan: " + kendaraan.getNoPlat());
        System.out.println(" Jenis kendaraan: " + kendaraan.getJenis());
    }
}
