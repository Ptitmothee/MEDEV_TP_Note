package tp_medev;

import java.util.logging.Logger;

public class Plateau {
    private Pion[][] plateau;

    Logger logger = Logger.getLogger(getClass().getName());

    public Plateau() {
        this.setPlateau(new Pion[8][8]);

        this.setCase(Pion.BLANC, 3, 3);
        this.setCase(Pion.NOIR, 4, 3);
        this.setCase(Pion.NOIR, 3, 4);
        this.setCase(Pion.BLANC, 4, 4);
    }

    public Pion[][] getPlateau() {
        return this.plateau;
    }

    public void setPlateau(Pion[][] plateau) {
        this.plateau = plateau;
    }

    public void setCase(Pion pion) {
        this.plateau[pion.getX()][pion.getY()] = pion;
    }

    public void setCase(boolean couleur, int x, int y) {
        this.setCase(new Pion(couleur, x, y));
    }

    public Pion getCase(int x, int y) {
        return this.getPlateau()[x][y];
    }

    public void affiche() {
        Pion pion;
        String result;
        StringBuilder bld = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                pion = this.getCase(i, j);
                if (pion == null) {
                    bld.append(".");
                } else {
                    if (pion.getCouleur()) {
                        bld.append("B");
                    } else {
                        bld.append("N");
                    }     
                }
            }
            bld.append("\n");
        }
        result = bld.toString();
        logger.info(result);
    }
}
