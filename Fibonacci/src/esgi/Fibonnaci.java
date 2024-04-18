package esgi;

public class Fibonnaci {
    int[] tableau = new int[20];
    void fill(){
        tableau[0]=0;
        tableau[1]=1;

        for(int i=2;i<20;i++){
            tableau[i]=tableau[i-1]+tableau[i-2];
        }
    }

    void display(){
        for(int y=0;y<20;y++){
            System.out.println(tableau[y]);
        }
    }
}
