package Primitives;

public class Coordinate
{
     private double _coordinate;

    /***
     * this is the default ctor of this class
     */
    public Coordinate()
    {
        this._coordinate=0;
    };
    /***
     * This is the ctor
     */
    public Coordinate(double coordinate){
        this._coordinate=coordinate;
    }

    /***
     * This is the copy ctor
     */
    public Coordinate(Coordinate coord) {
        this._coordinate=coord._coordinate;
    }

    /***
     *Fonctions Get/Set
     */
    public double getCoordinate() {
        return _coordinate;
    }
    public void setCoordinate(double coordinate) {
        this._coordinate = coordinate;
    }

    /***
     *The function compareTo check if two object are equal
     */

    public boolean compareTo(Object obj) {
        if ( ! (obj instanceof Coordinate) )return false;
        if(((Coordinate) obj)._coordinate==this._coordinate) return true;
        else return false;
    }

    /***
     *The function Add make addition of two objects
     */
    public void add (Coordinate coordinate)
    {
        this._coordinate=this._coordinate+coordinate._coordinate;
    }

    /***
     *The function sub make substraction of two objects
     */
    public void subtract (Coordinate coordinate){ this._coordinate=this._coordinate-coordinate._coordinate;}

      @Override
     public String toString() {
        return String.format("("+_coordinate+")");
    }
}

