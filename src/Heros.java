import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;

public class Heros {
    private double x;
    private double y;
    private ImageView sprite;
    private static Image spriteSheet = new Image("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\heros.png");


    public Heros (double x, double y,int width,int height){
        this.x=x;
        this.y=y;
        this.sprite= new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(x,y,width,height));
    //Rectangle2D(double minX, double minY, double width, double height)
    //on prend seulement un sprite sur spriteSheet en fonction de la position x,y donnée
    }

    public ImageView getSprit() {
        return sprite;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

}

/* GMP pour photo*/
