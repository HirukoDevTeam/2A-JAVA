package esgi;

public class Launcher{
    public void updateInt(int entier){
        entier = 2;
    }

    //public void updateIntFinal(final int entier){
    //    entier = 2;
    //}

    public int updateAndReturnInt(int entier){
        entier = 2;
        return entier;
    }

    public void updatePercent(Percent pourcentage){
        pourcentage.entier = 4;
    }

    public void updatePercentFinal(final Percent pourcentage){
        pourcentage.entier = 6;
    }

    public static void main(String[] args){
        Launcher launcher = new Launcher();
        int number = 1;
        Percent percentage = new Percent();
        launcher.updateInt(number);
        System.out.println(number);
        System.out.println(launcher.updateAndReturnInt(number));
        launcher.updatePercent(percentage);
        System.out.println(percentage.entier);
        launcher.updatePercentFinal(percentage);
        System.out.println(percentage.entier);
    }
}

