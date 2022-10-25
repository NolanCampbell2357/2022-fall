package Lecture;

import java.util.LinkedList;

public class MyStackLL2<E> extends LinkedList<E> implements StackInterface<E> {
    @Override
    public E pop() {
        if(super.isEmpty()) {
            return null;
        }
        return super.pop();
    }

    @Override
    public E peek() {
        if(super.isEmpty()) {
            return null;
        }
        return super.peek();
    }    
}
