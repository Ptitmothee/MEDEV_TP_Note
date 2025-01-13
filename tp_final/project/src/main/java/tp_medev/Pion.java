package tp_medev;

public class Pion {
    public static final  boolean NOIR = false;
    public static final boolean BLANC = true;

    private boolean couleur;

    private int x;
    private int y;

    public Pion() {}

    public Pion(boolean couleur, int x, int y) {
        this.setCouleur(couleur);
        this.setX(x);
        this.setY(y);
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
