package HW;

public class ArrayPractice {

    static void printArray(int[] nums) {
        // This function is complete. Here to help your test
        System.out.print("printArray(): ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }

    static void shiftRightArray(int[] nums) {
        // make change to nums.
        // Shift the elements to the right by 1 position. left most elements goes to the right most pos.
        // nums = [10,2,3,-5]. shiftRightArray(nums) will change it to [-5, 10, 2,3]

        if (nums.length <= 0) {
            return;
        }

        int lastVal = nums[nums.length - 1];

        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = lastVal;
    }

    static int[] generateEvenNumbers(int count) {
        // Return a new int array filled with n even numbers starting from 2.
        // eg) generateEvenNumbers(3) returns [2,4,6]
        // eg) generateEvenNumbers(5) returns [2,4,6,8,10]

        if (count < 0) {
            return null;
        }

        int evens[] = new int[count];

        int evenNum = 2;
        for (int i = 0; i < evens.length; i++) {
            evens[i] = evenNum;
            evenNum += 2;
        }

        return evens;
    }

    static int[] insertKeepOrder(int[] nums, int idx, int val) {
        // Return a new int array.
        // insert the given 'val' at index 'idx' pushing numbers to the right.
        //		insertKeepOrder([10,20,30],0,5) will return [5, 10, 20, 30]
        //		insertKeepOrder([10,20,30],1,5) will return [10, 5, 20, 30]

        if (idx < 0) {
            return null;
        }

        int length = idx > nums.length ? idx + 1 : nums.length + 1;
        int[] insertNums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            int insertPos = i >= idx ? i + 1 : i;
            insertNums[insertPos] = nums[i];
        }

        insertNums[idx] = val;

        return insertNums;
    }

    static int[] reverseNew(int[] nums) {
        // Return a new int array that is reversed version of nums
        // eg) reverseNew([1,2,3]) returns [3,2,1]
        // eg) reverseNew([5,1,2,3]) returns [3,2,1,5]

        int[] reverse = new int[nums.length];

        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = nums[nums.length - 1 - i];
        }

        return reverse;
    }

    public static void main(String[] args) {
        int[] nums1;

        // add you test codes below. You have freedom how to test.

        // shiftRightArray tests
        System.out.println("shiftRightArray tests:");

        nums1 = new int[0];
        shiftRightArray(nums1); // Just returns if array is empty
        printArray(nums1);

        nums1 = new int[]{10, 2, 3, -5, 20, 10, 4};
        shiftRightArray(nums1);
        printArray(nums1);

        nums1 = new int[]{-5};
        shiftRightArray(nums1);
        printArray(nums1);

        nums1 = new int[]{1, 2};
        shiftRightArray(nums1);
        printArray(nums1);

        nums1 = new int[]{1, 2, 3};
        shiftRightArray(nums1);
        printArray(nums1);
        System.out.println();

        // generateEvenNumbers tests
        System.out.println("generateEvenNumbers tests:");
        if (generateEvenNumbers(-1) == null) {
            System.out.println("Negative count returns null instead of throwing NegativeArraySizeException");
        }
        printArray(generateEvenNumbers(0));
        printArray(generateEvenNumbers(1));
        printArray(generateEvenNumbers(5));
        printArray(generateEvenNumbers(9));
        System.out.println();

        // insertKeepOrder tests
        System.out.println("insertKeepOrder tests:");
        if (insertKeepOrder(new int[0], -1, 5) == null) {
            System.out.println("Negative index returns null instead of throwing NegativeArraySizeException");
        }

        printArray(insertKeepOrder(new int[0], 0, 5));
        printArray(insertKeepOrder(new int[0], 5, 5));
        printArray(insertKeepOrder(new int[3], 5, 5));
        printArray(insertKeepOrder(new int[5], 5, 5));
        printArray(insertKeepOrder(new int[6], 5, 5));
        printArray(insertKeepOrder(new int[10], 5, 5));
        printArray(insertKeepOrder(new int[]{10,20,30},0,5));
        printArray(insertKeepOrder( new int[]{10,20,30},1,5));
        System.out.println();

        // reverseNew tests
        System.out.println("reverseNew tests:");
        printArray(reverseNew(new int[0]));
        nums1 = new int[30];
        nums1[0] = 1;
        nums1[29] = 2;
        printArray(reverseNew(nums1));
        printArray(reverseNew(new int[]{1, 2, 3}));
        printArray(reverseNew(new int[]{5, 1, 2, 3}));
        printArray(reverseNew(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10}));
    }

}