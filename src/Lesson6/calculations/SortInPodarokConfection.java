package Lesson6.calculations;

import Lesson6.sladosti.Confection;
import Lesson6.podarok.Podarok;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SortInPodarokConfection {

   public double getWeightOfPdarok(ArrayList<Confection>box){
       ArrayList<Confection> filter = box.stream().filter(a -> a.getWeight().contains(weight)).collect(Collectors.toCollection());
//      тут типа через фор переберу и плюсону и верну вес подарка
//
    }
//
//    public ArrayList<Confection> getSortSugar

}
