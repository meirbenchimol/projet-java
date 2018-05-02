package Geometries;

import Primitives.Material;
import Primitives.Point3D;
import Primitives.Ray;
import Primitives.Vector;

import java.awt.*;
import java.util.List;


public abstract class  Geometry
{
    /*
 * A geometry is represented by the: material in which it's made, its shininess
 * and the light it emits.
 * */

    private Material _material = new Material();
    private double _nShininess = 1;
    private Color _emmission = new Color(0, 0, 0);
// ***************** Abstract Methods ********************** //

    /*************************************************
     * FUNCTION
     *  FindIntersections()
     *
     * PARAMETERS
     *  Ray - a given ray.
     *
     * RETURN VALUE
     *  List - a list of ray intersection points with the geometry.
     *
     * MEANING
     *  A method that returns intersection points
     *  of a given ray with a current geometry.
     *
     * See Also
     *
     **************************************************/


    public abstract List<Point3D> FindIntersections (Ray ray);
    public abstract Vector getNormal(Point3D point);

    // ***************** Getters/Setters ********************** //

    public double get_nShininess() {
        return _nShininess;
    }
    public Material get_material() {
        return _material;
    }
    public Color get_emmission() {
        return _emmission;
    }

    public void set_nShininess(double _nShininess) {
        this._nShininess = _nShininess;
    }
    public void set_emmission(Color _emmission) {
        this._emmission = _emmission;
    }
    public void set_material(Material _material) {
        this._material = _material;
    }

    public void setKs(double ks){this._material.set_Ks(ks);};
    public void setKd(double kd){this._material.set_Kd(kd);};
    public void setKr(double Kr){this._material.set_Kr(Kr);};
    public void setKt(double Kt){this._material.set_Kt(Kt);};
}
