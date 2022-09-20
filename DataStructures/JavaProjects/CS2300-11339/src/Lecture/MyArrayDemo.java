package Lecture;

public class MyArrayDemo {
    public static void main(String[] args) {
        MyArray nums1 = new MyArray();
        nums1.printArr();

        nums1.add(50);
       nums1.add(40);
        nums1.add(-10);
        nums1.add(32);
        nums1.add(60);
        nums1.add(20);
        nums1.add(10);
        nums1.add(32);

        nums1.sort();
        nums1.printArr();

        nums1.addOrder(4, 15);

        nums1.printArr();

//        nums1.printArr();
//
//        nums1.remove(10);
//        nums1.printArr();
//
//        nums1.remove(5);
//        nums1.printArr();
//
//        nums1.remove(35);
//        nums1.printArr();
    }
}
