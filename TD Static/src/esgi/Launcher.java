package esgi;

public class Launcher {
    public static void main(String[] args) {
        Bike myBike1;
        myBike1 = new Bike("Between");
        myBike1.wheelCount = 4;
        myBike1.display();

        Bike myBike2;
        myBike2 = new Bike("Decathlon");
        myBike2.wheelCount = 3;
        myBike2.display();

        Bike myBike3;
        myBike3 = new Bike("Intersport");
        myBike3.wheelCount = 6;
        myBike3.display();

        Bike.defaultWheelCount = 5;

        myBike1.display();
        myBike2.display();
        myBike3.display();
    }
}
