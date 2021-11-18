import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;

public class Heros /*extends AnimatedThing */{

    private double x;
    private double y;
    private double indY;
    private double indX;
    private double maxIndX;
    private ImageView sprite;
    private static Image spriteSheet = new Image("\\img\\heros.png");
    private static long timeAv;


    /***************** constructeur *************************************************/

    public Heros (double x, double y,int width,int height,double indX,double indY,double maxIndX){
        this.x=x;
        this.y=y;
        this.indX= indX;
        this.indY= indY;
        this.maxIndX = maxIndX;
        this.sprite= new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(indX,indY,width,height));
        sprite.setX(x);
        sprite.setY(y);
    //Rectangle2D(double minX, double minY, double width, double height)
    //on prend seulement un sprite sur spriteSheet en fonction de la position x,y donnée
    }




    /***************** Mise-à-jour *************************************************/

    void update(long time) {
        GameScene.setMyHero();
        double x1 = this.getHindX();
        double maxIndX = this.getMaxIndX();

        // courir normalement
        if (maxIndX == 460){
            if ((time-getTimeAv())>66000000){  //66000000
                if (x1 < maxIndX) {
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
                if (x1 < maxIndX) {
                    x1 = x1;
                    this.setHx(this.getHx()+3);
                    this.setHindX(x1);
                } else {
                    x1 = 10;
                    this.setHx(this.getHx()+3);
                    this.setHindX(x1);
                }
            }


        //sauter
        } else if (maxIndX == 310){

                if (this.getHy()>150 && this.getHindX()==10 && this.getHindY()!=0){
                    this.setHx(this.getHx()+3);
                    this.setHy(this.getHy()-2);
                    this.sprite.setY(this.getHy());
                    if (this.getHy()==152){
                        this.setHindX(180);
                    }
                } else if (this.getHy()<250 && this.getHindX()==180 && this.getHindY()!=0){
                    this.setHx(this.getHx()+3);
                    this.setHy(this.getHy()+2);
                    this.sprite.setY(this.getHy());
                    if (this.getHy()==248){
                        this.setHy(250);
                        this.setHindX(10);
                        this.setHindY(0);
                        this.setMaxIndX(460);
                    }
                }
        }
    }


    void jump(){
        GameScene.setMyHero();
        double indX = 10;
        double indY = this.getHindY();
        double x = this.getHx();
        double y = this.getHy();


        if (indY<150 ) {

            this.setHx(x+3);
            this.setHindX(indX);
            this.setHy(y-2);
            this.setHindY(indY + 160);

            this.setMaxIndX(310);
            this.sprite.setY(this.getHy());
        }


    }


    /***************** setter *************************************************/
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
    public void setMaxIndX(double max){
        this.maxIndX=max;
    }


    /***************** getter *************************************************/
    public ImageView getSprite() {
        return sprite;
    }
    public static long getTimeAv(){
        return timeAv;
    }
    public double getHindY() {
        return indY;
    }
    public double getHindX() {
        return indX;
    }
    public double getHx() {
        return x;
    }
    public double getHy() {
        return y;
    }
    public double getMaxIndX(){
        return maxIndX;
    }
    }


/* GMP pour photo*/
