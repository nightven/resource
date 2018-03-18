package Lesson6.sladosti;

public class Wafell extends Confection {
    String taste;

    public Wafell(String name, double cost, double weight, double sugar, String taste){
        super(name, cost, weight, sugar);
    }

    public String getTaste() {
        return taste;
    }
}
