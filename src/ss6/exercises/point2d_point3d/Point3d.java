package ss6.exercises.point2d_point3d;

import java.util.Arrays;

public class Point3d extends Point2d {
    private float z;

    public Point3d() {

    }

    public Point3d(float z) {
        this.z = z;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXY() {
        float arr1[] = new float[3];
        arr1[0] = super.getX();
        arr1[1] = super.getY();
        arr1[2] = z;
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                ", arr1=" + Arrays.toString(getXY()) +
                '}';
    }
}
