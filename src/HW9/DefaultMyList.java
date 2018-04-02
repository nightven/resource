package HW9;

import java.util.ArrayList;
import java.util.Iterator;

/*
Переопределить метод toString таким образом, чтобы результат выводился в виде:
{[результат вызова toString для элемента 1], [результат вызова toString для элемента 2], ... }

 */
public class DefaultMyList implements MyList {
    ArrayList<Object> myList = new ArrayList<>();



    @Override
    public void addList(Object e) {
        myList.add(e);

    }

    @Override
    public void clearList() {
        myList.clear();
    }

    @Override
    public boolean containsAllList(MyList c) {
        return myList.contains(c);
    }

    @Override
    public boolean containsList(Object o) {
        return myList.contains(o);
    }

    @Override
    public int sizeList() {
        return myList.size();
    }

    @Override
    public Object[] listToArray() {
        Object[] ob = new Object[myList.size()];
        ob = myList.toArray(ob);
        return ob;
    }

    @Override
    public boolean removeList(Object o) {
        return  myList.remove(o);
    }

}
class DefaultListIterable implements Iterable<Object> {

    @Override
    public Iterator<Object> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}

