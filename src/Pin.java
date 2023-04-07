public class Pin {
    double x;
    double y;
    double value;
    public Pin(double x, double y, double value) {
        this.x=x;
        this.y=y;
        this.value = value;
    }
    public Pin(double value){
        this.value = value;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double getValue(){
        return value;
    }
}
