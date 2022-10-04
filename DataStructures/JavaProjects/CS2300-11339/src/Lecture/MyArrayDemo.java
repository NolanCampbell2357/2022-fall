package Lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyArrayDemo {
    public static void main(String[] args) {

        ArrayList<Circle> list = new ArrayList<Circle>();

        Circle c2 = new Circle(5);

        list.add(c2);
        list.add(new Circle(10));
        list.add(new Circle(1));

        System.out.println(list);

        System.out.println(list.indexOf(c2));

        list.sort((a, b)-> a.compareTo(b));

        System.out.println(list);

        list.sort(Comparator.reverseOrder());

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        // MyArray<Circle> circles = new MyArray<>();


        // Circle c2 = new Circle(5);

        // circles.add(new Circle(10));
        // circles.add(c2);
        // circles.add(new Circle(10));

        // circles.printArr();

        // System.out.println(circles.search(c2));
        // System.out.println(circles.search(new Circle(5)));

        // circles.sort();
        // circles.printArr();

        // MyArray<String> str = new MyArray<String>();
        // str.printArr();

        // str.add("a");
        // str.add("z");
        // str.add("xc");
        // str.add("abc");
        // str.add("A");
        // str.add("bc");
        // str.add("z");
        // str.add("zz");

        // str.sort();
        // str.printArr();

        // str.addOrder(4, "cat");

        // str.printArr();

        // System.out.println(str.max());

        // MyArray<Double> myDouble = new MyArray<Double>();

        // myDouble.add(33.2);
        // myDouble.add(23.23);
        // myDouble.add(44.2);

        // myDouble.printArr();

        // myDouble.sort();

        // myDouble.addOrder(1, 11.1);
        // myDouble.printArr();
        // myDouble.remove(23.23);
        // myDouble.printArr();

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
