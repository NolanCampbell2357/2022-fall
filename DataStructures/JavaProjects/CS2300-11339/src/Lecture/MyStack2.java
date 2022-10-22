package Lecture;

import java.util.ArrayList;

public class MyStack2<E> extends ArrayList<E> implements StackInterface<E>{
    
    @Override
    public void push(E val) {
        super.add(val);
    }

    @Override
    public E pop() {
        E val = super.remove(super.size()-1);
        return val;
    }

    @Override
    public E peek() {
        return super.get(super.size()-1);
    }
    
}
