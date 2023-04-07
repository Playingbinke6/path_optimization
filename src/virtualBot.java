public class virtualBot {
    static double sideLengthX;// sideLength should be in inchs, over estmate if messurments can't be exact
    static double sidelengthY;
    double startAngle;//up/north is aprox = 1.57079632679 rad or PI/2 rad
    
    public virtualBot(double sideLengthX, double sideLengthY, double startAngle) {
        this.sideLengthX = sideLengthX;
        this.sidelengthY = sideLengthY;
        this.startAngle = startAngle;
    }
    
    public virtualBot(){
        this.sideLengthX = 10;
        this.sidelengthY = 10;
        this.startAngle = Math.PI/2; // this is perfectly up/north
    }
    
    public static double getSideLengthX() {
        return sideLengthX;
    }
    
    public static double getSideLengthY() {
        return sidelengthY;
    }
    
    public double getStartAngle(){
        return startAngle;
    }
}