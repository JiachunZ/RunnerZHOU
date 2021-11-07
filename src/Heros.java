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

    /***************** constructeur *************************************************/

    public Heros (double x, double y,int width,int height,double indX,double indY){
        this.x=x;
        this.y=y;
        this.indX= indX;
        this.indY= indY;
        this.sprite= new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(indX,indY,width,height));
        sprite.setX(x);
        sprite.setY(y);
    //Rectangle2D(double minX, double minY, double width, double height)
    //on prend seulement un sprite sur spriteSheet en fonction de la position x,y donnée
    }




    /***************** Mise-à-jour *************************************************/

    void update(long time) {
        GameScene.getMyHero();
        double x1 = this.getHindX();
        this.setHindY(0);

        if ((time-getTimeAv())>66000000){
            if (x1 < 460) {
                x1 = x1+85;
                this.setHx(this.getHx()+3);
                this.setHindX(x1);
            } else {
                x1 = 10;
                this.setHx(this.getHx()+3);
                this.setHindX(x1);
            }
            this.setTimeAv(time);
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
    }

    void jump(){
        GameScene.getMyHero();
        double indX = this.getHindX();
        double indY = this.getHindY();
        double x = this.getHx();
        double y = this.getHy();
        long time = this.getTimeAv();
        if ((time-getTimeAv())>66000000) {
            this.setHx(x + 3);
            this.setHindX(indX);
            this.setHy(y + 10);
            this.setHindY(indY + 160);
        }
    }


    /***************** setter et getter *************************************************/
    public static void setTimeAv(long timeAv) {
        Heros.timeAv = timeAv;
    }
    public void setHindX(double indX) {
        this.indX = indX;
    }
    public void setHindY(double indY) {
        this.indY = indY;
    }
    public void setHx(double x) {
        this.x = x;
    }
    public void setHy(double y) {
        this.y= y;
    }



    public ImageView getSprite() {
        return sprite;
    }

    public static long getTimeAv(){
        return timeAv;
    }
    public double getHindY() { return indY;}
    public double getHindX() {
        return indX;
    }
    public double getHx() {
        return x;
    }
    public double getHy() {
        return y;
    }
    }


/* GMP pour photo*/
