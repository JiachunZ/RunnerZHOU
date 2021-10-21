public class Camera {
    private String x;
    private String y;


    public String getX() {
        return x;
    }
    public String getY(){
        return y;
    }
    public Camera (String x, String y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString (){
        return "les coordonnées sont ("+this.x + " , " + this.y + ")";
    }



}
