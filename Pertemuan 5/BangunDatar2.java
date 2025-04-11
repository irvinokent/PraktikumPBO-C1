/*  Program     : BangunDatar2.java
    Deskripsi   : Atribut dan method class BangunDatar2.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 21 Maret 2025  */

public abstract class BangunDatar2 {
    public int jmlSisi;
    public String warna;
    public String border;
    public static int counterBangunDatar = 0;

    public BangunDatar2() {
        counterBangunDatar++;
    }

    public BangunDatar2(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar2 X) {    //  Method di samping dan di bawah
        return this.getLuas() == X.getLuas();       //  bisa digunakan untuk membandingkan
    }                                               //  objek bangun datar yang berbeda.

    public boolean isEqualKeliling(BangunDatar2 X) {
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo() {
        System.out.println(" Jumlah sisi: " + jmlSisi);
        System.out.println(" Warna: " + warna);
        System.out.println(" Border: " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek BangunDatar2: " + counterBangunDatar);
    }
}

/*  Jika BangunDatar tidak dijadikan sebagai abstract class, method isEqualLuas()
    dan isEqualKeliling() pada class BangunDatar tidak dapat dibuat karena apabila
    ada method abstract pada suatu class maka class tersebut harus dibuat abstract.
    Kelebihan abstract class dibandingkan non-abstract adalah method-method abstract
    pada abstract class tidak perlu direalisasikan.  */
