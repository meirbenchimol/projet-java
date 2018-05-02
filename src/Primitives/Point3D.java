package Primitives;

public class Point3D extends Point2D{
    private Coordinate _z;

    // ***************** Constructors ********************** //

    public Point3D()
    {
        this._z=new Coordinate();
    };
    public Point3D(Coordinate x, Coordinate y, Coordinate z)
    {
       super(x,y);
       this._z=new Coordinate(z);
    }
    public Point3D(double x, double y, double z)
    {
        super (new Coordinate(x), new Coordinate(y));
        this._z= new Coordinate(z);
    };
    public Point3D(Point3D point3D)
    {
        super(new Point2D(new Coordinate(point3D.getX()),new Coordinate(point3D.getY())));
        this._z= new Coordinate(point3D.getZ());
    };

    // ***************** Getters/Setters ********************** //

    public Coordinate getZ() {return _z; }
    public void setZ(Coordinate _z) {this._z = _z;}

    // ***************** Administration  ******************** //

    @Override
    public boolean compareTo(Object obj) {
        if ( ! (obj instanceof Point3D) )return false;
        if ( ((Point3D) obj)._x == this._x && ((Point3D) obj)._y == this._y && ((Point3D) obj)._z==this._z )return true;
        else return false;
    }

    @Override
    public String toString()
    {
        return String.format("("+_x + ", "+_y+ ", "+_z+")");
    }

    // ***************** Operations ******************** //
    public void add(Vector vector)
    {
        this.getX().add(vector.getHead().getX());
        this.getY().add(vector.getHead().getY());
        this.getZ().add(vector.getHead().getZ());
    };
    public void subtract(Vector vector)
    {
        this.getX().subtract(vector.getHead().getX());
        this.getY().subtract(vector.getHead().getY());
        this.getZ().subtract(vector.getHead().getZ());
    };
    public double distance(Point3D point)
    {
    double distance;
    distance= Math.sqrt(Math.pow((point._x.getCoordinate()-this._x.getCoordinate()),2)+Math.pow((point._y.getCoordinate()-this._y.getCoordinate()),2)+Math.pow((point._z.getCoordinate()-this._z.getCoordinate()),2));
    return distance;
    }

}
