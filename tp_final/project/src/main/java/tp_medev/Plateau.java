public class Plateau {
    private Pion[][] plateau;

    public Plateau() {
        this.setPlateau(new Pion[8][8]);

        this.setCase()
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
        return this.getPlateau()[x][y]
    }
}
