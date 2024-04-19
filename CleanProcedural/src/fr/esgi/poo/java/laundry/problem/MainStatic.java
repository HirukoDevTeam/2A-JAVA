package fr.esgi.poo.java.laundry.problem;

import java.util.Scanner;

/**
 * Gestion d'une laverie automatique comportant 3 machines à laver.
 *
 * Implémentation en programmation de type procédurale
 * A quoi voit-on cela ? A l'emploi du mot clé "static" systématique :((
 *
 * @author elai
 */
public class MainStatic {
    public static boolean[] isWashingMachineUsed;
    public static void main(String[] args) {
        // Démarrage de la laverie (tous les matins par exemple)
        startLaundromat();
    }

    private static void startLaundromat() {
        WashingMachine machine1 = new WashingMachine(1);
        WashingMachine machine2 = new WashingMachine(2);
        WashingMachine machine3 = new WashingMachine(3);
        Scanner scanner = new Scanner(System.in);
        String action = null;

        while (!"fin".equals(action)) { // attention au NPE
            System.out.println();
            System.out.println("** ETAT DES MACHINES A LAVER **");
            System.out.println("Machine à laver n°1: " + machine1.isWashingMachineUsed());
            System.out.println("Machine à laver n°2: " + machine2.isWashingMachineUsed());
            System.out.println("Machine à laver n°3: " + machine3.isWashingMachineUsed());
            System.out.println("* Opérations possibles *");
            System.out.println("1 : lancer/arrêter la machine à laver n°1");
            System.out.println("2 : lancer/arrêter la machine à laver n°2");
            System.out.println("3 : lancer/arrêter la machine à laver n°3");
            System.out.println("Que voulez-vous faire (fin=quitter) ?");

            action = scanner.next();

            if (action.equals("1")) {
                machine1.pressButtonWashingMachine();
            }
            else if (action.equals("2")) {
                machine2.pressButtonWashingMachine();
            }
            else if (action.equals("3")) {
                machine3.pressButtonWashingMachine();
            }
        }
    }
}