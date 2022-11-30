import java.util.*;

public class ModulRPL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Komponen Penilaian");
        int jumlahKomponen = sc.nextInt();
        String[] komponenPenilaian = new String[jumlahKomponen];
        double[] bobotPenilaian = new double[3];

        for(int i = 0;i<jumlahKomponen;i++){
            System.out.printf("Masukkan komponen penilaian %d \n",i);
            komponenPenilaian[i] = sc.nextLine();
        }
        for(int i = 0;i<3;i++){
            if(i<2){
                System.out.printf("Masukkan bobot penilaian dosen penguji %d \n",i);
                bobotPenilaian[i] = sc.nextDouble();
            }
            else{
                System.out.println("Masukkan bobot penilaian dosen pembimbing");
                bobotPenilaian[i] = sc.nextDouble();
            }
        }

        System.out.println("Masukkan nilai dari dosen Pembimbing");
        Double nilaiPembimbing = sc.nextDouble();

        System.out.println("Masukkan nilai dari dosen Penguji 1:");
        Double nilaiPenguji1 = sc.nextDouble();

        System.out.println("Masukkan nilai dari dosen Penguji 2:");
        Double nilaiPenguji2 = sc.nextDouble();

        Double nilaiAkhirPembimbing = (bobotPenilaian[2] / 100) * nilaiPembimbing;
        Double nilaiAkhirPenguji1 = (bobotPenilaian[0] / 100) * nilaiPenguji1;
        Double nilaiAkhirPenguji2 = (bobotPenilaian[1] / 100) * nilaiPenguji2;

        System.out.println("Nilai Akhir Skripsi Mahasiswa: ");
        Double nilaiAkhirMahasiswa = nilaiAkhirPembimbing + nilaiAkhirPenguji1 + nilaiAkhirPenguji2;
        System.out.print(nilaiAkhirMahasiswa);


    }
}
