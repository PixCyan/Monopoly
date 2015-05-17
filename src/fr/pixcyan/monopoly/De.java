package fr.pixcyan.monopoly;

import java.util.Random;

/**
 * Sert à initialiser les dés
 *
 * @author PixCyan
 */
public class De {
    private static final Random random = new Random();
    private Integer resultat;
    private Integer de1;
    private Integer de2;

    public De() {
        initDe();
    }

    private void initDe() {
        de1 = random.nextInt(6);
        de2 = random.nextInt(6);
        resultat = de1 + de2;
    }


    //------ Getters ------//
    public Integer getDe1() {
        return this.de1;
    }

    public Integer getDe2() {
        return this.de2;
    }

    public Integer getResultat() {
        return this.resultat;
    }
}
