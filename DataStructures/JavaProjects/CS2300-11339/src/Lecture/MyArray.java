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

        addElementIfNeeded();

        elements[numElements] = val;
        numElements++;
    }

    public void remove(int val) {

        int idx = search(val);

        if (idx == -1) {
            return;
        }

        numElements--;
        elements[idx] = elements[numElements];
        elements[numElements] = 0;
    }

    private void addElementIfNeeded() {
        if(isFull()) {
            addElement();
        }
    }

    private boolean isFull() {
        return numElements == elements.length;
    }

    private void addElement() {
            int[] newArr = new int[elements.length * 2];

            for (int i = 0; i < numElements; i++) {
                newArr[i] = elements[i];
            }

            elements = newArr;
    }

    public int search(int val) {
        return linearSearch(val);
    }

    private int linearSearch(int val) {
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
}
