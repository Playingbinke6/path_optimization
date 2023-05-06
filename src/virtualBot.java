public class virtualBot {//contains the information of the robot
    static double sideLengthX;// sideLength should be in inch's, overestimate if measurements can't be exact
    static double sideLengthY;
    static double startAngle;//up/north is approx = 1.57079632679 rad or PI/2 rad
    static double startX;
    static double startY;
    static double sightDist;
    static double safeSpace;
    static Pin curLocation = new Pin(startX, startY);
    
    public virtualBot(double sideLenX, double sideLenY, double startAngle, double startX, double startY, double sightDist, double safeSpace) {
        this.sideLengthX = sideLengthX;
        this.sideLengthY = sideLengthY;
        this.startAngle = startAngle;
        this.startX = startX;
        this.startY = startY;
        this.sightDist = sightDist;
        this.safeSpace = safeSpace;
    }
    
    public virtualBot(){
        this.sideLengthX = 1;
        this.sideLengthY = 1;
        this.startAngle = Math.PI/2 + Math.PI; // this is perfectly up/north
        this.startX = 2;
        this.startY = 2;
        this.sightDist = 1.5;
        this.safeSpace = 1.5;
    }
    
    public double[] nextMove(pathMaking pathMaking){//finds the next point to move to, then returns distance to move and angle in rad
        Pin nextMove = pathMath.nextPin(pathMaking.look());
        double angle = pathMath.getAngle(curLocation, nextMove);
        double dist = pathMath.getDist(curLocation, nextMove);
        curLocation = nextMove;
        return new double[]{dist, angle};
    }
    
    void setCurLocation(Pin newPos) {
        curLocation = newPos;
    }
    
    public double getSideLengthX() {
        return sideLengthX;
    }
    
    public double getSideLengthY() {
        return sideLengthY;
    }
    
    public double getStartAngle(){
        return startAngle;
    }
    public Pin getCurLocation() {
        return curLocation;
    }
    public double getSafeSpace(){
        return safeSpace;
    }
    public double getSightDist(){
        return sightDist;
    }
    
    
}