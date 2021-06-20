package iterator_pattern;

import java.util.Iterator;

public interface Container<T> {
    public Iterator<T> getL2RIterator();
    public Iterator<T> getR2LIterator();
    public Iterator<T> getAlphabetIterator();
 }
 