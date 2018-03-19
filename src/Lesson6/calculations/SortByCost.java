package Lesson6.calculations;

import Lesson6.sladosti.Sweets;

import java.util.ArrayList;
import java.util.Arrays;


public  class SortByCost  {

        public ArrayList<Sweets> SortByCost(ArrayList<Sweets>box){
            Sweets[] filter = Arrays.stream(box).sorted((o1, o2) -> {
                return o1.getCost() - o2.getCost();}).toArray(Sweets[]::new);
            return filter
        }
    }




