package Lecture;

public class ArrayDemo {

    private static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static int[] copyArray(int[] nums) {
        int[] copy = new int[nums.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = nums[i];
        }
        return copy;
    }

    private static void shiftLeft(int[] nums) {
        // Make change to nums by shifting element to the left by 1
        // The value at the left-most position should go to the right most position

        if (nums.length <= 0) {
            return;
        }

        int firstVal = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = firstVal;
    }

    static void plusOneArray(int[] nums) {
        // Make change to the array 'nums' so that each number is added by 1
        // eg) if nums {10, 20, 30}, plusOneArray(nums) will change it as {11, 21, 31}

        for (int i = 0; i < nums.length; i++) {
            nums[i] += 1;
        }
    }

    static int[] plusOneArrayNew(int[] nums) {
        // Create and return a new array that has the numbers from nums added by 1

        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i] + 1;
        }

        return result;
    }

    static int[] generateMultiplesOf10(int count) {
        // create a new array that has 'count' number of muliples of 10 in increasing order

        int[] result = new int[count];

        for(int i = 0; i< result.length; i++) {
            result[i] = (i + 1) * 10;
        }

        return result;
    }

    static int[] insertAtTheBeginning(int[] nums, int val) {
        // Create and return a new array that has 'val' at index 0 and all the numbers from 'nums' after that

        int result[] = new int[nums.length + 1];

        result[0] = val;

        for (int i = 0; i < nums.length; i++) {
            result[i+1] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] nums1;
//        nums1 = new int[5];

        int[] nums1 = new int[5];
        nums1[0] = 10;
        nums1[1] = 20;
//        printArr(nums1);
//        nums1[2] = nums1[1];

        //int[] nums2 = copyArray(nums1);

        //nums1[0] = 99;
        //printArr(nums1);
//        System.out.println();
//        printArr(nums2);

//        System.out.println();
//        shiftLeft(nums1);
//        printArr(nums1);

//        nums1 = new int[]{5, 10, 20, 30, 31};
//        plusOneArray(nums1);
//        printArr(nums1);
//
//        nums1 = new int[0];
//        plusOneArray(nums1);
//        printArr(nums1);

//        nums1 = new int[]{5, 10, 20, 30, 31};
//        printArr(plusOneArrayNew(nums1));
//        System.out.println();
//        printArr(nums1);
//
//        nums1 = new int[0];
//        printArr(plusOneArrayNew(nums1));
//        printArr(nums1);

        //printArr(generateMultiplesOf10(10));

        nums1 = new int[]{5, 10, 20, 30, 31};
        printArr(insertAtTheBeginning(nums1, -10));
    }
}
