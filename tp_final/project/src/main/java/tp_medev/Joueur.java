package tp_medev;

import java.util.logging.Logger;

public class Joueur {
    private boolean couleur;

    Logger logger = Logger.getLogger(getClass().getName());

    public Joueur(String choix){
        try{
            if (choix.equals("blanc")){
                this.couleur = true;
            }
            else if (choix.equals("noir")){
                this.couleur = false;
            }
        }
        catch (Exception e){
            logger.info("Ce n'est pas un choix possible, veuillez choisir entre blanc ou noir");
        }
    }

    public Joueur(boolean choix){
        this.couleur = choix;
    }

    public boolean getCouleur(){
        return this.couleur;
    }

    public void setCouleur(boolean nvlCouleur){
        this.couleur = nvlCouleur;
    }
}
