import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class AnimatedThing {


    private double x;
    private double y;
    private int width;
    private int height;

    private ImageView imV;
    private Image spriteSheet;



    /***************** constructeur *************************************************/
    public AnimatedThing(double x,double y, int width,int height,String chemin){
        this.x =x;
        this.y =y;
        this.width=width;
        this.height=height;
        this.spriteSheet = new Image (chemin);
        this.imV = new ImageView(spriteSheet);


        imV.setViewport(new Rectangle2D(0,0,width,height));
    }


    /***************** getter *************************************************/
    public double getAx() {
        return x;
    }
    public double getAy() {
        return y;
    }
    public int getWidth(){ return width;}
    public int getHeight(){return height;}
    public ImageView getAimV() {
        return imV;
    }

    /***************** setter *************************************************/
    public void setAx(double x) {
        this.x = x;
    }
    public void setAy(double y) {
        this.y = y;
    }
    public void setAimV(String chemin){
        this.spriteSheet=new Image (chemin);
        this.imV= new ImageView(spriteSheet);
    }


}
