package esgi;

public class Draws {
    private static final int TOTAL_DRAWS=100;
    Dice de = new Dice();

    public int[] face = new int[6];

    void rollDraws(){
        for(int i=0;i!=TOTAL_DRAWS;i++){
            int number = de.roll();
            switch(number) {
                case 1:
                    face[0]+=1;
                    break;
                case 2:
                    face[1]+=1;
                    break;
                case 3:
                    face[2]+=1;
                    break;
                case 4:
                    face[3]+=1;
                    break;
                case 5:
                    face[4]+=1;
                    break;
                case 6:
                    face[5]+=1;
                    break;
            }
        }
    }

    void displayNumberOfDraw(){
        int result = 0;
        for(int i=0;i!=6;i++){
            result+=face[i];
        }
        System.out.println(result);
    }

    void displayDraws(){
        for(int i=0;i!=6;i++){
            System.out.println(face[i]);
        }
    }

}
