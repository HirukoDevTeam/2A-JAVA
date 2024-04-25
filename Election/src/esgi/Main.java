package esgi;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Candidate macron = new Candidate("macron");
        Candidate lepen = new Candidate("lepen");
        Candidate melenchon = new Candidate("melenchon");

        Elector[] electors = new Elector[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            electors[i] = new Elector(i + 1);
            int randomIndex = random.nextInt(3);
            Candidate randomCandidate;
            switch (randomIndex) {
                case 0:
                    randomCandidate = macron;
                    macron.voteFor();
                    break;
                case 1:
                    randomCandidate = lepen;
                    lepen.voteFor();
                    break;
                case 2:
                    randomCandidate = melenchon;
                    melenchon.voteFor();
                    break;
                default:
                    randomCandidate = macron; // Par défaut, vote pour Macron
                    macron.voteFor();
                    break;
            }
            electors[i].voteFor(randomCandidate);
        }

        System.out.println("\nRésultats du vote :");
        for (Elector elector : electors) {
            System.out.println("Électeur " + elector.id + " a voté pour " + elector.vote);
        }

        System.out.println("Candidat : "+ macron.nom +" a reçu "+ macron.voteFor());
        System.out.println("Candidat : "+ lepen.nom +" a reçu "+ lepen.voteFor());
        System.out.println("Candidat : "+ melenchon.nom +" a reçu "+ melenchon.voteFor());
    }
}