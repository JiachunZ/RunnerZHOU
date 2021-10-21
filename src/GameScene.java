import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Parent;


public class GameScene extends Scene {
    private Camera cam;
    private staticThing left;
    private staticThing right;
   // private Heros myHero;

    public GameScene (Group g,String camX,String camY,String camL,String sceneL){
        super(g);
        this.left = new staticThing("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\desert.png",,);
        this.right = new staticThing("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\desert.png",,);
        this.cam = new Camera (camX,camY,camL);
        //this.myHero = new Heros ();
        render();
    }
void render(){
        //left.getImV().setViewport(new Rectangle());

    //définition de gamescene puis mettre hero
}
}
