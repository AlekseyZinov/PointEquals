import java.util.Objects;

public class Line {
    Point start,end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    protected Line clone() {
        Line l = new Line(start, end);
        return l;
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
