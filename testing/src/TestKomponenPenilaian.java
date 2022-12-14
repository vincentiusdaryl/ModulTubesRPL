/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Michael Alexander
 */

import java.util.ArrayList;
import static org.junit.Assert.*;  
import org.junit.Test;  

public class TestKomponenPenilaian {
        private ArrayList<Double> persentaseKomponen;

    public TestKomponenPenilaian() {
        this.persentaseKomponen = new ArrayList<>();
    }

    public void addKomponen(double persentase) {
        this.persentaseKomponen.add(persentase);
    }

    public double getPersentase(int idx) {
        return this.persentaseKomponen.get(idx);
    }
}
