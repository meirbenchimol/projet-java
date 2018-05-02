package Geometries;



public abstract class RadialGeometry extends Geometry
{

    protected double _radius;

    /*** CONSTRUCTOR ***/
    public RadialGeometry(){ }
    public RadialGeometry(double radius)
    {
        this._radius=radius;
    }

    /*** GET / SET ***/
    public double getRadius() { return _radius;}
    public void   setRadius(double radius){this._radius=radius;}
}
