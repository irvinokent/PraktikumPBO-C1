/*  Program     : Garis.java
    Deskripsi   : Atribut dan method class garis.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 26 Februari 2025  */

public class Garis {
    private Titik T1;
    private Titik T2;
    private static int counterGaris = 0;

    public Garis() {
        T1 = new Titik(0, 0);
        T2 = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik T1, Titik T2) {
        this.T1 = T1;
        this.T2 = T2;
        counterGaris++;
    }

    public Titik getT1() {
        return T1;
    }

    public Titik getT2() {
        return T2;
    }

    public void setT1(Titik T1) {
        this.T1 = T1;
    }

    public void setT2(Titik T2) {
        this.T2 = T2;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public double getPanjangGaris() {
        return T1.getJarak(T2);
    }

    public double getGradien() {
        if (T2.getAbsis() == T1.getAbsis()) {
            throw new ArithmeticException("Gradien tidak terdefinisi (garis vertikal).");
        }

        return (T2.getOrdinat() - T1.getOrdinat()) / (T2.getAbsis() - T1.getAbsis());
    }

    public Titik getTitikTengah() {
        return new Titik((T1.getAbsis() + T2.getAbsis()) / 2, (T1.getOrdinat() + T2.getOrdinat()) / 2);
    }

    public boolean isSejajar(Garis G2) {
        return this.getGradien() == G2.getGradien();
    }

    public boolean isTegakLurus(Garis G2) {
        return this.getGradien() * G2.getGradien() == -1;
    }

    // boolean isTegakLurus(Garis G2) {
    //     double epsilon = 1e-9; // Small threshold for floating-point precision
    //     return Math.abs(this.getGradien() * G2.getGradien() + 1) < epsilon;
    // }    

    public void printGaris() {
        System.out.print(" T1: ");
        T1.printTitik();
        System.out.print(" T2: ");
        T2.printTitik();
    }

    public void printPersamaanGaris() {
        double m = this.getGradien();
        double c = T1.getOrdinat() - m * T1.getAbsis();

        System.out.print("y = " + m + "x + " + c);
    }
}
