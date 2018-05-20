package HW2;

import org.junit.Test;

import static org.junit.Assert.*;

public class D_Z3Test {


    @Test
    public void circumference() {
        D_Z3 d_z3 = new D_Z3();
        double r = 2;
        double pi = Math.PI;
        double actual = d_z3.circumference(pi, r);
        double exepted = 12.566370614359172;
        assertEquals(exepted, actual, 53);
    }
}