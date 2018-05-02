package Geometries;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

import java.util.List;
import java.util.Map;

public class Triangle extends Geometry implements FlatGeometry
{

    private Point3D _p1;
    private Point3D _p2;
    private Point3D _p3;

    // ***************** Constructors ********************** //

    public Triangle()
    {
       _p1=new Point3D();
       _p2=new Point3D();
       _p3=new Point3D();
    }
    public Triangle(Triangle triangle)
    {
        this._p1= triangle._p1;
        this._p2= triangle._p2;
        this._p3= triangle._p3;
    }
    public Triangle(Point3D p1, Point3D p2, Point3D p3)
    {
        this._p1= new Point3D(p1);
        this._p2= new Point3D(p2);
        this._p3 =new Point3D(p3);
    }

    public Triangle(Map<String, String> attributes)
    {

    }


    @Override
    public List<Point3D> FindIntersections(Ray ray) {
        return null;
    }

    @Override
    public Vector getNormal(Point3D point) {
        return null;
    }
}
