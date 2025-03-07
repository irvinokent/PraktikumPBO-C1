/*  Program     : Titik.java
    Deskripsi   : Atribut dan method class titik.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 26 Februari 2025  */

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // public Titik() {
    //     this(0, 0);
    // }

    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // public Titik(double absis, double ordinat) {
    //     this.absis = absis;
    //     this.ordinat = ordinat;
    //     counterTitik++;
    // }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double y) {
        ordinat = y;
    }

    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return -1;
        }
    }

    public double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(absis - T.absis, 2) + Math.pow(ordinat - T.ordinat, 2));
    }

    public void refleksiX() {
        ordinat *= -1;
    }

    public void refleksiY() {
        absis *= -1;
    }

    public Titik getRefleksiX() {
        return new Titik(absis, ordinat * -1);
    }

    public Titik getRefleksiY() {
        return new Titik(absis * -1, ordinat);
    }

    public void printTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    public void printCounterTitik() {
        // System.out.println(this.counterTitik);
        System.out.println(getCounterTitik());  //  Call from object, not class.
    }
}
