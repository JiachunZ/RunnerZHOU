import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.geometry.Rectangle2D;


public class GameScene extends Scene {
    private Camera cam;
    private staticThing left;
    private staticThing right;
    private Heros myHero;

    /***************** getter *************************************************/

    public staticThing getLeft(){
        return left;
    }

    /***************** Constructeur *************************************************/

    public GameScene (Group g,double camX,double camY,double sceneL){
        super(g,600,400);
        this.left = new staticThing("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\desert.png",0,0);
        this.right = new staticThing("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\desert.png",800,0);
        this.cam = new Camera (camX,camY);
        this.myHero = new Heros (200,250,75,100);

        //update();


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


        timer.start();
        myHero.getSprite().setX(200);
        myHero.getSprite().setY(250);
        g.getChildren().addAll(myHero.getSprite());
    }


    /***************** Mise-à-jour *************************************************/
    /*void update(){
        //double offset = left.getImV().getX()%cam.getCAMx();
        //left.getImV().setViewport(new Rectangle2D(offset,0,left.getImV().getX()-offset,left.getImV().getY()));
     //% donne le reste de la division entière
        double offset = 800-cam.getCAMx();
        left.getImV().setViewport(new Rectangle2D(offset,0,800-offset,left.getImV().getY()));
        right.getImV().setViewport(new Rectangle2D(0,0,offset,right.getImV().getY()));
        left.getImV().setX(-cam.getCAMx());
        left.getImV().setY(0);
        right.getImV().setX(800-cam.getCAMx());
        right.getImV().setY(0);
    }*/




    AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long time) {
            myHero.update();
        }
    };

}
