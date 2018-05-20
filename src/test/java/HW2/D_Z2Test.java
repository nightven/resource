package HW2;

import org.junit.Test;

import static org.junit.Assert.*;

public class D_Z2Test {

    @Test
    public void areaOfTheTriangle() {
        D_Z2 dz2 = new D_Z2();
        int a = 2;
        int b = 2;
        int c = 2;
        double actual = dz2.areaOfTheTriangle(a,  b, c);
        double expeted = 1.7320508075688772;
    assertEquals(expeted, actual, 53);
    }
}