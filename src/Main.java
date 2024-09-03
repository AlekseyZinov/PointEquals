import java.util.Objects;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(1,3);
        Point p2 = new Point(1,3);
        Point p3 = p2.clone();

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
    }
}
class Point implements Cloneable{
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    protected Point clone() throws CloneNotSupportedException {
        return (Point)super.clone();
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y  + "}";
    }
}
