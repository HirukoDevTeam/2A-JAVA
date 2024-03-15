package esgi;

public class Bike {
    public static int defaultWheelCount = 2;
    public int wheelCount;
    private String label;

    public Bike(String label) {
        this.label = label;
    }

    public void display() {
        System.out.println(label);
        System.out.println(wheelCount);
        System.out.println(defaultWheelCount);
    }
    
}