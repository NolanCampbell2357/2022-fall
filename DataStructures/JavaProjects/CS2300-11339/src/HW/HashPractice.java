package HW;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashPractice {

    static void printWordCounts(String text){
        // Use HashMap to count each word.
        // Required to take O(N) while N is the word count of the input 'text'.

        String[] words = text.split(" ");

        // Create a HashMap 'wCounts'.
        // for each word in words,
        //      if you have seen the word before, then increment the count.
        //      else (you see the word for the first time), then create a new entry (word,1) in 'wCounts'

        HashMap<String, Integer> wCounts = new HashMap<String, Integer>();

        for(String word : words) {
            int val = 1 + (wCounts.containsKey(word) ?  wCounts.get(word) : 0);
            wCounts.put(word, val);
        }

        // print the count of each word.
        String output = "{";
        for (Map.Entry<String,Integer> entry : wCounts.entrySet()) {
            output += entry.getKey() + "=" + entry.getValue() + ", ";
        }
        output = output.substring(0, output.length()-2) + "}";
        System.out.println(output);
    }

    static int[] commonNumbers(int[] nums1, int[] nums2){
        // Return a new int array that contains the numbers included both in nums1 and in nums2
        // Required to take O(nums1.length + nums2.length). Hint: Use HashSet

        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int num : nums1) {
            set1.add(num);
        }

        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int num : nums2) {
            set2.add(num);
        }

        set2.retainAll(set1);

        return set2.stream().mapToInt(Number::intValue).toArray();
    }
    public static void main(String[] args) {
        String txt1 = "Hello World Hi Hi guys Hello ladies Hi boy Hi"; // N = 10
        printWordCounts(txt1); // {Hi=4, Hello=2, guys=1, ladies=1, World=1, boy=1} Order doesn't matter.
        printWordCounts("la la la sol sol"); // {sol=2, la=3}

        int[] nums1 = {5, 20, 10, 7, 13};
        int[] nums2 = {30, 10, 20, 40};
        int[] nums3 = {7, 5, 9, 11, 13, 4};
        System.out.println(Arrays.toString(commonNumbers(nums1, nums2))); // [20, 10]
        System.out.println(Arrays.toString(commonNumbers(nums2, nums3))); // []
        System.out.println(Arrays.toString(commonNumbers(nums3, nums1))); // [7, 5, 13]
    }
}