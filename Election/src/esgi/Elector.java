package esgi;

public class Elector {
    int id;
    String vote;

    public Elector(int id){
        this.id=id;
    }

    public void voteFor(String vote){
        if(this.vote.isEmpty()){
            this.vote=vote;
        } else {
            System.out.println("Vous avez déjà voté !!");
        }
    }
}
