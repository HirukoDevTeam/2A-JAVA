package esgi;

public class Main {
    public static void main(String[] args) {
        Point pointA = new Point();
        Point pointB = new Point(1);
        Point pointC = new Point(1, 2);
        Point pointD = new Point(1, 2, 5);

        pointA.display();

        System.out.println("Point A" + pointA);
        System.out.println("Point B" + pointB);
        System.out.println("Point C" + pointC);
        System.out.println("Point D" + pointD);
    }
}