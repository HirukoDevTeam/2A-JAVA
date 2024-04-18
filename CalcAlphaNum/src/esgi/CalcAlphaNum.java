package esgi;

public class CalcAlphaNum {
    public int Addition(int entier1, int entier2){
        return entier1+entier2;
    }

    public String AdditionString(String string1, String string2){

        return string1+string2;
    }

    public int Incrementation(int entier1){
        return ++entier1;
    }

    public boolean Equality(int entier1, int entier2){
        return entier1==entier2;
    }

    public boolean EqualityString(String string1, String string2){
        return string1.equals(string2);
    }

    public int MaxInInteger(int entier1, int entier2, int entier3){
        return Math.max(Math.max(entier1, entier2), entier3);
    }
}
