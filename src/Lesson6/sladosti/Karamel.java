package Lesson6.sladosti;


public class Karamel extends Confection {
    //апельсин, грейпфрут, кисла вишня, лимон лайм  суниця.
    private String filling;

     public Karamel(String name, double cost, double weight, double sugar, String filling){
        super(name, cost, weight, sugar);
    }

    public String getFilling() {
        return filling;
    }

}
