package Lecture;

public class MyStack<E> implements StackInterface<E> {

    int numElements;
    E[] elements;

    public MyStack() {
        numElements = 0;
        elements = (E[]) new Object[5];
    }

    @Override
    public void push(E val) {
        addElementIfNeeded();
        elements[numElements] = val;
        numElements++;
    }

    @Override
    public E pop() {

        if (isEmpty()) {
            return null;
        }
        numElements--;
        return elements[numElements];
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }

        return elements[numElements - 1];
    }

    private void addElementIfNeeded() {
        if (isFull()) { // O(1)
            addElement(); // O(elements.length)
        }
    }

    private boolean isFull() {
        return numElements == elements.length;
    }

    private boolean isEmpty() {
        return numElements == 0;
    }

    private void addElement() {
        E[] newArr = (E[]) new Object[elements.length * 2]; // O(elements.length), 1

        for (int i = 0; i < numElements; i++) { // c1, O(numElements)
            newArr[i] = elements[i];
        }

        elements = newArr;
    }

    public void printArr() {
        System.out.printf("printArray(%d,%d) ", numElements, elements.length);
        for (int i = 0; i < numElements; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
