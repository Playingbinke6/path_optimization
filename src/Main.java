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


        System.out.println("Starting movement calculation");
        while(bot1.getCurLocation().getValue() < 30){//this is the running of the program

            pastMoves.add(pathMath.nextPin(bot1Path.look()));
            bot1.setCurLocation(pathMath.nextPin(bot1Path.look()));
            System.out.println(bot1.getCurLocation().ToString());
            bot1Path = new pathMaking(bot1, map1);
        }


        System.out.println("End movement calculation");
        for (Pin e:pastMoves) {
            System.out.println(e.ToString());
        }
        
    }
}