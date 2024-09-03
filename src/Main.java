public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,5);
        Point p3 = new Point(4,8);
        Point p4 = new Point(5,9);

        PolyLine pl1 = new PolyLine(p1, p2, p3, p4);
        PolyLine pl2 = new PolyLine(p1, p2, p3, p4);

        System.out.println(pl1.equals(pl2));
    }
}
