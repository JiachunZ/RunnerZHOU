import javafx.geometry.Rectangle2D;

public class GameOver extends AnimatedThing{

    //paramètre fin pour savoir si on affiche Game Over ou pas
    private int fin;
    private Life life;

    public GameOver(double x,double y, int width,int height,String chemin,Life life){
        super(x,y,width,height,chemin);
        this.fin=0;
        this.life=life;
        this.getAimV().setViewport(new Rectangle2D(18,79,370,60));
    }

    public int getFin(){return fin;}

    void update(){
        GameScene.setGameOver(600,300);
        if (this.life.getEtat()==3){
            this.fin=1;
        }
        if (this.fin==1){
            GameScene.setGameOver(100,180);
        }
    }


}
