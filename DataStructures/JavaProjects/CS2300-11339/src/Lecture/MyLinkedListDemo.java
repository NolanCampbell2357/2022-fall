package Lecture;

public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList<Integer> nums1 = new MyLinkedList<Integer>();
        nums1.add(10);
        nums1.printLinkedList();

        nums1.add(20);
        nums1.add(30);
        nums1.add(40);
        nums1.printLinkedList();

        System.out.println(nums1.search(30));

        nums1.repeatEach();
        nums1.printLinkedList();

        // nums1.remove(30);
        // nums1.printLinkedList();
    
        // nums1.remove(10);
        // nums1.printLinkedList();

        // nums1.remove(10);
        // nums1.printLinkedList();

        // nums1.remove(40);
        // nums1.printLinkedList();

        // nums1.remove(20);
        // nums1.printLinkedList();

        // nums1.remove(40);
        // nums1.printLinkedList();
    }
}
