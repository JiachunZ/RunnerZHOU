import javafx.geometry.Rectangle2D;

public class Life extends AnimatedThing{
    //paramètre etat pour savoir etat des trois coeurs, quatres etats possiblle : 3,2,1,0 coeur(s)
    private int etat;
    private Heros hero;
    private Obstacle obs;
    public Life (double x, double y, int width, int height, String chemin, int etat,Heros hero,Obstacle obs){
        super(x,y,width,height,chemin);
        this.obs=obs;
        this.hero=hero;
        this.etat=etat;
    }

    public int getEtat(){return etat;}
    public void setEtat(int etat){ this.etat=etat;}

    public void verifEtat() {
        // détecter collision lorsque hero cours
        if (this.hero.getMaxIndX() == 460) {
            if (this.hero.getHx() + 123 == this.obs.getAx() + 9) {
                this.setEtat(this.getEtat() + 1);
            }
            //détecter collision lorsque hero saute
        } else if (this.hero.getMaxIndX()==310){
            if (this.hero.getHx()+123==this.obs.getAx()+9 && this.hero.getHy()+90<this.obs.getAy()+82 && this.hero.getHy()+90>this.obs.getAy()){
                this.setEtat(this.getEtat()+1);
            }
        }
    }


    void update(){
        verifEtat();
        GameScene.setLife();


        if (this.etat==0){
            this.getAimV().setViewport(new Rectangle2D(0,0,111,30));
        } else if (this.etat==1){
            this.getAimV().setViewport(new Rectangle2D(36,0,111,30));
        } else if (this.etat==2){
            this.getAimV().setViewport(new Rectangle2D(73,0,111,30));
        } else if (this.etat==3){
            this.getAimV().setViewport(new Rectangle2D(110,0,111,30));
        }

    }

}
