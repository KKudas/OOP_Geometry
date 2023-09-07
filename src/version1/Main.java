package version1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(-2, 7);

        System.out.println("Point 1 : " + point1);
        System.out.println("Point 2 : " + point2);

        //getDistance
        System.out.println("Distance between a given coordinate: " + point1.getDistance(6, 12));
        System.out.println("Distance between two points: " + point1.getDistance(point2));
        System.out.println("Distance between current point to origin: " + point1.getDistance());

        //getQuadrant
        System.out.print("Point 1 is in: ");
        switch (point1.getQuadrant()){
            case 0:
                System.out.println("Origin");
                break;
            case 1:
                System.out.println("Quadrant 1");
                break;
            case 2:
                System.out.println("Quadrant 2");
                break;
            case 3:
                System.out.println("Quadrant 3");
                break;
            case 4:
                System.out.println("Quadrant 4");
                break;
            case 5:
                System.out.println("X-Axis");
                break;
            case 6:
                System.out.println("Y-Axis");
                break;
        }

        //getAngle
        System.out.println("Angle of Positive Point 1" + point1.getAngle());
    }
}