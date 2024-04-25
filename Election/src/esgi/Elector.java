package esgi;

public class Elector {
    int id;
    String vote = "";

    public Elector(int id){
        this.id=id;
    }

    public void voteFor(Candidate candidate){
        if(this.vote.isEmpty()){
            this.vote=candidate.nom;
        } else {
            System.out.println("Vous avez déjà voté !!");
        }
    }
}
