package edu.collection_framework.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range2 implements Iterable<Integer> {

    private final int inicio;
    private final int fim;
    
    public Range2(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }
    
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int indice = inicio;
            
            @Override
            public boolean hasNext() {
                return indice < fim;
            }

            @Override
            public Integer next() {
                if (indice > fim) {
                    throw new NoSuchElementException("" + indice);
                }
                int currentIndex = indice;
                indice++;
                return currentIndex;
            }
        };
    }
}
