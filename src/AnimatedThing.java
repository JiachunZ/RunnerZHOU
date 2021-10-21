import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AnimatedThing {

    private double x;
    private double y;
    private ImageView imV;
    private static Image spriteSheet = new Image("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\heros.png");
    private Integer attitude;

    public AnimatedThing (double x, double y, Integer attitude){
        this.x =x;
        this.y =y;
        this.imV = new ImageView(spriteSheet);
        this.attitude = attitude;

    }

}
