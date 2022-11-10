package Lecture;

public class MyBSTDemo {
    public static void main(String[] args) {
        MyBST<Integer> tr1 = new MyBST<Integer>();
        tr1.add(20);
        tr1.add(10);
        tr1.add(30);
        tr1.print();

        tr1.add(25);
        tr1.add(5);
        tr1.add(14);
        tr1.add(7);

        System.out.println(tr1.minimum());
        System.out.println(tr1.search(20));
        System.out.println(tr1.search(30));
        System.out.println(tr1.search(15));
        tr1.print();

        tr1.remove(30);
        tr1.print();
    }
}
