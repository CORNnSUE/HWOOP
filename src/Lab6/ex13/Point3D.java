package ex13;

public class Point3D extends Point2D {
    private float z ;
    public Point3D(){
        this(0.0f, 0.0f, 0.0f);
    }
    public Point3D (float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x, y);
        this.z=z;
    }

    public float[] getXYZ(){
        float[] xyz=new float[3];
        xyz[0]=this.z;
        xyz[1]=this.z;
        xyz[2]=this.z;
        return xyz;
    }

    @Override
    public String toString() {

        return "(" + getX() + "," + getY() + "," + getZ() + ")" ;
    }
}
