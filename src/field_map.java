public class field_map {
    //this is where the 2D array of the field will be stored, each pixel is a "Pin" obj
    int[][] MAP1 = new int[][]{
    //0   1   2   3   4   5   6   7   8   9  10  11  12  13
    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},//0
    {-1,  8,  9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, -1},//1
    {-1,  9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, -1},//2
    {-1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, -1},//3
    {-1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, -1},//4
    {-1, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, -1},//5
    {-1, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1},//6
    {-1, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1},//7
    {-1, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, -1},//8
    {-1, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, -1},//9
    {-1, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, -1},//10
    {-1, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, -1},//11
    {-1, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, -1},//12
    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},//13
            //bot starts at (1, 1)
};//starter map, 14x14 = two ticks per mat with outside for walls
    
    public static Pin[][] FIELD;// the 2D array of Pin obj's
    
    public field_map(int x, int y) {// turns the test field of values above in to a 2D array of Pin obj's
        FIELD = new Pin[x][y];
        for (int i=0; i< MAP1.length; i++) {
            for (int j=0; j<MAP1[i].length; j++) {
                Pin pin = new Pin(i, j, MAP1[i][j]);
            
            }
        }
        
    }
    
    public static Pin[][] getFIELD() {
        return FIELD;
    }
    
    public static Pin getFIELD(int x, int y){
        return FIELD[x][y];
    }
}
