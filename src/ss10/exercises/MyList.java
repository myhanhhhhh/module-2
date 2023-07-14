package ss10.exercises;

import java.util.Arrays;
import java.util.SimpleTimeZone;

public class MyList<E> {
    public int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void add(E e, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException(" error index: " + index);
        } else if (elements.length == index + 1) {
            ensureCapa();
        }
        if (elements[index] == null) {
            size++;
            elements[index] = e;
        } else {
            if (size == elements.length) {
                ensureCapa();

            }
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = e;
            size++;
        }
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IllegalArgumentException("index: " + i + ", size" + i);
        }
        return (E) elements[i];
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("error index : " + index);
        } else {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
        System.out.println("da xoa thanh cong");
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
        return (E) elements;
    }
}

