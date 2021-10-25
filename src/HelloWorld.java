import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloWorld extends Application {

    private static final Image SCENARY = new Image ("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\desert.png",800,400,true,true);
    final private ImageView imageviewSceneLeft = new ImageView (SCENARY);

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Demo");
        Group root = new Group();
        //Scene scene = new Scene(root, 800, 400);
        //primaryStage.setScene(scene);
        //primaryStage.show();

        GameScene gs = new GameScene(root,300,0,1200);

        primaryStage.setScene(gs);
        primaryStage.show();



 /*       Heros run1 = new Heros(20,0,75,100,1);
        ImageView sprite1 = run1.getSprite();
        sprite1.setX(200);
        sprite1.setY(250);
        root.getChildren().addAll(sprite1);

        Heros run2 = new Heros (85,0,75,100);
        ImageView sprite2 = run2.getSprit();
        sprite2.setX(400);
        sprite2.setY(250);

        root.getChildren().addAll(imageviewSceneLeft);
        root.getChildren().addAll(sprite2);*/

    }


    public static void main(String[] args) {
        launch(args);
        // write your code here
    }
}





