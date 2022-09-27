package Lecture;

public class MyArrayForDouble {
    int numElements;
    double[] elements;

    public MyArrayForDouble() {
        numElements = 0;
        elements = new double[1];
    }

    public void printArr() {
        System.out.printf("printArray(%d,%d) ", numElements, elements.length);
        for (int i = 0; i < numElements; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public void add(double val) {

        addElementIfNeeded(); // O(Elements.length) or O(1)

        elements[numElements] = val; // c1, 1
        numElements++;               // c2, 1
    } // O(Elements.length)

    public void addOrder(int idx, double val) { // Best: O(1), Worst: O(elements.length)
        // Insert 'val' at 'idx', Keep thins in the same order

        addElementIfNeeded(); // O(elements.length)

        for(int i = numElements; i > idx; i--) { // O(1) ~ O(numElements)
             elements[i] = elements[i-1];
        }

        elements[idx] = val;

        numElements++;
    }

    public void remove(double val) { // Best: O(1), Worst O(N)

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
            double[] newArr = new double[elements.length * 2]; // O(elements.length), 1

            for (int i = 0; i < numElements; i++) {      // c1, O(numElements)
                newArr[i] = elements[i];
            }

            elements = newArr;
    }

    public int search(double val) {
        return linearSearch(val);
    }

    private int linearSearch(double val) { // Best: O(1), Worst: O(numElements)
        for (int i = 0; i < numElements; i++) {
            if (val == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(double val) {
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
    public double max() {
        // Return maximum value in 'elements'

        double max = elements[0];
        for(int i = 1; i < numElements; i++) {
            if(elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }

    public double min() {
        // Return minimum value in 'elements'
        double min = elements[0];
        for(int i = 1; i < numElements; i++) {
            if(elements[i] < min) {
                min = elements[i];
            }
        }
        return min;
    }

    public void sort() { // O(N^2)
        // Make change to 'elements' so that numbers are in ascending order

        double swap;

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

    public double[] getPositiveElements() {
        int positiveCount = 0;

        for(int i = 0; i < numElements; i++){
            if (elements[i] > 0) {
                positiveCount++;
            }
        }

        double[] newArr = new double[positiveCount];


        for(int i = 0, j = 0; i < numElements; i++){
            if (elements[i] > 0) {
                newArr[j] = elements[i];
                j++;
            }
        }

        return newArr;
    }


}
