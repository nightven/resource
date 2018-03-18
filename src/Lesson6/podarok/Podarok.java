package Lesson6.podarok;

import Lesson6.sladosti.Chocolade;
import Lesson6.sladosti.Confection;
import Lesson6.sladosti.Karamel;
import Lesson6.sladosti.Wafell;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Podarok {

    public static void createPodaroc() {

    }

    public static void main(String[] args) {

        ArrayList<Confection> list = new ArrayList<>();
        Confection karamel = new Karamel("\"Бим Бом\" Апельсин", 49.86, 25, 10);
        Confection karamel2 = new Karamel("\"Бим Бом\" Грейпфрут", 49.86, 26, 10.3);
        Confection karamel3 = new Karamel("\"Бим Бом\" Вишня", 49.86, 25, 9.8);
        Confection chocolade = new Chocolade("\"Крокант\" с измельченным миндалем", 145, 40, 16);
        Confection chocolade2 = new Chocolade("\"Инжир в шоколаде\" ручной работы", 450, 35, 12.5);
        Confection chocolade3 = new Chocolade("\"Pralines\" с молочным кремом и злаками", 350, 39, 15.8);
        Confection wafell = new Wafell("\"Дюймовочка\" вафельная конфета", 64, 35, 12.3);
        Confection wafell2 = new Wafell("\"Четыре мушкетера\" вафельная конфета", 58.6, 38, 14);
        Confection wafell3 = new Wafell("\"ЛЮБИМАЯ АЛЁНКА\" вафельная конфета", 115.5, 42, 15);

        list.add(karamel);
        list.add(karamel2);
        list.add(karamel3);
        list.add(chocolade);
        list.add(chocolade2);
        list.add(chocolade3);
        list.add(wafell);
        list.add(wafell2);
        list.add(wafell3);
//        for (int i = 0; i < list.size(); i++)
//            System.out.println(list.get(i).toString());
        ArrayList<Confection>box = new ArrayList<>();
        Pattern y = Pattern.compile("^(Д|д)(А|а)$");

        System.out.println("Давайте выберем какие конфеты положить в подарок.(отвечать да либо нет)");
        int k = 0;
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString() + " ложим в подарок ?");
            Scanner sc = new Scanner(System.in);
            if(sc.hasNext(y)) box.add(list.get(i));

            }
//            for (int j = 0; j < box.size(); j++) {
//                System.out.println(box.get(j).toString());
//            }
            }
       }













