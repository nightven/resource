package HW6.sladosti;

import HW6.sladosti.Sladosti;

public class Karamel extends Sladosti {
    //бимбом 49,86грн\1000*0.25
    //апельсин 25г, 10г сахара
    // грейпфрут 26г  10.3г сахара
    // вишня 25г    9.8г сахара
    private String filling;

    public Karamel(String name, double cost, double weight, double sugar){
        super(name, cost, weight, sugar);
    }

    public String getFilling() {
        return filling;
    }
}
