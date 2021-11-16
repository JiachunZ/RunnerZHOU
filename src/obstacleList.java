import java.util.ArrayList;

public class obstacleList {
    private ArrayList<Obstacle> list=null;
    double n;

    public obstacleList(double n){
        this.n=n;
        this.list = new ArrayList<Obstacle>();
    }


    public void addObstacle(Obstacle obs) {
        list.add(obs);
    }

    public void createList (double n,Heros hero){
        double i ;
        for(i=0;i<n;i++){
            double x = Math.random()*400*i;
            Obstacle obs=new Obstacle(400+x,285,98,82,"\\img\\obstacle.png",i,hero);
            addObstacle(obs);
        }
    }

    public double getN(){return n;}
    public void setN(double n){this.n=n;}

    public Obstacle findObstacle(double i) {
        for (Obstacle obs : list) {
            if (obs.getNumber()==i) {return obs;}
        }
        return null;
    }

    public void addObstacleImage(obstacleList list){
        double i;
        for (i=1;i<list.getN();i++){
            Obstacle obs = findObstacle(i);
            obs.getAimV().setX(obs.getAx());
            obs.getAimV().setY(obs.getAy());
        }
    }

    void update (){
        GameScene.setObstacleList();
        this.setN(this.getN()+1);
    }
}
