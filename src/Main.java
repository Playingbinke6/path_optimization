import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        
        virtualBot bot1 = new virtualBot();
        field_map map1 = new field_map(14, 14);
        pathMaking bot1Path = new pathMaking(bot1, map1);
        ArrayList<Pin> pastMoves = new ArrayList<>();
        Pin nextMovement = pathMath.nextPin(bot1Path.look());
        pastMoves.add(bot1.getCurLocation());
        pastMoves.add(nextMovement);
        
        while(bot1Path.crashCheck(nextMovement)){//this is the running of the
            pastMoves.add(pathMath.nextPin(bot1Path.look()));
            
        }
        
        
    }
}