/**
 * Nolan Campbell
 * RightTriangle.java
 */

package HW;

public class RightTriangle implements Comparable<RightTriangle> {
    private double a, b;

    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return (a * b) / 2;
    }

    public double getPerimeter() {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return a + b + c;
    }

    @Override
    public String toString() {
        return "RT(" + a + "," + b + ")";
    }

    @Override
    public boolean equals(Object o) {
        RightTriangle rt = (RightTriangle) o;
        return getPerimeter() == rt.getPerimeter();
    }

    @Override
    public int compareTo(RightTriangle rt) {
        if (getPerimeter() > rt.getPerimeter()) {
            return 1;
        } else if (getPerimeter() < rt.getPerimeter()) {
            return -1;
        }
        return 0;
    }
}
