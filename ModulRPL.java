import java.util.*;

public class ModulRPL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Komponen Penilaian");

        int jumlahKomponen = sc.nextInt();

        String[] komponenPenilaian = new String[jumlahKomponen];
        double[] nilaiPenguji1 = new double[jumlahKomponen];
        double[] nilaiPenguji2 = new double[jumlahKomponen];
        double[] nilaiPembimbing = new double[jumlahKomponen];

        for(int i = 0; i < jumlahKomponen; i++){
            System.out.printf("Masukkan komponen penilaian %d \n",i+1);
            komponenPenilaian[i] = sc.next();
        }

        System.out.println("Masukkan bobot penilaian dosen pembimbing");
        double bobotPenilaianDosbing = sc.nextDouble();

        System.out.printf("Masukkan bobot penilaian dosen penguji \n");
        double bobotPenilaianDosenPenguji = sc.nextDouble();
        

        Double nilaiAkhirPembimbing = (double) 0;
        Double nilaiAkhirPenguji1 = (double) 0;
        Double nilaiAkhirPenguji2 = (double) 0;

        for(int i = 0; i < jumlahKomponen; i++){
            System.out.printf("Masukkan nilai komponen penilaian %s untuk dosen pembimbing \n",komponenPenilaian[i]);
            nilaiPembimbing[i] = sc.nextDouble();

            System.out.printf("Masukkan nilai komponen penilaian %s untuk dosen penguji 1 \n",komponenPenilaian[i]);
            nilaiPenguji1[i] = sc.nextDouble();

            System.out.printf("Masukkan nilai komponen penilaian %s untuk dosen penguji 2 \n",komponenPenilaian[i]);
            nilaiPenguji2[i] = sc.nextDouble();

            nilaiAkhirPembimbing += nilaiPembimbing[i];
            nilaiAkhirPenguji1 += nilaiPenguji1[i];
            nilaiAkhirPenguji2 += nilaiPenguji2[i];
        }

        nilaiAkhirPembimbing = nilaiAkhirPembimbing / jumlahKomponen;
        nilaiAkhirPenguji1 = nilaiAkhirPenguji1 / jumlahKomponen;
        nilaiAkhirPenguji2 = nilaiAkhirPenguji2 / jumlahKomponen;
        
        // Bagian ini KAYAKNYA ga perlu di print, biar by sistem aja jadi user gaperlu tau setiap dosen pembimbing sm penguji
        // masing" berapa soalnya udh diitung sm program
        nilaiAkhirPembimbing = nilaiAkhirPembimbing * (bobotPenilaianDosbing/100);
        System.out.println(nilaiAkhirPembimbing);

        nilaiAkhirPenguji1 = nilaiAkhirPenguji1 * (bobotPenilaianDosenPenguji/100);
        System.out.println(nilaiAkhirPenguji1);

        nilaiAkhirPenguji2 = nilaiAkhirPenguji2 * (bobotPenilaianDosenPenguji/100);
        System.out.println(nilaiAkhirPenguji2);

        
        Double nilaiAkhirMahasiswa = nilaiAkhirPembimbing + nilaiAkhirPenguji1 + nilaiAkhirPenguji2;

        String hasilAkhirMahasiswa = "";

        if (nilaiAkhirMahasiswa < 50) {
            hasilAkhirMahasiswa = "E";
        } else if (nilaiAkhirMahasiswa >= 50 && nilaiAkhirMahasiswa <= 59) {
            hasilAkhirMahasiswa = "D";
        } else if (nilaiAkhirMahasiswa >= 60 && nilaiAkhirMahasiswa <= 62) {
            hasilAkhirMahasiswa = "C";
        } else if (nilaiAkhirMahasiswa >= 63 && nilaiAkhirMahasiswa <= 66) {
            hasilAkhirMahasiswa = "C+";
        } else if (nilaiAkhirMahasiswa >= 67 && nilaiAkhirMahasiswa <= 69) {
            hasilAkhirMahasiswa = "B-";
        } else if (nilaiAkhirMahasiswa >= 70 && nilaiAkhirMahasiswa <= 72) {
            hasilAkhirMahasiswa = "B";
        } else if (nilaiAkhirMahasiswa >= 73 && nilaiAkhirMahasiswa <= 76) {
            hasilAkhirMahasiswa = "B+";
        } else if (nilaiAkhirMahasiswa >= 77 && nilaiAkhirMahasiswa <= 79) {
            hasilAkhirMahasiswa = "A-";
        } else {
            hasilAkhirMahasiswa = "A";
        } 

        System.out.printf("Nilai Akhir Sidang Skripsi Mahasiswa: %5.2f \n" , nilaiAkhirMahasiswa);
        System.out.println("Hasil Akhir Sidang Skripsi Mahasiswa: " + hasilAkhirMahasiswa);
    }
}
