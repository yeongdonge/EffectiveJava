package item10;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Item10Main {
    public static void main(String[] args) {
//        CaseInsensitiveString cis = new CaseInsensitiveString("Parrineau");
//        String s = "parrineau";
//
//        System.out.println("cis.equals(s) = " + cis.equals(s));
//
//        List<CaseInsensitiveString> list = new ArrayList<>();
//        list.add(cis);
//        System.out.println("list.contains(cis) = " + list.contains(cis));

//        Point p = new Point(1, 2);
//        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
//
//        System.out.println("p.equals(cp) = " + p.equals(cp));
//        System.out.println("cp.equals(p) = " + cp.equals(p));

//        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
//        Point p2 = new Point(1, 2);
//        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
//
//        System.out.println("p1.equals(p2) = " + p1.equals(p2));
//        System.out.println("p2.equals(p3) = " + p2.equals(p3));
//        System.out.println("p1.equals(p3) = " + p1.equals(p3));

        CounterPoint cp = new CounterPoint(1, 2);
        System.out.println("onUnitCircle(cp) = " + onUnitCircle(cp));
    }

    private static final Set<Point> unitCircle = Set.of(new Point(1, 0), new Point(0, 1),
            new Point(-1, 0), new Point(0, -1));

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }
}
