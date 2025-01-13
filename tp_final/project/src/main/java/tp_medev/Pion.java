public class Pion {
    private static final  boolean NOIR = False;
    private static final boolean BLANC = True;

    private boolean couleur;

    private int x;
    private int y;


    public Pion(boolean couleur, int x, int y) {
        setCouleur(couleur);
        setX(x);
        setY(y);
    }

    public boolean getCouleur() {
        return this.couleur;
    }

    public void setCouleur(boolean couleur) {
        this.couleur = couleur;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
