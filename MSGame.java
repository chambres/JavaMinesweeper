public class MSGame {

    int numCols;
    int numRows;
    int numMines;

    int numMarked;

    long startTime;

    int deadSeconds;

    int state;

    MSMap map;

    public static final int PLAYING = 0;

    public static final int WIN = 1;
 
    public static final int LOSE = 2;
 
    public static final int NOT_STARTED = 3;

    MSGame(int numCols, int numRows, int numMines, int clickedCol, int clickedRow){


        makeGame(clickedCol, clickedRow);
        System.out.println(map);
    }

    //getters and setters
    int getSeconds(){
        return (int)(System.currentTimeMillis() - startTime) / 1000;
    }
    int getState(){
        return state;
    }
    void setState(int state){
        this.state = state;
    }

    int getNumRows(){
        return numRows;
    }
    int getNumCols(){
        return numCols;
    }
    int getNumMines(){
        return numMines;
    }
    int getNumMarked(){
        return numMarked;
    }
    int getMineCounter(){
        return numMines - numMarked;
    }

    MSMap getMap(){
        return map;
    }

    void setNumMarked(int numMarked){
        this.numMarked = numMarked;
    }

    void reveal(int c, int r){
        //recursion
    }

    void makeGame(int c, int r){
        map = new MSMap(numCols, numRows, numMines, c, r);
    }

    void check(){//updates game state if needed
        
    }



    
}
