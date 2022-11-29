package Lecture;

public class MyMaxHeap<E> implements QueueInterface<E> {

    E[] elements;
    int numElements;

    public MyMaxHeap() {
        elements = (E[]) new Object[10];
        numElements = 0;
    }

    int left(int i) {
        return 2*i+1;
    }

    int right(int i) {
        return 2*i+2;
    }

    int parent(int i) {
        return 2*i-1;
    }

    @Override
    public void enqueue(E val) {
        addElementIfNeeded();

        // insert new element to the last index
        elements[numElements] = val;

        // Bubble up inserted value
        reheapUp(numElements);
        numElements++;
    }   

    void reheapUp(int i) {
        if(i == 0) {
            return;
        }

        int pIdx = parent(i);
        if(((Comparable)elements[i]).compareTo(elements[pIdx]) > 0) {
            E swap = elements[i];
            elements[i] = elements[pIdx];
            elements[pIdx] = swap;
            reheapUp(pIdx);
        }
    }

    @Override
    public E dequeue() {
        // TODO Auto-generated method stub
        return null;
    }

    private void addElementIfNeeded() {
        if(isFull()) {    // O(1)
            addElement(); // O(elements.length)
        }
    }

    private boolean isFull() {
        return numElements == elements.length;
    }

    private void addElement() {
            E[] newArr = (E[]) new Object[elements.length * 2]; // O(elements.length), 1

            for (int i = 0; i < numElements; i++) {      // c1, O(numElements)
                newArr[i] = elements[i];
            }

            elements = newArr;
    }
}