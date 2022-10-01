package Lecture;

public class MyArray<E> {
    int numElements;
    E[] elements;

    public MyArray() {
        numElements = 0;
        elements = (E[]) new Object[1];
        int[] test = new int[5];
    }

    public void printArr() {
        System.out.printf("printArray(%d,%d) ", numElements, elements.length);
        for (int i = 0; i < numElements; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public void add(E val) {

        addElementIfNeeded(); // O(Elements.length) or O(1)

        elements[numElements] = val; // c1, 1
        numElements++;               // c2, 1
    } // O(Elements.length)

    public void addOrder(int idx, E val) { // Best: O(1), Worst: O(elements.length)
        // Insert 'val' at 'idx', Keep thins in the same order

        addElementIfNeeded(); // O(elements.length)

        for(int i = numElements; i > idx; i--) { // O(1) ~ O(numElements)
             elements[i] = elements[i-1];
        }

        elements[idx] = val;

        numElements++;
    }

    public void remove(E val) { // Best: O(1), Worst O(N)

        int idx = search(val); // O(1) ~ O(N)

        if (idx == -1) {
            return;
        }

        numElements--;
        elements[idx] = elements[numElements];
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

    public int search(E val) {
        return linearSearch(val);
    }

    private int linearSearch(E val) { // Best: O(1), Worst: O(numElements)
        for (int i = 0; i < numElements; i++) {
            if(elements[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(E val) {
        int start = 0, end = numElements - 1, mid;
        {
            mid = (start + end) / 2;
            if (((Comparable)val).compareTo(elements[mid]) > 0) {
                start = mid + 1;
            } else if (((Comparable)val).compareTo(elements[mid]) < 0) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // max() or min()
    public E max() {
        // Return maximum value in 'elements'

        E max = elements[0];

        for(int i = 1; i < numElements; i++) {
            if(((Comparable)elements[i]).compareTo(max) > 0) {
                max = elements[i];
            }
        }
        return max;
    }

    public E min() {
        // Return minimum value in 'elements'
        E min = elements[0];
        for(int i = 1; i < numElements; i++) {
            if(((Comparable)elements[i]).compareTo(min) < 0) {
                min = elements[i];
            }
        }
        return min;
    }

    public void sort() { // O(N^2)
        // Make change to 'elements' so that numbers are in ascending order

        E swap;

        for(int i = 0; i < numElements - 1; i++) {
            for (int j = i + 1; j < numElements; j++) {
                if (((Comparable)elements[i]).compareTo(elements[j]) > 0) {
                    swap = elements[i];
                    elements[i] = elements[j];
                    elements[j] = swap;
                }
            }
        }
    }
}
