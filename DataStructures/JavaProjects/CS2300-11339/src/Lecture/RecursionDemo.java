package Lecture;

import java.util.Arrays;

public class RecursionDemo {
    static int factorial(int n) {
        System.out.printf("Factorial(%d)\n", n);
        if (n == 1) {
            return 1;
        }
        int res = n * factorial(n - 1);
        System.out.printf("Factorial(%d) about to return %d\n", n, res);
        return res;
    }

    /*
     * factorial(4)
     * factorial(3)
     * factorial(2)
     * factorial(1)
     * factorial(2) about to return 2
     * factorial(3) about to return 6
     * factorial(4) about to return 24
    */

    static int sumUpTo(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUpTo(n-1);
    }

    static int sumFromTo(int a, int b) {
        // Return the sum from a to b a + (a + 1) + ... + (b-1) + b
        // Assume a <= b
        return a == b ? b : a + sumFromTo(a+1, b) ;
    }

    static int power(int a, int b) {
        // eg) power(2, 3) returns 8 (= 2 * 2 * 2)

        return b == 0 ? 1 : a * power(a, b-1);
    }

    static int sumArray(int[] nums) {
        // return the sum of all numbers in the array
        // eg) sumArray({2, 5, 4}) return 11

        // if(nums.length == 0) {
        //     return 0;
        // }

        // int[] copy = new int[nums.length-1];
        
        // for(int i = 0; i < copy.length; i++) {
        //     copy[i] = nums[i+1];
        // }
        //return nums[0] + sumArray(copy);

        //return nums[0] + sumArray(Arrays.copyOfRange(nums, 1, nums.length));

        return sumArrayHelper(nums, 0);
    }

    static int sumArrayHelper(int[] nums, int start) {
        return start == nums.length ? 0 : nums[start] + sumArrayHelper(nums, start+1);
    }

    static int countPositive(int[] nums) {
        // return the number of positive elements in the array
        return countPositiveHelper(nums, 0);
    }

    static int countPositiveHelper(int[] nums, int start) {

        if(start == nums.length) {
            return 0;
        }

        
        return (nums[start] > 0 ? 1 : 0) + countPositiveHelper(nums, start+1);
    }

    static int sumLinkedList(SLLNode<Integer> node) {
        return (node == null ? 0 : node.info + sumLinkedList(node.next()));
    }

    static int countPositive(SLLNode<Integer> node) {
        if(node == null) {
            return 0;
        }
        return (node.info % 2 == 0 ? 1 : 0) + countPositive(node.next());
    }

    static SLLNode<Integer> positiveOnly(SLLNode<Integer> node) {
        // Make change to the list and keep only positive elements

        if(node == null) {
            return null;
        }

        if(node.info > 0) {
            node.setNext(positiveOnly(node.next()));
            return node;
        } else {
            return positiveOnly(node.next());
        }

    }
 
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(sumUpTo(5));

        System.out.println(sumFromTo(1, 5));

        System.out.println(power(2, 3));
        System.out.println(power(2, 0));

        int[] nums = {1, 2, 3, 4};

        System.out.println(sumArray(nums));

        System.out.println(countPositive(new int[]{2, -1, 3, -2, 5}));

        System.out.println(sumLinkedList(SLLNode.generateLL(5)));

        System.out.println(countPositive(SLLNode.generateLL(10)));

        
        SLLNode<Integer> node = SLLNode.generateLL(3, 2, -5, 6, 7, -4, 10);
        node = positiveOnly(node);
        SLLNode.<Integer>printLinkedList(node);
    }
}
