package esgi;

public class Main {
    public static void main(String[] args) {
        CalcAlphaNum calculette = new CalcAlphaNum();
        System.out.println(calculette.Addition(7,3));
        System.out.println(calculette.AdditionString("hello"," world !"));
        System.out.println(calculette.Incrementation(8));
        System.out.println(calculette.Equality(7,7));
        System.out.println(calculette.EqualityString("hey","hey"));
        System.out.println(calculette.MaxInInteger(7,1,9));
    }
}