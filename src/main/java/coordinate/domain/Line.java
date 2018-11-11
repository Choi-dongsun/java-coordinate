package coordinate.domain;

import java.util.List;
import java.util.Objects;

public class Line {
    private List<Point> coordinate;

    private Line(List<Point> coordinate) {
        this.coordinate = coordinate;
    }

    public static Line ofCoordinate(List<Point> coordinate) {
        return new Line(coordinate);
    }

    public double getLineLength() {
        return coordinate.get(Coordinate.ZERO).getDistance(coordinate.get(Coordinate.ONE));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(coordinate, line.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate);
    }
}
