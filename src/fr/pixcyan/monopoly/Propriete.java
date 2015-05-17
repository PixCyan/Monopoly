package fr.pixcyan.monopoly;

/**
 * Initialiser une propriete et intéragir avec
 *
 * @author PixCyan
 */
public class Propriete {
    private String titre;
    private Couleur couleur;

    public Propriete(String titre, Couleur couleur) {

    }

    public void afficheDetailsPropriete() {
        System.out.println("Titre : " + this.titre);
        System.out.println("Couleur : " + this.couleur);
    }


    //------ Getters ------//
    public String getTitre() {
        return this.titre;
    }

    public Couleur getCouleur() {
        return  this.couleur;
    }

    //------ Setters ------//

}
