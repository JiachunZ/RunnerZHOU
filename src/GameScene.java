import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Rectangle2D;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Parent;


public class GameScene extends Scene {
    private Camera cam;
    private staticThing left;
    private staticThing right;
   // private Heros myHero;

    public GameScene (Group g,double camX,double camY,double camL,double sceneL){
        super(g,600,400);
        
        this.left = new staticThing("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\desert.png",0,0);
        this.right = new staticThing("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\desert.png",1000,0);
        this.cam = new Camera (camX,camY,camL);
        //this.myHero = new Heros ();

        double offset = sceneL%800;  //la longueur restante pour remplir la scène à gauche
        left.getImV().setViewport(new Rectangle2D (800-offset,0,800,400));
        left.getImV().setX(0);
        left.getImV().setY(0);
        g.getChildren().addAll(left.getImV());

        double nbDeserts = (sceneL-offset)/800;
        double i = 0;
        while (i<nbDeserts){
            right.getImV().setX(offset+i*800);
            right.getImV().setY(0);
            i++;
            g.getChildren().addAll(right.getImV());
        }
    }
/*void render(){
        double offset = left.getX()


        double offsetLeft = left.getImV().getX()%this.cam.getX();
    left.getImV().setViewport(new Rectangle2D(offsetLeft,0,left.getImV().getX()-offsetLeft,left.getImV().getY()));
     % donne le reste de la division entière
    //définition de gamescene puis mettre hero
}*/
public staticThing getLeft(){
        return left;
}
}
