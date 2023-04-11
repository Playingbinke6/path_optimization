import java.util.ArrayList;

public class pathMaking extends pathMath {
    
    virtualBot virtualBot;
    field_map field_map;
    
    public pathMaking(virtualBot virtualBot, field_map field_map){
        this.virtualBot = virtualBot;
        this.field_map = field_map;
    }
    //this will also check for if the bot will run in to something on its way
    //currently just look at end position
    public boolean crashCheck(Pin destLocation){
        int x = (int) Math.floor((-.5 * virtualBot.getSideLengthX())+(-1 * virtualBot.getSafeSpace()));//need to add the destination point in this math
        for(x=x; x< virtualBot.getSafeSpace() +(virtualBot.getSideLengthX()/2); x++) {
            //these two for loops will look through all points that are safeSpace from the side of the bot
            int y = (int) Math.floor((-.5 * virtualBot.getSideLengthY()) + (-1 * virtualBot.getSafeSpace()));
            for (y = y; y < virtualBot.getSafeSpace() + (virtualBot.getSideLengthY() / 2); y++) {
                if(field_map.getFIELD(x,y).getValue()<0){//anything negative is a hard wall
                    return false;
                }
            }
        }
        return true;
    
    }
    
    //makes an ArrayList of all points that are in range/"sight"
    public Pin[] look(){
        ArrayList<Pin> canSee = new ArrayList<>();
        Pin curLocation = virtualBot.getCurLocation();
        //x dimension of the square that we look at before finding the exact Dist
        int x = (int) Math.floor((-.5 * virtualBot.getSideLengthX())+(-1 * virtualBot.getSightDist()));
        for(x=x; x<virtualBot.getSightDist()+(virtualBot.getSideLengthX()/2); x++){
            //these two for loops will look through all points that are sightDist from the side of the bot
            int y = (int) Math.floor((-.5 * virtualBot.getSideLengthY())+(-1 * virtualBot.getSightDist()));
            for(y=y; y<virtualBot.getSightDist()+(virtualBot.getSideLengthY()/2); y++){
                
                if(!(x>=(curLocation.getX()-(virtualBot.getSideLengthX()/2)) && x<=(curLocation.getX()+(virtualBot.getSideLengthX()/2)) && y>=(curLocation.getY()-(virtualBot.getSideLengthY()/2)) && y<=(curLocation.getY()-(virtualBot.getSideLengthY()/2)))){
                    canSee.add(field_map.getFIELD(x,y));
                
                }
            }
        }
        return canSee.toArray(new Pin[0]);
    }
}
