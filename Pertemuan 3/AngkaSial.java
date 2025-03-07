/*  Program     : AngkaSial.java
    Deskripsi   : Demonstrasi eksepsi.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Jumat, 7 Maret 2025  */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }

        System.out.println(angka + " bukan angka sial.");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial(); //  Uses Java-provided constructor,
                                        //  since we didn't define it ourselves.
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!");
        }   
    }
}

/*  Ketika eksepsi terjadi, baris 12 tidak dieksekusi,
    karena fungsi sudah throw exception dalam blok if.
    Baris 22 dieksekusi karena eksepsi dilemparkan oleh fungsi
    fungsi yang dipanggil baris 20: "as.cobaAngka(13);".  */
