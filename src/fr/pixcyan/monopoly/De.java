package fr.pixcyan.monopoly;

import java.util.Random;

/**
 * Sert à initialiser les dés
 *
 * @author PixCyan
 */
public class De {
    private static final Random random = new Random();
    private int resultat;
    private int de1;
    private int de2;

    public De() {
        initDe();
    }

    private void initDe() {
        de1 = random.nextInt(6);
        de2 = random.nextInt(6);
        resultat = de1 + de2;
    }


    //------ Getters ------//

    public int getResultat() {
        return resultat;
    }

    public int getDe1() {
        return de1;
    }

    public int getDe2() {
        return de2;
    }
}
