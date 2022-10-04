/**
 * Nolan Campbell
 * Rectangle.java
 */

package HW;

public class Rectangle implements Comparable<Rectangle> {
    private double len, width;

    public Rectangle(double len, double width) {
        this.len = len;
        this.width = width;
    }

    public double getArea() {
        return len * width;
    }

    public double getPerimeter() {
        return (2 * len) + (2 * width);
    }

    @Override
    public String toString() {
        return "Rect(" + len + "," + width + ")";
    }

    @Override
    public boolean equals(Object o) {
        Rectangle r = (Rectangle) o;
        return getArea() == r.getArea();
    }

    @Override
    public int compareTo(Rectangle r) {
        if (getArea() > r.getArea()) {
            return 1;
        } else if (getArea() < r.getArea()) {
            return -1;
        }
        return 0;
    }
}
