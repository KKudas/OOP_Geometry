package version1;

public class MyPoint {
    private double x;
    private double y;


    public MyPoint(){
        this.x = this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance(double x, double y){
        double newX = x - this.x;
        double newY = y - this.y;
        return Math.sqrt(Math.pow(newX, 2) + Math.pow(newY, 2));
    }

    public double getDistance(MyPoint point){
        return getDistance(point.getX(), point.getY());
    }

    public double getDistance (){
        return getDistance(0, 0);
    }
    public void displayPoint(){
        System.out.println("( "+ this.x + " , " + this.y + " )" );
    }

    @Override
    public String toString() {
        return "MyPoint {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getQuadrant (){
        if (x == 0 && y == 0) {
            return 0;
        } else if (x == 0) {
            return 6;
        } else if (y == 0) {
            return 5;
        } else if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3; // Quadrant 3
        } else return 4;
    }

    public double getAngle(){
        return Math.toDegrees(Math.atan2(y, x));
    }
}
