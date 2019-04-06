package com.petrusandrey;

public interface MyMap {
    void clear();

    boolean containsKey(int key);

    boolean containsValue(int value);

    int get(int key);

    void put(int key, int value);

    void remove();

    int size();
}
