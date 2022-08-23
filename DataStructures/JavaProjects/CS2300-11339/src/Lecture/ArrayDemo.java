package Lecture;

public class ArrayDemo {

    private static void printArr(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static int[] copyArray(int[] nums) {
        int[] copy = new int[nums.length];
        for(int i = 0; i < copy.length; i++) {
            copy[i] = nums[i];
        }
        return copy;
    }

    private static void shiftLeft(int[] nums) {
        // Make change to nums by shifting element to the left by 1
        // The value at the left-most position should go to the right most position

        if(nums.length <= 0) {
            return;
        }

        int firstVal = nums[0];

        for(int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = firstVal;
    }

    public static void main(String[] args) {
//        int[] nums1;
//        nums1 = new int[5];

        int[] nums1 = new int[5];
        nums1[0] = 10;
        nums1[1] = 20;
//        printArr(nums1);
//        nums1[2] = nums1[1];

        int[] nums2 = copyArray(nums1);

        nums1[0] = 99;
        printArr(nums1);
//        System.out.println();
//        printArr(nums2);

        System.out.println();
        shiftLeft(nums1);
        printArr(nums1);
    }
}
