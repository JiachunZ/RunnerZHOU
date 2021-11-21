import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;


public class GameScene extends Scene {
    private Camera cam;
    private double sceneL;
    private static staticThing left= new staticThing("\\img\\desert.png",0,0);
    private static staticThing right= new staticThing("\\img\\desert.png",800,0);
    private static Heros myHero = new Heros (135,250,75,100,10,0,460);
    private static Obstacle obstacle = new Obstacle(540,285,98,82,"\\img\\obstacle.png",0,myHero);
    private static obstacleList list = new obstacleList(3);
    private static Life life = new Life(460,30,111,30,"\\img\\life.png",0,myHero,obstacle);


    /***************** getter *************************************************/



    /***************** setter *************************************************/

    public static void setLeft(){
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

    public static void setObstacle() {
        //obstacle.getAimV().setViewport(new Rectangle2D(0,0, obstacle.getWidth(),obstacle.getHeight()));
        //Obstacle obs = list.findObstacle(i);
        obstacle.getAimV().setX(obstacle.getAx()-myHero.getHx());
        obstacle.getAimV().setY(obstacle.getAy());
    }

    public static void setObstacleList(){
        list.createList(list.getN(),myHero);
        list.addObstacleImage(list);
    }

    public static void setLife(){
        life.getAimV().setX(life.getAx());
        life.getAimV().setY(life.getAy());
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

        //obstacle
        g.getChildren().addAll(obstacle.getAimV());

        //hero
        myHero.getSprite().setViewport(new Rectangle2D(myHero.getHindX(), myHero.getHindY(), 75, 100));
        g.getChildren().addAll(myHero.getSprite());

        //lifebare
        g.getChildren().addAll(life.getAimV());

    }





    /***************** Mise-à-jour *************************************************/


    static AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long time) {
            left.update();
            myHero.update(time);
            obstacle.update();
            life.update();
            //System.out.println("x hero : "+ myHero.getHx());
            //System.out.println("x obs : "+ obstacle.getAx());
            if (life.getEtat()==3){
                timer.stop();
            }
        }
    };



}
