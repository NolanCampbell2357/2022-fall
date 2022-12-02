package Lecture;

public class MyMaxHeap<E> implements QueueInterface<E> {

    E[] elements;
    int numElements;

    public MyMaxHeap() {
        elements = (E[]) new Object[10];
        numElements = 0;
    }

    private int left(int i) {
        return 2*i+1;
    }

    private int right(int i) {
        return 2*i+2;
    }

    private int parent(int i) {
        return (i-1)/2;
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
        E t = elements[0];

        elements[0] = elements[numElements-1];
        numElements--;

        reheapDown(0);

        return t;
    }

    void reheapDown(int i) {
        // Compare your value vs. left child and right child

        if(i >= numElements) {
            return;
        }

        int l = left(i);
        int r = right(i);
        int largestIdx = i;
        if(l < numElements && ((Comparable)elements[largestIdx]).compareTo(elements[l]) < 0) {
            largestIdx = l;
        } 
        if (r < numElements && ((Comparable)elements[largestIdx]).compareTo(elements[r]) < 0) {
            largestIdx = r;
        }

        if(largestIdx != i) {
            E swap = elements[largestIdx];
            elements[largestIdx] = elements[i];
            elements[i] = swap;
            reheapDown(largestIdx);
        }
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

    public void printQueue() {
        System.out.print("printQueue(): ");
        for(int i = 0; i < numElements; i++) {
            System.out.print(elements[i] + ((i == numElements-1) ? "\n" : ", "));
        }
        System.out.println();
    }
}