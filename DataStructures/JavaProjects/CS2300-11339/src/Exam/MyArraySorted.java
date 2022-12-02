package Exam;

public class MyArraySorted<E> {
    E[] elements;
    int numElements;
    public MyArraySorted(int capacity){
        elements = (E[]) new Object[capacity];
        numElements = 0;
    }
    public void printArray(){
        System.out.printf("printArray(%d,%d): ",numElements, elements.length);
        for(int i=0; i<numElements; i++)
            System.out.print(elements[i] + " ");
        System.out.println();
    }
    public void add(E val){
        // Do nothing when the array is full
        // Insert the 'val' in the right place. Need to shift larger elements right first.
        // HINT: It would be easier to start right-most position of the array in a loop

        if(numElements == elements.length) {
            return;
        }

        elements[numElements] = val;
        for(int i = numElements; i > 0; i--) {
            if(((Comparable)elements[i]).compareTo(elements[i-1]) < 0) {
                E swap = elements[i];
                elements[i] = elements[i-1];
                elements[i-1] = swap;
            } else {
                break;
            }
        }
        numElements++;
    }
}