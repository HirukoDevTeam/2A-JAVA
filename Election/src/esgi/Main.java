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
                    break;
                case 1:
                    randomCandidate = lepen;
                    break;
                case 2:
                    randomCandidate = melenchon;
                    break;
                default:
                    randomCandidate = macron; // Par défaut, vote pour Macron
                    break;
            }
            electors[i].voteFor(randomCandidate);
        }

        System.out.println("\nRésultats du vote :");
        for (Elector elector : electors) {
            System.out.println("Électeur " + elector.id + " a voté pour " + elector.vote);
        }
    }
}