public class Joueur {
    private boolean couleur;

    public Joueur(string choix){
        try{
            if (choix=="blanc"){
                this.couleur = true;
            }
            else if (choix=="noir"){
                this.couleur = false;
            }
        }
        catch (Exception e){
            System.out.println("Ce n'est pas un choix possible, veuillez choisir entre blanc ou noir");
        }
    }

    public Joueur(boolean choix){
        this.couleur = choix;
    }

    public getCouleur(){
        return this.couleur;
    }

    public setCouleur(boolean nvlCouleur){
        this.couleur = nvlCouleur;
    }
}
