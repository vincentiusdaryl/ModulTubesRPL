
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Edo Farrell Haryanto - 6182001025
 */
public class Nilai {

    private KomponenPenilaian komponen;
    private ArrayList<Double> nilai;

    public Nilai(KomponenPenilaian komponen) {
        this.komponen = komponen;
        this.nilai = new ArrayList<>();
    }

    public void addNilai(double nilai) {
        this.nilai.add(nilai);
    }

    public double countNilaiAkhir() {
        double total = 0;
        for (int i = 0; i < nilai.size(); i++) {
            total += (this.komponen.getPersentase(i) / 100.0) * this.nilai.get(i);
        }
        return total;
    }
}
