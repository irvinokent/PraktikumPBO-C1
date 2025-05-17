/*  Program     : ContohMetodeGenerik.java
    Deskripsi   : Atribut dan method class ContohMetodeGenerik.
    NIM/Nama    : 24060123120008/Irvino Kent Setiawan
    Tanggal     : Rabu, 30 April 2025  */

public class ContohMetodeGenerik {
    public <T extends Anabul> void printInfo(Datum<T> datum) {
        T anabul = datum.getIsi();

        if (anabul != null) {
            anabul.bersuara();
            anabul.gerak();
        } else {
            System.out.println("Datum kosong.");
        }
    }

    public <T extends Anabul> void gantiIsi()
}

/*  https://chatgpt.com/c/681199ae-43a0-8001-a575-1f2b5a30570b
    https://claude.ai/chat/d2a4fff2-aa40-4f21-8647-84aee66bf22b */
