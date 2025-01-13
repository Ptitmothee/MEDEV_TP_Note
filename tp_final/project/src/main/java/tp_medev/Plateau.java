public class Plateau {
    private Pion[][] plateau;

    public Plateau() {
        setPlateau(new Pion[8][8]);
        
    }

    public Pion[][] getPlateau() {
        return this.plateau;
    }

    public void setPlateau(Pion[][] plateau) {
        this.plateau = plateau;
    }
}
