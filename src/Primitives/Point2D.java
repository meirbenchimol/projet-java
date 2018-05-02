package Primitives;

public class Point2D {
    protected Coordinate _x;
    protected Coordinate _y;

    // ***************** Constructors ********************** //

    public Point2D() {
        this._y=new Coordinate();
        this._x=new Coordinate();
    }
    public Point2D(Coordinate x, Coordinate y)
    {
        this._x= new Coordinate(x);
        this._y= new Coordinate(y);
    }
    public Point2D(Point2D point2D)
    {
        this._x= point2D._x;
        this._y= point2D._y;
    }

    // ***************** Getters/Setters ********************** //

    public Coordinate getX() {return _x; }
    public Coordinate getY() {return _y; }

    public void setX(Coordinate x) {this._x = new Coordinate(x);}
    public void setY(Coordinate y) {this._y = new Coordinate(y);}

    // ***************** Administration  ******************** //

    public boolean compareTo(Object obj) {
        if ( ! (obj instanceof Point2D) )return false;
        if ( ((Point2D) obj)._x == this._x && ((Point2D) obj)._y == this._y)return true;
        else return false;
    }

@Override
    public String toString() { return String.format("("+_x+","+_y+")");}
}
