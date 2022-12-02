import java.util.*;

public class ModulRPL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Komponen Penilaian");

        // User memasukkan jumlah total komponen yang akan dinilai oleh dosen pembimbing dan dosen penguji
        int jumlahKomponen = sc.nextInt();

        // Membuat variabel berupa array
        // Variabel komponenPenilaian berupa array untuk menyimpan jenis komponen penilaian
        String[] komponenPenilaian = new String[jumlahKomponen];
        // Variabel nilaiPenguji1 dan nilaiPenguji2 berupa array untuk menyimpan nilai yang diberikan oleh
        // dosen penguji 1 dan dosen penguji 2
        double[] nilaiPenguji1 = new double[jumlahKomponen];
        double[] nilaiPenguji2 = new double[jumlahKomponen];
        // Variabel nilaiPembimbing berupa array untuk menyimpan nilai yang diberikan oleh dosen pembimbing
        double[] nilaiPembimbing = new double[jumlahKomponen];

        // Pada pengulangan dibawah berfungsi untuk memasukkan jenis komponen penilaian sebanyak jumlahKomponen
        for(int i = 0; i < jumlahKomponen; i++){
            System.out.printf("Masukkan komponen penilaian %d \n", i+1);
            komponenPenilaian[i] = sc.next();
        }
        
        // User memasukkan bobot yang dinilai oleh dosen pembimbing
        System.out.println("Masukkan bobot penilaian dosen pembimbing");
        double bobotPenilaianDosbing = sc.nextDouble();

        // User memasukkan bobot yang dinilai oleh dosen penguji
        System.out.printf("Masukkan bobot penilaian dosen penguji \n");
        double bobotPenilaianDosenPenguji = sc.nextDouble();

        // Pada pengulangan dibawah bertujuan untuk mengecek apakah total bobot sudah 100%?
        // Jika lebih dari 100% atau kurang dari 100% maka user akan diminta memasukkan ulang
        Double totalBobot = bobotPenilaianDosbing + (2 * bobotPenilaianDosenPenguji);
        while (totalBobot != 100) {
            if (totalBobot < 100) {
                System.out.println("Nilai yang anda masukkan kurang dari 100%, silakan masukkan ulang");
                System.out.println("Masukkan bobot penilaian dosen pembimbing");
                bobotPenilaianDosbing = sc.nextDouble();
                System.out.println("Masukkan bobot penilaian dosen penguji");
                bobotPenilaianDosenPenguji = sc.nextDouble();
                totalBobot = bobotPenilaianDosbing + (2 * bobotPenilaianDosenPenguji);
            } else if (totalBobot > 100) {
                System.out.println("Nilai yang anda masukkan lebih dari 100%, silakan masukkan ulang");
                System.out.println("Masukkan bobot penilaian dosen pembimbing");
                bobotPenilaianDosbing = sc.nextDouble();
                System.out.println("Masukkan bobot penilaian dosen penguji");
                bobotPenilaianDosenPenguji = sc.nextDouble();
                totalBobot = bobotPenilaianDosbing + (2 * bobotPenilaianDosenPenguji);
            }
        }
        
        // Mendeklarasi variable total nilai akhir dosen pembimbing, nilai akhir dosen penguji 1, dan nilai akhir dosen penguji 2
        Double nilaiAkhirPembimbing = (double) 0;
        Double nilaiAkhirPenguji1 = (double) 0;
        Double nilaiAkhirPenguji2 = (double) 0;

        // Pada pengulangan dibawah dosen pembimbing, dosen penguji 1, dan dosen penguji 2 akan nilai pada jenis komponen penilaian
        for(int i = 0; i < jumlahKomponen; i++){
            System.out.printf("Masukkan nilai komponen penilaian %s untuk dosen pembimbing \n",komponenPenilaian[i]);
            nilaiPembimbing[i] = sc.nextDouble();

            System.out.printf("Masukkan nilai komponen penilaian %s untuk dosen penguji 1 \n",komponenPenilaian[i]);
            nilaiPenguji1[i] = sc.nextDouble();

            System.out.printf("Masukkan nilai komponen penilaian %s untuk dosen penguji 2 \n",komponenPenilaian[i]);
            nilaiPenguji2[i] = sc.nextDouble();

            // Kemudian akan dijumlahkan sesuai dengan yang diberikan oleh dosen pembimbing, dosen penguji 1, dan dosen penguji 2
            nilaiAkhirPembimbing += nilaiPembimbing[i];
            nilaiAkhirPenguji1 += nilaiPenguji1[i];
            nilaiAkhirPenguji2 += nilaiPenguji2[i];
        }

        // Sesudah dijumlahkan maka akan dihitung rata-ratanya
        nilaiAkhirPembimbing = nilaiAkhirPembimbing / jumlahKomponen;
        nilaiAkhirPenguji1 = nilaiAkhirPenguji1 / jumlahKomponen;
        nilaiAkhirPenguji2 = nilaiAkhirPenguji2 / jumlahKomponen;
        
        // Sesudah didapatkan rata-ratanya kemudian akan dibagi sesuai dengan bobot yang telah ditentukan diawal
        nilaiAkhirPembimbing = nilaiAkhirPembimbing * (bobotPenilaianDosbing/100);
        nilaiAkhirPenguji1 = nilaiAkhirPenguji1 * (bobotPenilaianDosenPenguji/100);
        nilaiAkhirPenguji2 = nilaiAkhirPenguji2 * (bobotPenilaianDosenPenguji/100);

        // Sesudah didapatkan nilai akhir yang didapetkan mahasiswa kemudian akan ditentukan, apakah mahasiswa tersebut mendapatkan nilai
        // A atau A- atau B+ atau B atau B- atau C+ atau C atau D atau E
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

        // Program akan mengeluarkan nilai akhir (yang sudah dihitung) yang didapatkan oleh mahasiswa beserta dengan hasil akhirnya
        System.out.printf("Nilai Akhir Sidang Skripsi Mahasiswa: %5.2f \n" , nilaiAkhirMahasiswa);
        System.out.println("Hasil Akhir Sidang Skripsi Mahasiswa: " + hasilAkhirMahasiswa);
    }
}
