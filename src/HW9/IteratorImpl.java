package HW9;

import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorImpl implements Iterator<Object> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super Object> action) {

    }
}
