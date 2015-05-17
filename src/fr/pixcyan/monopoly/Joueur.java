package fr.pixcyan.monopoly;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Sert à initialiser un joueur et avoir des actions avec
 *
 * @author PixCyan
 */
public class Joueur {
    private String nom;
    private Pions pion;
    private Integer argent;
    private Set<Propriete> proprietesPossedes;

    public Joueur(String nom, Pions pion, Integer argent) {
        this.nom = nom;
        this.pion = pion;
        this.argent = argent;
        this.proprietesPossedes = new HashSet<>();
    }

    public void afficheInfosJoueur() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Pion : " + this.pion);
        System.out.println("Argent : " + this.argent);
        afficheProprietesJoueur();
    }

    public void afficheProprietesJoueur() {
        Iterator<Propriete> proprietes = proprietesPossedes.iterator();
        while(proprietes.hasNext()) {
            Propriete p = proprietes.next();
            //TODO : affichage detail propriete => vérifier si ca marche
            p.afficheDetailsPropriete();
        }
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", pion=" + pion +
                ", argent=" + argent +
                ", proprietesPossedes=" + proprietesPossedes +
                '}';
    }

    //------ Getters ------//
    public String getNom() {
        return this.nom;
    }

    public Pions getPion() {
        return this.pion;
    }

    public Integer getArgent() {
        return this.argent;
    }

    public Set<Propriete> getProprietesPossedes() {
        return this.proprietesPossedes;
    }
}
