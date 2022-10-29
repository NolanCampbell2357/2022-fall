package Lecture;

public class MyQueue<E> implements QueueInterface<E>{

    int front, rear, numElements;

    E[] elements;

    public MyQueue() {
        elements = (E[])new Object[5];
        numElements = 0;
        front = 0;
        rear = elements.length-1;
    }

    @Override
    public void enqueue(E val) {
        if(isEmpty()) {
            front = 0;
        }
        addElementIfNeeded();
        rear = (rear+1) % elements.length; 
        elements[rear] = val;
        numElements++;
    }

    @Override
    public E dequeue() {
        if(isEmpty()) {
            return null;
        }

        E val = elements[front];
        front = front+1 % elements.length;
        numElements--;

        return val;
    }

    private void addElementIfNeeded() {
        if(isFull()) {    
            addElement(); 
        }
    }

    private boolean isFull() {
        return numElements == elements.length;
    }

    private boolean isEmpty() {
        return numElements == 0;
    }

    private void addElement() {
            E[] newArr = (E[]) new Object[elements.length * 2]; 

            for (int i = front, j=0; j < numElements; i=(i+1)%elements.length, j++) { 
                newArr[j] = elements[i];
            }

            elements = newArr;

            front = 0;
            rear = numElements-1;
    }
}
