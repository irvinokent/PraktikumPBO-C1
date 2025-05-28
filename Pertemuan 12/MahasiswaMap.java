import java.util.HashMap;
import java.util.Map;

public class MahasiswaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("20231001", "Adi");
        mahasiswaMap.put("20231002", "Bambang");
        mahasiswaMap.put("20231003", "Cici");
        mahasiswaMap.put("20231004", "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
