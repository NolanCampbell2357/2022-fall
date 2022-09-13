package Lecture;

public class MyArray {
    int numElements;
    int[] elements;

    public MyArray() {
        numElements = 0;
        elements = new int[5];
    }

    public void printArr() {
        System.out.printf("printArray(%d,%d)", numElements, elements.length);
        for (int i = 0; i < numElements; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }


    public int linearSearch(int nums[], int val) {
        for (int i = 0; i < nums.length; i++) {
            if (val == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] nums, int val) {
        int start = 0, end = nums.length - 1, mid;
        {
            mid = (start + end) / 2;
            if (val > nums[mid]) {
                start = mid + 1;
            } else if (val < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
