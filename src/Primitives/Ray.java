package Primitives;

public class Ray {

    // Point of origin
    private Point3D _POO;

    // Ray direction
    private Vector _direction;

    // ***************** Constructors ********************** //

    public Ray() {}
    public Ray(Ray ray){
        this._POO=new Point3D(ray._POO);
        this._direction=new Vector(ray._direction);
    };
    public Ray(Point3D poo, Vector direction)
    {
        this._POO= new Point3D(poo);
        this._direction=new Vector(direction);
        this._direction.normalize();
    };

    // ***************** Getters/Setters ********************** //


    public void set_direction(Vector _direction)
    {
        this._direction = _direction;
    }
    public void set_POO(Point3D _POO)
    {
        this._POO = _POO;
    }

    public Point3D get_POO()
    {
        return new Point3D(_POO);
    }
    public Vector get_direction()
    {
        return new Vector(_direction);
    }
}
