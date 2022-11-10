package Lecture;

public class MyBSTDemo {
    public static void main(String[] args) {
        MyBST<Integer> tr1 = new MyBST<Integer>();
        tr1.add(10);
        tr1.add(20);
        tr1.add(30);
        tr1.print();

        System.out.println(tr1.search(20));
        System.out.println(tr1.search(30));
    }
}
