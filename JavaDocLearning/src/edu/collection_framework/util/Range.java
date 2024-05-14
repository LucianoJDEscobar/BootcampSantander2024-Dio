package edu.collection_framework.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public record Range(int inicio, int fim) implements Iterable<Integer> {

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

