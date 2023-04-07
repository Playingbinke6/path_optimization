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
        //x dimension of the square that we look at before finding the exact Dist
        int x = (int) Math.floor((-.5 * virtualBot.getSideLengthX())+(-1 * sightDist));
        for(x; x<sightDist+(.5 * virtualBot.getSideLengthX()); x++){
            //these two for loops will look through all points that are sightDist from the side of the bot
            int y = (int) Math.floor((-.5 * virtualBot.getSideLengthY())+(-1 * sightDist));
            for(y; y<sightDist+(.5 * virtualBot.getSideLengthY()); y++){
                
                if(!(x>=(curLocation.getX()-(.5*virtualBot.getSideLengthX())) && x<=(curLocation.getX()+(.5*virtualBot.getSideLengthX())) && y>=(curLocation.getY()-(.5*virtualBot.getSideLengthY())) && y<=(curLocation.getY()-(.5*virtualBot.getSideLengthY())))){
                    canSee.add(field_map.getFIELD(x,y));
                
                }
            }
        }
        Pin[] goodPins = canSee.toArray(new Pin[0]);
        return goodPins;
    }
}
