package Lecture;

public class MyArrayDemo {
    public static void main(String[] args) {
        MyArrayForString nums1 = new MyArrayForString();
        nums1.printArr();

        nums1.add("a");
        nums1.add("z");
        nums1.add("xc");
        nums1.add("abc");
        nums1.add("cd");
        nums1.add("bc");
        nums1.add("z");
        nums1.add("zz");

        nums1.sort();
        nums1.printArr();

        nums1.addOrder(4, "cat");

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
