package HW6.sladosti;

import HW6.sladosti.Sladosti;

public class Chocolade extends Sladosti {
    //Шоколадные конфеты Крокант грильяж с измельченным миндалем 40г, 16г сахара 145грн
    //Конфеты ручной работы «Инжир в шоколаде» 35г, 12.5 г сахара 450грн
    //Шоколадные конфеты Pralines с молочным кремом и злаками 39г 13.8 г сахара 350грн
    String filling;


    public Chocolade(String name, double cost, double weight, double sugar ){
        super(name, cost, weight, sugar);

    }

    public String getFilling() {
        return filling;
    }


}
