
public class pathMath{// general math for calculation path movements and things about the path
    public static double getDist(Pin pin1, Pin pin2) {//distance between 2 pins, ang in rad's from X axis
        double ang, dist;
        dist = Math.sqrt(Math.pow((pin2.getX() - pin1.getX()), 2) + Math.pow((pin2.getY() - pin1.getY()), 2));
        return dist;
    }

    public static double getAngle(Pin pin1, Pin pin2) {//angle between 2 points in rad's
        double dist = getDist(pin1, pin2);
        return dist * Math.sin(pin1.getY() - pin2.getY());
    }

    public static double pathLength(Pin[] cords) {//finds the total length of the path
        double totalDist=0;
        for(int i=0; i< cords.length-1; i++){
            totalDist += getDist(cords[i], cords[i+1]);
        }
        return totalDist;
    }
    
    //find the next pin to move to from cords[] of pins
    public static Pin nextPin(Pin[] cords) {
        Pin next = cords[0];

        for(int i=0; i< cords.length; i++){
            if(cords[i].getValue()>next.getValue()){
                next = cords[i];
            }
        }
        return next;
    }
    public static Pin nextPin(virtualBot virtualBot, field_map field_map, pathMaking pathMaking){
        Pin[] cords = pathMaking.look();
        Pin next = cords[0];
        
        for(int i=0; i< cords.length; i++){
            if(cords[i].getValue()>next.getValue()){
                next = cords[i];
            }
        }
        return next;
    }
}
