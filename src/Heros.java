import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;

public class Heros /*extends AnimatedThing */{

    private double x;
    private double y;
    private ImageView sprite;
    private static Image spriteSheet = new Image("C:\\Users\\jzb28\\IdeaProjects\\Runner\\img\\heros.png");

    /*public Heros(double x, double y, int width, int height, Integer attitude) {
        super(x, y, width, height, attitude);
        this.sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(x, y, width, height));
    }*/  //avec extends animatedThing


    public Heros (double x, double y,int width,int height){
        this.x=x;
        this.y=y;
        this.sprite= new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(x,y,width,height));
    //Rectangle2D(double minX, double minY, double width, double height)
    //on prend seulement un sprite sur spriteSheet en fonction de la position x,y donnée
    }

    public ImageView getSprite() {
        return sprite;
    }

/*    void update() {
        AnimatedThing a = new AnimatedThing(200, 250, 75, 100, 1);
        double x1 = 20;
        double y1 = 0;
        a.getAimV().setViewport(new Rectangle2D(x1, y1, 75, 100));
        if (x1 < 500) {
            x1 = x1 + 75;
            a.getAimV().setViewport(new Rectangle2D(x1, y1, 75, 100));
        } else {
            x1 = 20;
            a.getAimV().setViewport(new Rectangle2D(x1, y1, 75, 100));
        }*/
    void update() {
        Heros a = new Heros(20, 0, 75, 100);
        double x1 = 20;
        double y1 = 0;
        a.getSprite().setViewport(new Rectangle2D(x1, y1, 75, 100));
        if (x1 < 500) {
            x1 = x1 + 75;
            a.getSprite().setViewport(new Rectangle2D(x1, y1, 75, 100));
        } else {
            x1 = 20;
            a.getSprite().setViewport(new Rectangle2D(x1, y1, 75, 100));
    }


    }
}

/* GMP pour photo*/
