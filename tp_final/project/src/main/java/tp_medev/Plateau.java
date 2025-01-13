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

    /**
     * Permet d'afficher le plateau de jeau dans le terminal, la lettre B correnspond aux pions blancs et N aux pions noirs
     * @param coord1
     * @param coord2
     */
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

    /**
     * Permet de trouver toutes les cases où le joueur peut placer un pion
     * @param player
     * @return
     */
    public List<int[]> casesDispo(Joueur player){
        boolean couleurEnnemi = !player.getCouleur();
        ArrayList<int[]> casesJouables = new ArrayList();

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
        return casesJouables;
    }

        /**
         * Permet de changer la couleur entre les pions de coordonnées coord1 et coord2, selon les regles du othello, donc en ligne, en colonne ou en diagonale
         * @param coord1
         * @param coord2
         */
    public void changeCouleur(int[] coord1, int[] coord2){
        if(coord1[0]!=coord2[0] || coord1[0]!=coord2[0] || coord1[0]-coord2[0]==coord1[1]-coord2[1] || (coord1[0]!=coord2[0] && coord1[1]!=coord2[1])){
            System.out.println("Impossible, ce n'est pas une ligne ni une colonne ni une diagonale");
        }
        else{
            if (coord1[0]==coord2[0]){
                int i=coord1[0];

                if (coord1[1]>coord2[1]){
                    int[] debut = coord2;
                    int[] fin = coord1;
                }
                else{
                    int[] debut = coord1;
                    int[] fin = coord2;
                }

                for (int k=debut[1]; k<fin[1]-1; k++){
                    Pion pionChange = this.getCase(i, k+1);
                    this.setCase(pionChange.setCouleur(!pionChange.getCouleur));
                }
            }
            else if (coord1[1]==coord2[1]){
                int j=coord1[1];

                if (coord1[0]>coord2[0]){
                    int[] debut = coord2;
                    int[] fin = coord1;
                }
                else{
                    int[] debut = coord1;
                    int[] fin = coord2;
                }
                for (int k=debut[0]; k<fin[0]-1; k++){
                    Pion pionChange = this.getCase(k+1, j);
                    this.setCase(pionChange.setCouleur(!pionChange.getCouleur));
                }
            }
            else if (coord1[0]-coord2[0]==coord1[1]-coord2[1]){
                if (coord1[0]<coord2[0]){
                    int[] debut = coord1;
                    int[] fin = coord2;
                }
                else{
                    int[] debut = coord2;
                    int[] fin = coord1;
                }

                if (debut[1]>fin[1]){
                    for (int k = 0; k<fin[0]-(debut[0]+1); k++){
                        Pion pionChange = this.getCase(debut[0]+(k+1), debut[1]-(k+1));
                        this.setCase(pionChange.setCouleur(!pionChange.getCouleur));
                    }
                }
                else if (debut[1]<fin[1]){
                    for (int k = 0; k<fin[0]-(debut[0]+1); k++){
                        Pion pionChange = this.getCase(debut[0]+(k+1), debut[1]+(k+1));
                        this.setCase(pionChange.setCouleur(!pionChange.getCouleur));
                    }
                }
            }
        }
    }

    public void pionPlace(Joueur player, int[] coordPionPlace){
        
    }
}
