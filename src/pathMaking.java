import java.util.ArrayList;

public class pathMaking extends pathMath {
    double sightDist;//farthest the robot can "see"
    public pathMaking(double sightDist){
        this.sightDist = sightDist;
    }
    public pathMaking(){
        this.sightDist = 1.5;//1.5 allows for sight in strait and diagonal lines
    }
    public Pin[] look(Pin curLocation){//makes an ArrayList of all points that are in range/"sight"
        ArrayList<Pin> canSee = new ArrayList<>();
        
        getDist(curLocation, field_map.getFIELD(1,1/*some point x,y */))
        while()
        
    }
}
