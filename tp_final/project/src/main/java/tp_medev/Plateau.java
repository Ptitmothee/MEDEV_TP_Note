package tp_medev;

import java.util.logging.Logger;
import java.util.ArrayList;

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
        for (int i = 0; i < 8; i++) {
            bld.append("\n");
            for (int j = 0; j < 8; j++) {
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
        }
        result = bld.toString();
        logger.info(result);
    }

    public ArrayList<int[]> casesDispo(Joueur player){
        boolean couleurEnnemi = !player.getCouleur();
        ArrayList<int[]> casesJouables = new ArrayList<>();

        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                Pion caseActu = this.getCase(i, j);
                if (caseActu != null && caseActu.getCouleur() == couleurEnnemi){

                    if (i-1>=0 && this.getCase(i-1, j)==null && !casesJouables.contains(new int[] {i-1,j})){
                        casesJouables.add(new int[] {i-1,j});
                    }

                    if (i+1<8 && this.getCase(i+1, j)==null && !casesJouables.contains(new int[] {i+1,j})){
                        casesJouables.add(new int[] {i+1,j});
                    }

                    if (j-1>=0 && this.getCase(i, j-1)==null && !casesJouables.contains(new int[] {i,j-1})){
                        casesJouables.add(new int[] {i,j-1});
                    }

                    if (j+1<8 && this.getCase(i, j+1)==null && !casesJouables.contains(new int[] {i,j+1})){
                        casesJouables.add(new int[] {i,j+1});
                    }
                }
            }
        }
    }
    return casesJouables;
}
