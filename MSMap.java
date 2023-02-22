public class MSMap{
    MSSquare[][] grid;

    int numCols;
    int numRows;
    int numMines;   

    int clickedCol;
    int clickedRow;
    MSMap(int numCols, int numRows, int numMines, int clickedCol, int clickedRow){
        this.numCols = numCols;
        this.numRows = numRows;
        this.numMines = numMines;
        this.clickedCol = clickedCol;
        this.clickedRow = clickedRow;
        createMap();
    }

    MSSquare getSquare(int col, int row){
        return grid[col][row];
    }

    void createMap(){
        grid = new MSSquare[numCols][numRows];
        for(int i = 0; i < numCols; i++){
            for(int j = 0; j < numRows; j++){
                grid[i][j] = new MSSquare();
            }
        }
        
        //randomly place numMines amount of mines
        for(int i = 0; i < numMines; i++){
            
            int col = (int)(Math.random() * numCols);
            int row = (int)(Math.random() * numRows);
            if(clickedRow == row && clickedCol == col){
                i--;
                continue;
            }

            grid[col][row].setMine(true);
        }

    }


    public String toString(){
        String s = "";
        for(int i = 0; i < numCols; i++){
            for(int j = 0; j < numRows; j++){
                s += grid[i][j].toString();
            }
            s += "\n";
        }
        return s;
    }
}
