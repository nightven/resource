package HW9;
// Опционально *сделать MyList параметризованным
public interface MyList {
     void addList(Object e);


    void clearList();
    boolean removeList(Object o);
    Object[] listToArray();
    int sizeList();
    boolean containsList(Object o);
    boolean containsAllList(MyList c);

}

