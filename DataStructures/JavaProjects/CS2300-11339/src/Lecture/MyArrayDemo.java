package Lecture;

public class MyArrayDemo {
    public static void main(String[] args) {
        MyArray nums1 = new MyArray();
        nums1.printArr();

        nums1.add(5);
       nums1.add(10);
//        nums1.add(15);
//        nums1.add(20);
//        nums1.add(25);
//        nums1.add(30);
//        nums1.add(35);

        nums1.printArr();

        nums1.remove(10);
        nums1.printArr();

        nums1.remove(5);
        nums1.printArr();

        nums1.remove(35);
        nums1.printArr();
    }
}
