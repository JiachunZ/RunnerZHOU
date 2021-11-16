import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class HelloWorld extends Application {

    private static final Image SCENARY = new Image ("\\img\\desert.png",800,400,true,true);
    final private ImageView imageviewSceneLeft = new ImageView (SCENARY);
    private static staticThing life1 = new staticThing ("\\img\\heart.png",30,30);
    private static staticThing life2 = new staticThing ("\\img\\heart.png",30,30);
    private static staticThing life3 = new staticThing ("\\img\\heart.png",30,30);
    private static staticThing obstacle = new staticThing ("\\img\\obstacle.png",0,0);

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Demo");
        Group root = new Group();
        //Scene scene = new Scene(root, 800, 400);
        //primaryStage.setScene(scene);
        //primaryStage.show();
        primaryStage.show();

        GameScene gs = new GameScene(root,300,0,1200);
        primaryStage.setScene(gs);

        //life bare
        life1.getImV().setX(460);
        life1.getImV().setY(20);
        root.getChildren().add(life1.getImV());
        life2.getImV().setX(500);
        life2.getImV().setY(20);
        root.getChildren().add(life2.getImV());
        life3.getImV().setX(540);
        life3.getImV().setY(20);
        root.getChildren().add(life3.getImV());


        // obstacle
        //obstacle.getImV().setX(460);
        //obstacle.getImV().setY(280);
        //root.getChildren().add(obstacle.getImV());




    }


    public static void main(String[] args) {
        launch(args);
        // write your code here
    }
}





