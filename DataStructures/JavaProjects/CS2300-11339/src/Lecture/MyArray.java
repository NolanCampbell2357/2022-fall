package Lecture;

public class MyArray {
    int numElements;
    int[] elements;

    public MyArray() {
        numElements = 0;
        elements = new int[1];
    }

    public void printArr() {
        System.out.printf("printArray(%d,%d) ", numElements, elements.length);
        for (int i = 0; i < numElements; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public void add(int val) {

        addElementIfNeeded(); // O(Elements.length) or O(1)

        elements[numElements] = val; // c1, 1
        numElements++;               // c2, 1
    } // O(Elements.length)

    public void addOrder(int idx, int val) { // Best: O(1), Worst: O(elements.length)
        // Insert 'val' at 'idx', Keep thins in the same order

        addElementIfNeeded(); // O(elements.length)

        for(int i = numElements; i > idx; i--) { // O(1) ~ O(numElements)
             elements[i] = elements[i-1];
        }

        elements[idx] = val;

        numElements++;
    }

    public void remove(int val) { // Best: O(1), Worst O(N)

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
            int[] newArr = new int[elements.length * 2]; // O(elements.length), 1

            for (int i = 0; i < numElements; i++) {      // c1, O(numElements)
                newArr[i] = elements[i];
            }

            elements = newArr;
    }

    public int search(int val) {
        return linearSearch(val);
    }

    private int linearSearch(int val) { // Best: O(1), Worst: O(numElements)
        for (int i = 0; i < numElements; i++) {
            if (val == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int val) {
        int start = 0, end = numElements - 1, mid;
        {
            mid = (start + end) / 2;
            if (val > elements[mid]) {
                start = mid + 1;
            } else if (val < elements[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // max() or min()
    public int max() {
        // Return maximum value in 'elements'

        int max = elements[0];
        for(int i = 1; i < numElements; i++) {
            if(elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }

    public int min() {
        // Return minimum value in 'elements'
        int min = elements[0];
        for(int i = 1; i < numElements; i++) {
            if(elements[i] < min) {
                min = elements[i];
            }
        }
        return min;
    }

    public void sort() { // O(N^2)
        // Make change to 'elements' so that numbers are in ascending order

        int swap;

        for(int i = 0; i < numElements - 1; i++) {
            for (int j = i + 1; j < numElements; j++) {
                if (elements[i] > elements[j]) {
                    swap = elements[i];
                    elements[i] = elements[j];
                    elements[j] = swap;
                }
            }
        }
    }

    public int[] getPositiveElements() {
        int positiveCount = 0;

        for(int i = 0; i < numElements; i++){
            if (elements[i] > 0) {
                positiveCount++;
            }
        }

        int[] newArr = new int[positiveCount];


        for(int i = 0, j = 0; i < numElements; i++){
            if (elements[i] > 0) {
                newArr[j] = elements[i];
                j++;
            }
        }
    }


}
