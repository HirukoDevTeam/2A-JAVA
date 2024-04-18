package esgi;

public class Start {
    public static void main(String[] args){
        Draws tirage = new Draws();
        tirage.rollDraws();
        tirage.displayDraws();
        tirage.displayNumberOfDraw();
    }
}
