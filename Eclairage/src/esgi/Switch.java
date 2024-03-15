package esgi;

public class Switch {
    public Lamp lamp1;
    public Lamp lamp2;
    public Switch(Lamp firstLamp, Lamp secondLamp){
        lamp1 = firstLamp;
        lamp2 = secondLamp;
    }

    public void switchOn(Lamp lamp, int level){
        lamp.switchOn(level);
    }

    public void switchOnLamp1(){
        lamp1.switchOn();
    }

    public void switchOnLamp2(){
        lamp2.switchOn(7);
    }

    public void switchOff(){
        lamp1.switchOff();
        lamp2.switchOff();
    }
}
