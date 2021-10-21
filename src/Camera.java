public class Camera {
    private double x;
    private double y;
    private double cameraL;


    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }
    public double getCameraL(){
        return cameraL;
    }
    public Camera (double x, double y,double camL){
        this.x=x;
        this.y=y;
        this.cameraL=camL;
    }

    @Override
    public String toString (){
        return "les coordonnées sont ("+this.x + " , " + this.y + ")";
    }



}
