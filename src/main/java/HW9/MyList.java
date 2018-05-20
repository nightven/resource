package HW9;

import java.util.Iterator;

// Опционально *сделать MyList параметризованным
public interface MyList extends Iterable<Object>{
     void addList(Object e);
     void clearList();
     boolean removeList(Object o);
     Object[] listToArray();
     int sizeList();
     boolean containsList(Object o);
     boolean containsAllList(MyList c);
     public Iterator<Object> iterator();

}

