

public class Obstacle extends AnimatedThing{

    private double number ;
    private Heros hero;

    public Obstacle(double x, double y, int width, int height,String chemin,double number,Heros hero){
        super(x,y,width,height,chemin);
        this.number= number;
        this.hero=hero;
    }

    /***************** getter *************************************************/

    public double getNumber() {
        return number;
    }
    public Heros getHero(){
        return hero;
    }


    /***************** mise à jour *************************************************/
    void update(){

        GameScene.setObstacle();

        if (this.getAx() < this.getHero().getHx()-100 ) {
            double x = Math.random() * 200;
            x=x-x%3;
            double hx = this.getHero().getHx();
            this.setAx(x+hx+600);
        }
    }


}
