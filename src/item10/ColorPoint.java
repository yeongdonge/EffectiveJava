package item10;

import java.awt.*;
import java.util.Objects;

public class ColorPoint extends Point {

    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    /**
     * ColorPoint의 Point 뷰를 반환
     */
    public Point asPoint() {
        return point;
    }



    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;

        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
