
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Edo Farrell Haryanto - 6182001025
 */
public class KomponenPenilaian {

    private ArrayList<Double> persentaseKomponen;

    public KomponenPenilaian() {
        this.persentaseKomponen = new ArrayList<>();
    }

    public void addKomponen(double persentase) {
        this.persentaseKomponen.add(persentase);
    }

    public double getPersentase(int idx) {
        return this.persentaseKomponen.get(idx);
    }
}
