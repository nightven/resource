package HW12;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyOnWriteArrayList {
    public boolean add(String e) {


            Object[] elements = getArray();
            int len = elements.length;
            Object[] newElements = Arrays.copyOf(elements, len + 1);
            newElements[len] = e;
            setArray(newElements);
            return true;
    }
    ArrayList<String> auto = new ArrayList<>();
        auto.add("car Audi");
        auto.add("car Nissan");
        auto.add("truck Volvo");
        auto.add("truck Renault");
}
