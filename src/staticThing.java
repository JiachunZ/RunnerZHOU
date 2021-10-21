import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class staticThing {

    //coordonnée pour coller les deux parties de gameScene (?)
    //coordonnée sur GameScene pour mettre staticThing
    private double x;
    private double y;
    private ImageView imV;

    public staticThing (String fileName,double x,double y){
        this.x=x;
        this.y=y;
        Image im = new Image (fileName);
        this.imV = new ImageView(im);
    }

    public ImageView getImV (){return imV;}
    public double getX(){return x;}
    public double getY(){return y;}

}
