public class Camera {
    private double x;
    private double y;


    /*public double getCAMx() {
        return x;
    }
    public double getCAMy(){
        return y;
    }*/

    public Camera (double x, double y){
        this.x=x;
        this.y=y;
    }


    @Override
    public String toString (){
        return "les coordonnées sont ("+this.x + " , " + this.y + ")";
    }



}
