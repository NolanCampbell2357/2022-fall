package Exam;

public class MyArraySortedDemo {
    public static void main(String[] args) {
        MyArraySorted<Integer> nums = new MyArraySorted<Integer>(5);

        nums.add(20); nums.printArray();
        nums.add(30); nums.printArray();
        nums.add(5); nums.printArray();
        nums.add(7); nums.printArray();
        nums.add(20); nums.printArray();
        nums.add(2); nums.printArray();
    }
}
