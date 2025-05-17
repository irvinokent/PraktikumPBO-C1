import java.util.*;

public class Collection {
    public static void main(String[] args) {
        Set<String> peserta = new HashSet<>();
        peserta.add("Ari");
        peserta.add("Andi");
        peserta.add("Budi");
        peserta.add("Andi");
        System.out.println("Hash set peserta: " + peserta);

        Set<String> pesertaLinked = new LinkedHashSet<>();
        pesertaLinked.add("Ari");
        pesertaLinked.add("Andi");
        pesertaLinked.add("Budi");
        pesertaLinked.add("Andi");
        System.out.println("Linked hast set peserta: " + pesertaLinked);

        

        PriorityQueue<Integer> antrianPrioritas = new PriorityQueue<>();
        antrianPrioritas.add(30);
        antrianPrioritas.add(10);
        antrianPrioritas.add(20);
        antrianPrioritas.add(5);
        System.out.println("Priority queue antrian: " + antrianPrioritas);
    }
}
