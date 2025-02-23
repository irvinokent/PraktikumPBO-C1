/*  Program     : Titik.java
    Deskripsi   : Atribut dan method class titik.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 19 Februari 2025  */

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Titik() {
    //     this(0, 0);
    // }

    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // Titik(double absis, double ordinat) {
    //     this.absis = absis;
    //     this.ordinat = ordinat;
    //     counterTitik++;
    // }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    int getKuadran() {
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

    double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getJarak(Titik T) {
        return Math.sqrt(Math.pow(absis - T.absis, 2) + Math.pow(ordinat - T.ordinat, 2));
    }

    void refleksiX() {
        ordinat *= -1;
    }

    void refleksiY() {
        absis *= -1;
    }

    Titik getRefleksiX() {
        return new Titik(absis, ordinat * -1);
    }

    Titik getRefleksiY() {
        return new Titik(absis * -1, ordinat);
    }

    void printTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    void printCounterTitik() {
        // System.out.println(this.counterTitik);
        System.out.println(getCounterTitik());  //  Call from object, not class.
    }
}
