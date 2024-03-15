package esgi;

public class Main {
    public static void main(String[] args) {
        Lamp lampOne = new Lamp(false);
        Lamp lampTwo = new Lamp(false);
        Switch lightSwitch = new Switch(lampOne,lampTwo);

        System.out.println(lampOne);
        System.out.println(lampTwo);
        System.out.println("////////");

        lightSwitch.switchOnLamp1();
        System.out.println(lampTwo);
        System.out.println(lampOne);
        System.out.println("////////");

        lightSwitch.switchOnLamp2();
        System.out.println(lampOne);
        System.out.println(lampTwo);
        System.out.println("////////");

        lampOne.switchOff();
        System.out.println(lampOne);
        System.out.println(lampTwo);
        System.out.println("////////");

        lightSwitch.switchOff();
        System.out.println(lampOne);
        System.out.println(lampTwo);
        System.out.println("////////");

        lampOne.switchOn(4);
        System.out.println(lampOne);
        System.out.println(lampTwo);
        System.out.println("////////");

    }
}