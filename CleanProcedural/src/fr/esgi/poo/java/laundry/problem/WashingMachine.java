package fr.esgi.poo.java.laundry.problem;

public class WashingMachine {
    boolean isUsed = false;
    int id;

    public WashingMachine(int parameter) {
        this.id=parameter;
    }

    public boolean isWashingMachineUsed(){
        return this.isUsed;
    }

    public void pressButtonWashingMachine(){
        if (this.isUsed==false){
            this.isUsed=true;
            System.out.println("La machine "+this.id+" as été démarrée");
        } else {
            this.isUsed=false;
            System.out.println("La machine "+this.id+" as été éteinte");
        }
    }
}
