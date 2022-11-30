import java.util.*;

public class ModulRPL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan bobot nilai dari dosen Pembimbing:");
        int bobotPembimbing = sc.nextInt();

        System.out.println("Masukkan bobot nilai dari dosen Penguji 1:");
        int bobotPenguji1 = sc.nextInt();

        System.out.println("Masukkan bobot nilai dari dosen Penguji 2:");
        int bobotPenguji2 = sc.nextInt();

        System.out.println("Masukkan nilai dari dosen Pembimbing");
        Double nilaiPembimbing = sc.nextDouble();

        System.out.println("Masukkan nilai dari dosen Penguji 1:");
        Double nilaiPenguji1 = sc.nextDouble();

        System.out.println("Masukkan nilai dari dosen Penguji 2:");
        Double nilaiPenguji2 = sc.nextDouble();

        Double nilaiAkhirPembimbing = (bobotPembimbing / 100) * nilaiPembimbing;
        Double nilaiAkhirPenguji1 = (bobotPenguji1 / 100) * nilaiPenguji1;
        Double nilaiAkhirPenguji2 = (bobotPenguji2 / 100) * nilaiPenguji2;

        System.out.println("Nilai Akhir Skripsi Mahasiswa:");
        Double nilaiAkhirMahasiswa = nilaiAkhirPembimbing + nilaiAkhirPenguji1 + nilaiAkhirPenguji2;


    }
}
