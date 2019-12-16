package com.miro;

public class Array<T> implements ArrayInterface<T> {

    private static final Integer ZERO = 0;
    private T[] data;

    public Array(int size, T[] input) {
        this.data = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            init(i, input[i]);
        }
    }

    @Override
    public boolean isEmpty() {
        return size() <= 1 && size().equals(ZERO);
    }

    @Override
    public Integer size() {
        return data.length;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (!isEmpty()) {
            return (T) data[index];
        } else {
            throw new IndexOutOfBoundsException("Array is empty");
        }
    }

    private void init(int index, T elem) {
        data[index] = elem;
    }

    @Override
    public void update(int index, T elem) throws IndexOutOfBoundsException {
        if (index > data.length + 1) {
            throw new IndexOutOfBoundsException("index is greater then size");
        } else {
            data[index] = elem;
        }
    }
}