/*  Program     : Garis.java
    Deskripsi   : Atribut dan method class garis.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 19 Februari 2025  */

public class Garis {
    Titik T1;
    Titik T2;
    static int counterGaris = 0;

    Garis() {
        T1 = new Titik(0, 0);
        T2 = new Titik(1, 1);
        counterGaris++;
    }

    Garis(Titik T1, Titik T2) {
        this.T1 = T1;
        this.T2 = T2;
        counterGaris++;
    }

    Titik getT1() {
        return T1;
    }

    Titik getT2() {
        return T2;
    }

    void setT1(Titik T1) {
        this.T1 = T1;
    }

    void setT2(Titik T2) {
        this.T2 = T2;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    double getPanjangGaris() {
        return T1.getJarak(T2);
    }

    double getGradien() {
        if (T2.absis == T1.absis) {
            throw new ArithmeticException("Gradien tidak terdefinisi (garis vertikal).");
        }

        return (T2.ordinat - T1.ordinat) / (T2.absis - T1.absis);
    }

    Titik getTitikTengah() {
        return new Titik((T1.absis + T2.absis) / 2, (T1.ordinat + T2.ordinat) / 2);
    }

    boolean isSejajar(Garis G2) {
        return this.getGradien() == G2.getGradien();
    }

    boolean isTegakLurus(Garis G2) {
        return this.getGradien() * G2.getGradien() == -1;
    }

    // boolean isTegakLurus(Garis G2) {
    //     double epsilon = 1e-9; // Small threshold for floating-point precision
    //     return Math.abs(this.getGradien() * G2.getGradien() + 1) < epsilon;
    // }    

    void printGaris() {
        System.out.print(" T1: ");
        T1.printTitik();
        System.out.print(" T2: ");
        T2.printTitik();
    }

    void printPersamaanGaris() {
        double m = this.getGradien();
        double c = T1.ordinat - m * T1.absis;

        System.out.print("y = " + m + "x + " + c);
    }
}
