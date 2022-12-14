/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Michael Alexander
 */

import java.util.*;
import static org.junit.Assert.*;  
import org.junit.Test; 

public class TestPenghitungNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahKomponenPembimbing, jumlahKomponenPenguji, jumlahPenguji;

        System.out.println("Masukkan jumlah komponen nilai pembimbing:");
        jumlahKomponenPembimbing = sc.nextInt();
        KomponenPenilaian komponenPembimbing = new KomponenPenilaian();

        System.out.println("Masukkan persentase komponen nilai pembimbing:");
        for (int i = 0; i < jumlahKomponenPembimbing; i++) {
            komponenPembimbing.addKomponen(sc.nextDouble());
        }

        System.out.println("Masukkan jumlah penguji:");
        jumlahPenguji = sc.nextInt();
        System.out.println("Masukkan jumlah komponen nilai penguji");
        jumlahKomponenPenguji = sc.nextInt();
        KomponenPenilaian komponenPenguji = new KomponenPenilaian();

        System.out.println("Masukkan persentase komponen nilai penguji:");
        for (int i = 0; i < jumlahKomponenPenguji; i++) {
            komponenPenguji.addKomponen(sc.nextDouble());
        }

        Nilai nilaiPembimbing = new Nilai(komponenPembimbing);
        Nilai[] nilaiPenguji = new Nilai[jumlahPenguji];
        for (int i = 0; i < jumlahPenguji; i++) {
            nilaiPenguji[i] = new Nilai(komponenPenguji);
        }

        double[] bobotNilaiAkhir = new double[jumlahPenguji + 1];
        for (int i = 0; i < bobotNilaiAkhir.length; i++) {
            if (i == 0) {
                System.out.println("Masukkan bobot penilaian pembimbing terhadap nilai akhir:");
            } else {
                System.out.printf("Masukkan bobot penilaian penguji %d terhadap nilai akhir:\n", i);
            }
            bobotNilaiAkhir[i] = sc.nextDouble();
        }

        System.out.println("Masukkan nilai dari pembimbing:");
        for (int i = 0; i < jumlahKomponenPembimbing; i++) {
            nilaiPembimbing.addNilai(sc.nextDouble());
        }

        for (int i = 0; i < jumlahPenguji; i++) {
            System.out.printf("Masukkan nilai dari penguji %d:\n", i + 1);
            for (int j = 0; j < jumlahKomponenPenguji; j++) {
                nilaiPenguji[i].addNilai(sc.nextDouble());
            }
        }

        double total = nilaiPembimbing.countNilaiAkhir()*(bobotNilaiAkhir[0]/100.0);
        for (int i = 0; i < jumlahPenguji; i++) {
            total += nilaiPenguji[i].countNilaiAkhir()*(bobotNilaiAkhir[i+1]/100.0);
        }

        System.out.println("Nilai akhir: " + total);
        System.out.println("Predikat: " + predikatNilai(total));
        assertEquals("E",TestPenghitungNilai.predikatNilai(total));
    }

    public void testPredikatNilai(){  
//        assertEquals("A",TestPenghitungNilai.predikatNilai(total));  
//        assertEquals("A-",TestPenghitungNilai.predikatNilai(total));
//        assertEquals("B+",TestPenghitungNilai.predikatNilai(total));
//        assertEquals("B",TestPenghitungNilai.predikatNilai(total));
//        assertEquals("B-",TestPenghitungNilai.predikatNilai(total));
//        assertEquals("C+",TestPenghitungNilai.predikatNilai(total));
//        assertEquals("C",TestPenghitungNilai.predikatNilai(total));
//        assertEquals("C-",TestPenghitungNilai.predikatNilai(total)); 
//        assertEquals("D",TestPenghitungNilai.predikatNilai(total)); 
    }  

    public static String predikatNilai(double nilai) {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 77) {
            return "A-";
        } else if (nilai >= 73) {
            return "B+";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 67) {
            return "B-";
        } else if (nilai >= 63) {
            return "C+";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

}


