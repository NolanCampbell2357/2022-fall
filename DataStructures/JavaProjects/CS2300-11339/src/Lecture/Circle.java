package Lecture;

public class Circle implements Comparable<Circle>{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle(" + radius + ")";
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object obj) {
        Circle c = (Circle)obj;
        return c.getRadius() == this.getRadius();
    }

    @Override
    public int compareTo(Circle c) {
        if(radius > c.getRadius()) {
            return 1;
        } else if (radius < c.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}
