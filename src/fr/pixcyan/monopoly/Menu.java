package fr.pixcyan.monopoly;

import java.util.Scanner;

/**
 * Sert à lancer le menu
 *
 * @author PixCyan
 */
public class Menu {
    private Jeu jeu;

    public Menu(Jeu jeu) {
        this.jeu = jeu;
    }

    public void afficherMenu() {
        Integer choix;
        Scanner entree = new Scanner(System.in);
        do {
            System.out.println("================================");
            System.out.println("| 1. Inscrire des joueurs      |");
            System.out.println("| 2. Commencer le jeu          |");
            System.out.println("| 3. Afficher les participants |");
            System.out.println("| 4. Quitter                   |");
            System.out.println("================================");
            choix = entree.nextInt();

            switch (choix) {
                case 1:
                    jeu.inscrireJoueur();
                    break;
                case 2:
                    jeu.commencerJeu();
                    break;
                case 3:
                    jeu.afficherListeJoueurs();
                    break;
                default:
                    break;
            }
        } while (choix != 4);
    }
}

