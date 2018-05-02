import Primitives.Coordinate;
import Primitives.Point2D;
import Primitives.Point3D;
import Primitives.Vector;

import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        Coordinate a = new Coordinate(1);
        Coordinate b = new Coordinate(2);
        Point2D c= new Point2D(a,b);
        Point2D d= new Point2D(b,a);
        Point2D e= new Point2D(c);
        Point3D f= new Point3D();
        System.out.print(c.toString());


    }
}
