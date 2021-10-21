public class Camera {
    private String x;
    private String y;
    private String cameraL;


    public String getX() {
        return x;
    }
    public String getY(){
        return y;
    }
    public String getCameraL(){
        return cameraL;
    }
    public Camera (String x, String y,String camL){
        this.x=x;
        this.y=y;
        this.cameraL=camL;

    }

    @Override
    public String toString (){
        return "les coordonnées sont ("+this.x + " , " + this.y + ")";
    }



}
