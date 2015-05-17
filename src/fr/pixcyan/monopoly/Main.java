package fr.pixcyan.monopoly;

public class Main {

    private Jeu jeu;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        jeu = new Jeu();
        new Menu(jeu).afficherMenu();
    }
}
