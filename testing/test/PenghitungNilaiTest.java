/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael Alexander
 */
public class PenghitungNilaiTest {
    PenghitungNilai pn;
    public PenghitungNilaiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
      pn = new PenghitungNilai();
    }
    
    @After
    public void tearDown() {
      pn = null;    
}
    @Test
    public void testPredikatNilai(){
        double total = 30;
        assertEquals("E",predikatNilai(total));
}

   public static String predikatNilai(double nilai){
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
