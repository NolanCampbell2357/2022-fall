package Lecture;

public class ArrayDemo {

    private static void printArr(int[] nums) {

                                                // cost     times
        for (int i = 0; i < nums.length; i++) { // c1       (nums.length+1)
            System.out.print(nums[i] + " ");    // c2       nums.length
        }
        System.out.println();                   // c3       1

        // T(nums.length) = c1 * (nums.length + 1) + c2 * nums.length + c3
        // (c1 + c2)nums.length + c1 + c3 = O(nums.length)
    }

    private static int[] copyArray(int[] nums) {

                                                    // cost     times
        int[] copy = new int[nums.length];          // nums.length       1
        for (int i = 0; i < copy.length; i++) {     // c2       copy.length + 1
            copy[i] = nums[i];                      // c3       copy.length
        }
        return copy;                                // c4       1

        // T(copy.length) = c1 * nums.length * 1 + c2 * (copy.length + 1) + c3 * copy.length + c4 * 1
        // (c1 + c2 + c3)copy.length + c2 + c4 = O(copy.length)
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

        for (int i = 0; i < result.length; i++) {
            result[i] = (i + 1) * 10;
        }

        return result;
    }

    static int[] insertAtTheBeginning(int[] nums, int val) {
        // Create and return a new array that has 'val' at index 0 and all the numbers from 'nums' after that

        int result[] = new int[nums.length + 1];

        result[0] = val;

        for (int i = 0; i < nums.length; i++) {
            result[i + 1] = nums[i];
        }

        return result;
    }

    static int linearSearch(int nums[], int val) {
        // return the index of an elements equal to 'val'
        // return -1 if 'val' is not found
                                                    //          times       times
                                                    // cost     best case   worst case
        for (int i = 0; i < nums.length; i++) {     // c1       1           nums.length + 1
            if (val == nums[i]) {                   // c2       1           nums.length
                return i;                           // c3       1           0
            }
        }
        return -1;                                  // c4       0           1

        // best
        // T(nums.length) = c1 + c2 + c3 = O(1)

        // worst
        // T(nums.length) = c1 * (nums.length+1) + c2 * nums.length + c4 * 1
        // (c1 + c2)nums.length + c1 + c4 = O(nums.length)
    }

    static int binarySearch(int[] nums, int val) {
        // return teh index of an elements equal to val
        // return -1 if val is not found
        // nums should be sorted in ascending order
        int start = 0, end = nums.length - 1, mid;

        while (start <= end) { // while the range has some elements
            mid = (start + end) / 2;
            if (val > nums[mid]) {
                start = mid + 1;
            } else if (val < nums[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
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

//        nums1 = new int[]{5, 10, 20, 30, 31};
//        printArr(insertAtTheBeginning(nums1, -10));

//        System.out.println(linearSearch(new int[]{20, 30, 40}, 30));
//        System.out.println(linearSearch(new int[]{20, 30, 40}, 50));
//        System.out.println(linearSearch(generateMultiplesOf10(1000000), 15));

        nums1 = generateMultiplesOf10(100);
        printArr(nums1);
        System.out.println();
        System.out.println(binarySearch(nums1, 60));
    }
}
