
public class pathMath {// general math for calculationg path movments and things about the path
    public double getDist(Pin pin1, Pin pin2) {//distance between 2 pins, ang in rad's from X axis
        double ang, dist;
        dist = Math.sqrt(Math.pow((pin2.getX() - pin1.getX()), 2) + Math.pow((pin2.getY() - pin1.getY()), 2));
        return dist;
    }

    public double getAngle(Pin pin1, Pin pin2) {//angle between 2 points in rad's
        double dist = getDist(pin1, pin2);
        double ang = dist * Math.sin(pin1.getY() - pin2.getY());
        return ang;
    }

    public double pathLength(Pin[] cords) {//finds the total length of the path
        double totalDist=0;
        for(int i=0; i< cords.length-1; i++){
            totalDist += getDist(cords[i], cords[i+1]);
        }
        return totalDist;
    }

    public double[] nextPoint(Pin[] cords) {//find the next pin to move to from cords[] of pins
        double[] next = {cords[0].getX(), cords[0].getY(), cords[0].getValue()};

        for(int i=0; i< cords.length; i++){
            if(cords[i].getValue()>next[2]){
                next[0] = cords[i].getX();
                next[1] = cords[i].getY();
                next[2] = cords[i].getValue();
            }
        }
        return next;
    }
}
