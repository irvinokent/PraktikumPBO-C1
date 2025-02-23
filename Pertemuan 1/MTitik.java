/*  Program     : MTitik.java
    Deskripsi   : Main class titik.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 19 Februari 2025  */

public class MTitik {
    public static void main(String[] args) {
        // Titik T1 = new Titik();
        // T1.setAbsis(3);
        // T1.setOrdinat(4);
        // T1.printTitik();
        // T1.geser(3, 4);
        // T1.printTitik();

        // Titik T2 = T1;
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        // Titik T1 = new Titik();
        // Titik T2 = new Titik(3, 5);
        // System.out.println("Jumlah objek titik: " + Titik.getCounterTitik());
        // System.out.println("Jumlah objek titik: " + T2.getCounterTitik());

        Titik T1 = new Titik();
        System.out.print("Titik T1: ");
        T1.printTitik();

        Titik T2 = new Titik(3, 4);
        System.out.print("Titik T2: ");
        T2.printTitik();

        T1.setAbsis(-3);
        T1.setOrdinat(-4);
        System.out.println("Absis T1: " + T1.getAbsis());
        System.out.println("Ordinat T1: " + T1.getOrdinat());

        T2.geser(3, 4);
        System.out.println("Jarak T2 ke pusat: " + T2.getJarakPusat());
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));

        T1.refleksiX();
        T1.refleksiY();
        Titik T3 = T1.getRefleksiX();
        Titik T4 = T1.getRefleksiY();

        System.out.print("Titik T3: ");
        T3.printTitik();
        System.out.print("Titik T4: ");
        T4.printTitik();
    }
}
