package Lecture;

import java.util.ArrayList;

public class MyStack2<E> extends ArrayList<E> implements StackInterface<E>{
    
    @Override
    public void push(E val) {
        super.add(val);
    }

    @Override
    public E pop() {
        if(super.isEmpty()) {
            return null;
        }

        E val = super.remove(super.size()-1);
        return val;
    }

    @Override
    public E peek() {
        if(super.isEmpty()) {
            return null;
        }
       
        return super.get(super.size()-1);
    }
    
    
    public void printArr() {
       System.out.println(super.toString());
    }
}
