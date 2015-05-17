package fr.pixcyan.monopoly;

import java.util.*;

/**
 * TODO
 *
 * @author PixCyan
 */
public class Jeu {
    private Map<String, Joueur> joueurs;
    private Set<Integer> pionsUtilises;
    private static Integer nbJoueurs = 0;

    public Jeu() {
        joueurs = new HashMap<>();
        pionsUtilises = new HashSet<>();
    }

    public void inscrireJoueur() {
        Scanner entree = new Scanner(System.in);
        if(nbJoueurs == 6) {
            System.out.println("Nombre de joeur max atteind ! Vous pouvez commencer la partie.");
        } else {
            do {
                System.out.println("Entrez le nom du joueur : ");
                String nom = entree.nextLine();
                if(joueurExiste(nom) != null) {
                    System.out.println("Ce nom existe déjà, saisissez-en un nouveau");
                } else {
                    Pions pion = choixPion();
                    Integer argent = 1500;
                    Joueur joueur = new Joueur(nom, pion, argent);
                    joueurs.put(nom, joueur);
                    System.out.println("Ce joueur a bien été enregistré.");
                    nbJoueurs++;
                    if(nbJoueurs == 6) {
                        System.out.println("Nombre de joeur max atteind ! Vous pouvez commencer la partie.");
                    } else {
                        System.out.println("Souhaitez vous ajouter un autre joueur ? (o pour oui / n pour non)");
                        String choix2 = entree.nextLine();
                        while(!choix2.equals("o") && !choix2.equals("n")) {
                            System.out.println("Saisie incorrect, voulez vous entrez un autre joueur ? (o pour oui et n pour non)");
                            choix2 = entree.nextLine();
                        }
                    }
                }
            } while (nbJoueurs < 2 && nbJoueurs <= 6);
            //TODO while incorrect
        }
    }

    public Joueur joueurExiste(String nom) {
        return joueurs.get(nom);
    }

    public Pions choixPion() {
        Scanner entree = new Scanner(System.in);
        Integer i = 1;
        System.out.println("Choisissez un pion : ");
        Pions pion = Pions.Blanc;
        for (Pions pions : Pions.values()) {
            System.out.println(i++ + " " + " " + pions.toString());
        }
        Integer choix = 0;
        do {
            choix = entree.nextInt();
            switch(choix) {
                case 1 :
                    pion = Pions.Blanc;
                    break;
                case 2 :
                    pion = Pions.Noir;
                    break;
                case 3 :
                    pion = Pions.Rouge;
                    break;
                case 4 :
                    pion = Pions.Jaune;
                    break;
                case 5 :
                    pion = Pions.Violet;
                    break;
                case 6 :
                    pion = Pions.Bleu;
                    break;
                default:
                    break;
            }
        } while (pionPrit(choix));
        pionsUtilises.add(choix);
        return pion;
    }


    public void commencerJeu() {
        for(Joueur joueur : joueurs.values()) {
            Integer res = lancerDe();
            System.out.println("Joueur " + joueur.getNom() + " : " + res);
            //TODO min/max
        }
    }


    public void afficherListeJoueurs() {
        for(Joueur joueur : joueurs.values() ) {
            System.out.println(joueur.getNom());
        }
    }


    //------- Private -------//
    private boolean pionPrit(Integer choix) {
        Iterator<Integer> pions = pionsUtilises.iterator();
        while(pions.hasNext()) {
            Integer p = pions.next();
            if(choix == p) {
                System.out.println("Ce pion est déjà prit, choisissez-en un autre.");
                return true;
            }
        }
        return false;
    }

    private Integer lancerDe() {
        De des = new De();
        return des.getResultat();
    }

}
