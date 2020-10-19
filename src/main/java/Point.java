public class Point {
    private double x, y; 

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) +
                Math.pow(this.y - p.getY(), 2));
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double abc() throws Exception {
        throw new NullPointerException("Exeção qualquer");
    }
}
