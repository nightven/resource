package Lesson6.sladosti;

public class Chocolade extends Confection {
    String filling;

    public Chocolade(String name, double cost, double weight, double sugar, String filling){
        super(name, cost, weight, sugar);
    }


    public String getFilling() {
        return filling;
    }
}
