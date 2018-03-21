package HW6.podarok;

import HW6.sladosti.Sladosti;

import java.util.ArrayList;

public interface PodarokBox {
    public double getFinalWeight(ArrayList<Sladosti> podarokBox, int sum);
    public void findElementSugar(ArrayList<Sladosti>PodarokBox);
    public StringBuilder findCandyByCost(double a, double b, ArrayList<Sladosti>PodarokBox);
}
