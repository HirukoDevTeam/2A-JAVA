package esgi;

public class Candidate {
    String nom;
    int nbvote;

    public Candidate(String parameter){
        this.nom=parameter;
    }

    public int voteFor(){
        this.nbvote += 1;
        return nbvote;
    }
}
