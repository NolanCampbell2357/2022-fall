package Lecture;

public class MyArrayForString {
    int numElements;
    String[] elements;

    public MyArrayForString() {
        numElements = 0;
        elements = new String[1];
    }

    public void printArr() {
        System.out.printf("printArray(%d,%d) ", numElements, elements.length);
        for (int i = 0; i < numElements; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public void add(String val) {

        addElementIfNeeded(); // O(Elements.length) or O(1)

        elements[numElements] = val; // c1, 1
        numElements++;               // c2, 1
    } // O(Elements.length)

    public void addOrder(int idx, String val) { // Best: O(1), Worst: O(elements.length)
        // Insert 'val' at 'idx', Keep thins in the same order

        addElementIfNeeded(); // O(elements.length)

        for(int i = numElements; i > idx; i--) { // O(1) ~ O(numElements)
             elements[i] = elements[i-1];
        }

        elements[idx] = val;

        numElements++;
    }

    public void remove(String val) { // Best: O(1), Worst O(N)

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
            String[] newArr = new String[elements.length * 2]; // O(elements.length), 1

            for (int i = 0; i < numElements; i++) {      // c1, O(numElements)
                newArr[i] = elements[i];
            }

            elements = newArr;
    }

    public int search(String val) {
        return linearSearch(val);
    }

    private int linearSearch(String val) { // Best: O(1), Worst: O(numElements)
        for (int i = 0; i < numElements; i++) {
            if (val == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(String val) {
        int start = 0, end = numElements - 1, mid;
        {
            mid = (start + end) / 2;
            if (val.compareTo(elements[mid]) > 0) {
                start = mid + 1;
            } else if (val.compareTo(elements[mid]) < 0) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // max() or min()
    public String max() {
        // Return maximum value in 'elements'

        String max = elements[0];
        for(int i = 1; i < numElements; i++) {
            if(elements[i].compareTo(max) > 0) {
                max = elements[i];
            }
        }
        return max;
    }

    public String min() {
        // Return minimum value in 'elements'
        String min = elements[0];
        for(int i = 1; i < numElements; i++) {
            if(elements[i].compareTo(min) < 0) {
                min = elements[i];
            }
        }
        return min;
    }

    public void sort() { // O(N^2)
        // Make change to 'elements' so that numbers are in ascending order

        String swap;

        for(int i = 0; i < numElements - 1; i++) {
            for (int j = i + 1; j < numElements; j++) {
                if (elements[i].compareTo(elements[j]) > 0) {
                    swap = elements[i];
                    elements[i] = elements[j];
                    elements[j] = swap;
                }
            }
        }
    }
}
