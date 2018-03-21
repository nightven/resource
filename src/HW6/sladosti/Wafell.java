package HW6.sladosti;

import HW6.sladosti.Sladosti;

public class Wafell extends Sladosti {
    //Конфеты вафельные "Дюймовочка" 33г,12.3 г сахара 64грн
    //Конфеты глазурованные с вафельным корпусом Четыре мушкетера 38г, 14 г сахара 58.6грн
    // ВАФЕЛЬНАЯ КОНФЕТА «ЛЮБИМАЯ АЛЁНКА» 32г, 15г сахара 115.5 грн
    String taste;

    public Wafell(String name, double cost, double weight, double sugar){
        super(name, cost, weight, sugar);
    }

    public String getTaste() {
        return taste;
    }
}
