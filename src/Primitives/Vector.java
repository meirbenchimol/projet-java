package Primitives;

public class Vector {

    private Point3D _head;

    // ***************** Constructors ********************** //

    public Vector()
    {
        this.setHead(new Point3D(0,0,0));
    };
    public Vector(Point3D head)
    {
        this._head= new Point3D(head);
    }
    public Vector(Vector vector)
    {
        this._head=vector._head;

    }
    public Vector(double xHead,  double yHead, double zHead)
    {
        this._head=new Point3D(xHead,yHead,zHead);
    };
    public Vector(Point3D p1, Point3D p2)
    {
        this._head = new Point3D(p2.getX().getCoordinate()-p1.getX().getCoordinate(),p2.getY().getCoordinate()-p1.getY().getCoordinate(), p2.getZ().getCoordinate()-p1.getZ().getCoordinate());

    }

    // ***************** Getters/Setters ********************** //

    public Point3D getHead()
    {
        return _head;
    }
    public void setHead(Point3D _head)
    {
        this._head = _head;
    }

    // ***************** Administration  ******************** //

    public boolean compareTo(Object obj)
    {
        if ( ! (obj instanceof Vector) )return false;
        if ( (this.length() == ((Vector)obj).length()) && (this._head.compareTo(((Vector)obj)._head)) == true)
        return true;
        else return false;
    }
    public String toString(){return this._head.toString();};

    // ***************** Operations ******************** //

    public void add (Vector vector )
    {
        this._head.add(vector);
    };
    public void subtract (Vector vector)
    {
       this._head.subtract(vector);
    };
    public void scale(double scalingFactor)
    {
        this.setHead(new Point3D(this.getHead().getX().getCoordinate()*scalingFactor,this.getHead().getY().getCoordinate()*scalingFactor, this.getHead().getZ().getCoordinate()*scalingFactor));
    };
    public Vector crossProduct(Vector vector)
    {
        Vector result = new Vector();
        result.setHead(new Point3D(new Coordinate(this.getHead().getY().getCoordinate()*vector.getHead().getZ().getCoordinate() - this.getHead().getZ().getCoordinate()*vector.getHead().getY().getCoordinate()),
                new Coordinate(this.getHead().getZ().getCoordinate()*vector.getHead().getX().getCoordinate() - this.getHead().getX().getCoordinate()*vector.getHead().getZ().getCoordinate()),
                new Coordinate(this.getHead().getX().getCoordinate()*vector.getHead().getY().getCoordinate() - this.getHead().getY().getCoordinate()*vector.getHead().getX().getCoordinate())));
        return result;

    };
    public double dotProduct(Vector vector)
    {
        double result = (this.getHead().getX().getCoordinate()*vector.getHead().getX().getCoordinate() + this.getHead().getY().getCoordinate()*vector.getHead().getY().getCoordinate() + this.getHead().getZ().getCoordinate()*vector.getHead().getZ().getCoordinate());
        return result;
};
    public double length()
        {
            double result = Math.sqrt(Math.pow(this._head.getX().getCoordinate(),2) + Math.pow(this._head.getY().getCoordinate(),2) + Math.pow(this._head.getZ().getCoordinate(),2));
            return result;
        }
    public void normalize()  // Throws exception if length = 0
    {
        try {
            double x = this.getHead().getX().getCoordinate();
            double y = this.getHead().getY().getCoordinate();
            double z = this.getHead().getZ().getCoordinate();

            double length = this.length();

            if (length == 0)
                throw new ArithmeticException();

            this.setHead(new Point3D(x / length, y / length, z / length));
        }
        catch (ArithmeticException e) {}
    }
}
