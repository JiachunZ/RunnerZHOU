import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;

public class Heros /*extends AnimatedThing */{

    private double x;
    private double y;
    private double indY;
    private double indX;
    private ImageView sprite;
    private static Image spriteSheet = new Image("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\heros.png");
    private static long timeAv;


    /*public Heros(double x, double y, int width, int height, Integer attitude) {
        super(x, y, width, height, attitude);
        this.sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(x, y, width, height));
    }*/  //avec extends animatedThing


    public Heros (double x, double y,int width,int height,int indX,int indY){
        this.x=x;
        this.y=y;
        this.indX= x;
        this.indY= y;
        this.sprite= new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(indX,indY,width,height));
        sprite.setX(x);
        sprite.setY(y);
    //Rectangle2D(double minX, double minY, double width, double height)
    //on prend seulement un sprite sur spriteSheet en fonction de la position x,y donnée
    }

    public ImageView getSprite() {
        return sprite;
    }

/*    void update() {
        AnimatedThing a = new AnimatedThing(200, 250, 75, 100, 1);
        double x1 = 20;
        double y1 = 0;
        a.getAimV().setViewport(new Rectangle2D(x1, y1, 75, 100));
        if (x1 < 500) {
            x1 = x1 + 75;
            a.getAimV().setViewport(new Rectangle2D(x1, y1, 75, 100));
        } else {
            x1 = 20;
            a.getAimV().setViewport(new Rectangle2D(x1, y1, 75, 100));
        }*/


    void update(long time) {
        GameScene.myHero();
        double x1 = this.getHindX();

        if ((time-getTimeAv())>30000000){
            if (x1 < 460) {
                x1 = x1+85;
                this.setHx(this.getHx()+3);
                this.setHindX(x1);
            } else {
                x1 = 10;
                this.setHx(this.getHx()+3);
                this.setHindX(x1);
            }
        } else{
            if (x1 < 460) {
                x1 = x1;
                this.setHx(this.getHx()+3);
                this.setHindX(x1);
            } else {
                x1 = 10;
                this.setHx(this.getHx()+3);
                this.setHindX(x1);
            }
        }
        this.setTimeAv(time);
    }

    /*void update() {
        GameScene.myHero();
        double x1 = this.getHindX();

            if (x1 < 500) {
                x1 = x1 + 85;
                this.setHx(this.getHx()+5);
                this.setHindX(x1);
            } else {
                x1 = 10;
                this.setHx(this.getHx()+5);
                this.setHindX(x1);
            };
    }*/




    public static void setTimeAv(long timeAv) {
        Heros.timeAv = timeAv;
    }
    public static long getTimeAv(){
        return timeAv;
    }


    public double getHx() {
        return x;
    }
    public void setHx(double x) {
        this.x = x;
    }
    public void setHindX(double indX) {
        this.indX = indX;
    }
    public double getHindX() {
        return indX;
    }


    void jump(){

    }

}

/* GMP pour photo*/
