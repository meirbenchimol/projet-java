package Geometries;

import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Plane extends Geometry implements FlatGeometry
{
    private Vector _normal;
    private Point3D _Q;

    /****** CONSTRUCTOR ******/

    public Plane(){}
    public Plane (Plane plane)
    {

    }
    public Plane (Vector normal, Point3D q)
    {
        this._normal=normal;
        this._Q = q;
    }

    /***************** Getters/Setters **********************/
    @Override
    public Vector getNormal(Point3D point)
    {
        return this._normal;
    }
    public Point3D getQ()
    {
        return this._Q;
    }
    public void setNormal(Vector normal)
    {
        this._normal=normal;
    }
    public void setQ(Point3D d)
    {
        this._Q=d;
    }

    // ***************** Operations ******************** //

    @Override
    public List<Point3D> FindIntersections(Ray ray)
    {
        ArrayList<Point3D> intersections = new ArrayList<Point3D>();

        Point3D P0 = new Point3D(ray.get_POO());
        Point3D Q0 = new Point3D(this._Q);

        Vector N = new Vector(this._normal);
        Vector V = new Vector(ray.get_direction());
        Vector v = new Vector(Q0,P0);

        double t = -1;
        if(N.dotProduct(V) != 0)
            t = (-(N.dotProduct(v)))/(N.dotProduct(V));
        if (t >= 0) {
            V.scale(t);
            P0.add(V);
            intersections.add(P0);
        }
        return intersections;


    }

}
