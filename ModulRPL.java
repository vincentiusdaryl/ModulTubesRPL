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

        for(int i = 1;i<=jumlahKomponen;i++){
            System.out.printf("Masukkan komponen penilaian %d \n",i);
            komponenPenilaian[i] = sc.next();
        }
                System.out.printf("Masukkan bobot penilaian dosen penguji \n");
                double bobotPenilaianDosbing = sc.nextDouble();

                System.out.println("Masukkan bobot penilaian dosen pembimbing");
                double bobotPenilaianDosenPenguji = sc.nextDouble();
            
        
        
        Double nilaiAkhirPembimbing = (double) 0;
        Double nilaiAkhirPenguji1 = (double) 0;
        Double nilaiAkhirPenguji2 = (double) 0;

        for(int i = 1;i<=jumlahKomponen;i++){
            System.out.printf("Masukkan nilai komponen penilaian %s untuk dosen pembimbing",komponenPenilaian[i]);
            nilaiPembimbing[i] = sc.nextDouble();
            System.out.printf("Masukkan nilai komponen penilaian %s untuk dosen penguji 1",komponenPenilaian[i]);
            nilaiPenguji1[i] = sc.nextDouble();
            System.out.printf("Masukkan nilai komponen penilaian %s untuk dosen penguji 2",komponenPenilaian[i]);
            nilaiPenguji2[i] = sc.nextDouble();
            nilaiAkhirPembimbing+=nilaiPembimbing[i];
            nilaiAkhirPenguji1+=nilaiPenguji1[i];
            nilaiAkhirPenguji2+=nilaiPenguji2[i];
        }
        nilaiAkhirPembimbing = nilaiAkhirPembimbing/jumlahKomponen;
        nilaiAkhirPenguji1 = nilaiAkhirPenguji1/jumlahKomponen;
        nilaiAkhirPenguji2 = nilaiAkhirPenguji2/jumlahKomponen;

        nilaiAkhirPembimbing = nilaiAkhirPembimbing/bobotPenilaianDosbing;
        nilaiAkhirPenguji1 = nilaiAkhirPembimbing/bobotPenilaianDosenPenguji;
        nilaiAkhirPenguji2 = nilaiAkhirPenguji2/bobotPenilaianDosenPenguji;

        System.out.println("Nilai Akhir Skripsi Mahasiswa: ");
        Double nilaiAkhirMahasiswa = nilaiAkhirPembimbing + nilaiAkhirPenguji1 + nilaiAkhirPenguji2;
        System.out.print(nilaiAkhirMahasiswa);


    }
}
