package HW;

public class MyArrayObjDemo {
    public static void main(String[] args) {
        MyArray<Rectangle> rectangles = new MyArray<Rectangle>();
        Rectangle r1 = new Rectangle(2, 5);
        Rectangle r2 = new Rectangle(2, 4.9);

        System.out.println(r1.getArea() + ", " + r1.getPerimeter()); // 10.0, 14.0
        rectangles.add(r1); rectangles.add(r2); rectangles.add(new Rectangle(1,9));
        rectangles.printArray(); // printArray(3,5): Rect(2.0,5.0) Rect(2.0,4.9) Rect(1.0,9.0)
        System.out.println(rectangles.search(r2)); // 1
        System.out.println(rectangles.search(new Rectangle(5.0,2.0))); // 0
        rectangles.sort(); rectangles.printArray(); // printArray(3,5): Rect(1.0,9.0) Rect(2.0,4.9) Rect(2.0,5.0)

        rectangles.add(new Rectangle(4.9, 2));
        rectangles.add(new Rectangle(15, 32.32));
        rectangles.add(new Rectangle(32.32, 15));
        rectangles.add(new Rectangle(0.5, 1));

        rectangles.printArray();
        rectangles.sort(); rectangles.printArray();
        System.out.println(rectangles.search(new Rectangle(5, 3)));
        System.out.println(rectangles.search(new Rectangle(15, 32.32)));

        System.out.println();

        MyArray<RightTriangle> rTriagles = new MyArray<RightTriangle>();
        RightTriangle rt1 = new RightTriangle(3, 4);
        RightTriangle rt2 = new RightTriangle(1, 1);

        System.out.println(rt1.getArea() + ", " + rt1.getPerimeter()); // 6.0, 12.0
        rTriagles.add(rt1); rTriagles.add(rt2); rTriagles.add(new RightTriangle(3.1, 3.9));
        rTriagles.printArray(); // printArray(3,5): RT(3.0,4.0) RT(1.0,1.0) RT(3.1,3.9)
        System.out.println(rTriagles.search(rt2)); // 1
        System.out.println(rTriagles.search(new RightTriangle(4,3))); // 0
        rTriagles.sort(); rTriagles.printArray(); // printArray(3,5): RT(1.0,1.0) RT(3.1,3.9) RT(3.0,4.0)

        rTriagles.add(new RightTriangle(4.9, 2));
        rTriagles.add(new RightTriangle(15, 32.32));
        rTriagles.add(new RightTriangle(32.32, 15));
        rTriagles.add(new RightTriangle(0.5, 1));

        rTriagles.printArray();
        rTriagles.sort(); rTriagles.printArray();
        System.out.println(rTriagles.search(new RightTriangle(5, 3)));
        System.out.println(rTriagles.search(new RightTriangle(15, 32.32)));
    }
}