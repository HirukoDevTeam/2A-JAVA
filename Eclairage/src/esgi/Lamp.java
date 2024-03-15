package esgi;

public class Lamp {
    public static final int LEVEL_MIN = 0;
    public static final int LEVEL_MAX = 9;
    private boolean isOn;
    private int level;

    public Lamp(boolean isOn){
        this.isOn = isOn;
        if(!isOn){
            this.level = LEVEL_MIN;
        } else {
            this.level = LEVEL_MAX;
        }
    }
    public Lamp(int level){
        if(level >= LEVEL_MIN && level <= LEVEL_MAX){
            isOn = (level != LEVEL_MIN);
            this.level = level;
        } else {
            isOn = false;
            this.level = LEVEL_MIN;
        }
    }

    public void switchOn(){
        isOn = true;
        level = LEVEL_MAX;
    }

    public void switchOn(int level){
        if(level >= LEVEL_MIN && level <= LEVEL_MAX) {
            isOn = true;
            this.level = level;
        }
    }

    public void switchOff(){
        isOn = false;
        level = LEVEL_MIN;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getLevel() {
        return level;
    }

    public String toString(){
        return "This Lamp is turn on ? "+this.isOn+" level ? "+this.level;
    }
}
