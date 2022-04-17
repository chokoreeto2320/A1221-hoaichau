package ss10_DSA.baitap.Trienkhaicacphuongthuccuaarraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            element = new Object[capacity];

        } else {
            throw new IllegalArgumentException("capacity" + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        int size = 0;
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }

    }

    public boolean add(E elements) {
        if (element.length == size) {
            this.ensureCapacity(5);

        }
        element[size] = elements;
        size++;
        return true;
    }

    public void add(E elements, int index) {
        if (index > element.length) {
            throw new IllegalArgumentException("index" + index);
        } else if (element.length == size
        ) {
            this.ensureCapacity(5);
        }
        if (element[index] == null) {
            element[index] = elements;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                element[i] = element[i - 1];
            }
            element[index] = elements;
            size++;
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity" + minCapacity);
        }
    }

    public E get(int index) {
        return (E) element[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.element[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.element = Arrays.copyOf(this.element, this.size);
        v.size = this.size;
        return v;
    }

    public E remove(int index) {
        if (index < 0 || index > element.length) {
            throw new IllegalArgumentException("Error!!" + index);

        }
        E elements = (E) element[index];
        for (int i = 0; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return elements;
    }
}
