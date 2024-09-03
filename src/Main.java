public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,5);

        Point p3 = new Point(1,3);
        Point p4 = new Point(2,5);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        Line line3 = line2.clone();

        System.out.println(line1.equals(line2));
        System.out.println(line2.equals(line3));
    }
}
