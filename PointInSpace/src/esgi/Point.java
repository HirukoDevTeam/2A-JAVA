package esgi;
import java.util.Random;

public class Point {
    public int x;
    public int y;
    public int z;

    public Point() {
        Random random = new Random();
        this.x = random.nextInt(5);
        this.y = random.nextInt(5);
        this.z = random.nextInt(5);
    }

    public Point(int x) {
        this.x = x;
        this.y = 0;
        this.z = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void display(){
        System.out.println("Point x/y/z: " + x + "/" + y +"/" + z);
    }

    @Override
    public String toString(){
        return "("+x+","+y+","+z+")";
    }
}