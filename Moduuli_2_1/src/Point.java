public class Point {
    private int x, y, z;

    public Point() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Point(int cx, int cy, int cz) {
        x = cx;
        y = cy;
        z = cz;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double distance(Point p) {
        return (OOPExample.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y) + (z-p.z)*(z-p.z)));
    }
}