import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class HelloWorld extends Application {

    private static final Image SCENARY = new Image ("\\img\\desert.png",800,400,true,true);

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Demo");
        Group root = new Group();
        primaryStage.show();

        GameScene gs = new GameScene(root,300,0,1200);
        primaryStage.setScene(gs);


    }


    public static void main(String[] args) {
        launch(args);
        // write your code here
    }
}





