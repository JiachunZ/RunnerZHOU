import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class AnimatedThing {


    private double x;
    private double y;
    private ImageView imV;
    private static Image spriteSheet = new Image("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\heros.png");
    private Integer attitude;

    public AnimatedThing (double x, double y, int width,int height,Integer attitude){
        this.x =x;
        this.y =y;
        this.imV = new ImageView(spriteSheet);
        this.attitude = attitude;


    }

    public double getAx() {
        return x;
    }
    public double getAy() {
        return y;
    }
    public ImageView getAimV() {
        return imV;
    }
    public void setAx(double x) {
        this.x = x;
    }
    public void setAy(double y) {
        this.y = y;
    }


}
