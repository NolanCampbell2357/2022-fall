package Lecture;

public class MyStackLL<E> implements StackInterface<E> {

    SLLNode<E> top; 

    @Override
    public void push(E val) {
        SLLNode<E> node = new SLLNode<E>(val);

        if (isEmpty()) {
            top = node;
            return;
        }

        node.next = top;
        top = node;
    }

    @Override
    public E pop() {
        if(isEmpty()) {
            return null;
        }

        E val = top.info;
        top = top.next();
        return val;
    }

    @Override
    public E peek() {
        if(isEmpty()) {
            return null;
        }

        return top.info;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void print() {
        SLLNode.printLinkedList(top);
    }
    
}
