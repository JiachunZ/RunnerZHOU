import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;


public class GameScene extends Scene {
    private Camera cam;
    private static staticThing left= new staticThing("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\desert.png",0,0);
    private static staticThing right= new staticThing("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\desert.png",800,0);
    private static staticThing life1 = new staticThing ("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\heart.png",30,30);
    private static staticThing life2 = new staticThing ("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\heart.png",30,30);
    private static staticThing life3 = new staticThing ("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\heart.png",30,30);
    private static staticThing cactus = new staticThing ("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\cactus2.png",0,0);
    private double sceneL;
    private static Heros myHero = new Heros (200,250,75,100,10,0,460);

    /***************** getter *************************************************/

    public staticThing getLeft(){
        return left;
    }
    public double getSceneL(){ return sceneL;}




    /***************** setter *************************************************/

    public static void setLeft(){
        //double offset = 800-myHero.getHx();  //la longueur restante pour remplir la scène à gauche
        left.getImV().setViewport(new Rectangle2D (myHero.getHx()%800,0,800,400));
        left.getImV().setX(0);
        left.getImV().setY(0);

    }
    public static void setRight(){
        double offset = myHero.getHx()%800;  //la longueur restante pour remplir la scène à gauche
        right.getImV().setViewport(new Rectangle2D (0,0,offset,400));
        right.getImV().setX(800-offset);
        right.getImV().setY(0);
    }

    public static void setMyHero(){
        myHero.getSprite().setViewport(new Rectangle2D(myHero.getHindX(), myHero.getHindY(), 75, 100));
    }


    /***************** Constructeur *************************************************/

    public GameScene (Group g,double camX,double camY,double sceneL){
        super(g,600,400);
        this.cam = new Camera (camX,camY);
        this.sceneL = sceneL;

        timer.start();
        this.setOnMouseClicked((event)->{
            System.out.println("Jump");
            myHero.jump();
        });

        // background
        g.getChildren().addAll(left.getImV());
        g.getChildren().addAll(right.getImV());

        //hero
        myHero.getSprite().setViewport(new Rectangle2D(myHero.getHindX(), myHero.getHindY(), 75, 100));
        g.getChildren().addAll(myHero.getSprite());

        //life bare
        life1.getImV().setX(460);
        life1.getImV().setY(20);
        g.getChildren().add(life1.getImV());
        life2.getImV().setX(500);
        life2.getImV().setY(20);
        g.getChildren().add(life2.getImV());
        life3.getImV().setX(540);
        life3.getImV().setY(20);
        g.getChildren().add(life3.getImV());


        // cactus
        cactus.getImV().setX(460);
        cactus.getImV().setY(200);
        g.getChildren().add(cactus.getImV());




    }





    /***************** Mise-à-jour *************************************************/


    static AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long time) {
            left.update();
            myHero.update(time);
        }
    };



}
