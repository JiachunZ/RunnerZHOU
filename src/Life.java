import javafx.geometry.Rectangle2D;

public class Life extends AnimatedThing{

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

    public void verifEtat(){
        if (this.hero.getHx()+123 == this.obs.getAx()+9){
            if (this.getEtat()<3){
                this.setEtat(this.getEtat()+1);
            }
        }
    }

    void update(){
        verifEtat();
        if (this.etat==0){
            this.getAimV().setViewport(new Rectangle2D(0,0,111,30));
        } else if (this.etat==1){
            this.getAimV().setViewport(new Rectangle2D(36,0,111,30));
        } else if (this.etat==2){
            this.getAimV().setViewport(new Rectangle2D(73,0,111,30));
        } else if (this.etat==3){
            this.getAimV().setViewport(new Rectangle2D(110,0,111,30));
        }
        GameScene.setLife();

    }

}
