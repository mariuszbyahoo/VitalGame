/**
 * Class containins an int, representing a size of the cellsArray of Cells, and one two dimensional array of Cells.
 */
public class Board {
    private int size;
    private Cell [] [] cellsArray;

    /**
     * Board class's constructor. Generates a new Board object assigns a two dimensional array of Cells to it.
     * @param size
     */
    public Board(int size) {
        cellsArray = new Cell[size][size];
        initBoard();
    }
    /**
     * creates a new dead cell, and assigns it to every null value in the Board's array
     */
    private void initBoard (){
        for (int i = 0; i < cellsArray.length ; i ++){
            for (int j = 0; j < cellsArray.length ; j ++){
                cellsArray[i][j] = new Cell(Life.DEAD);
                cellsArray[i][j].setI(i);
                cellsArray[i][j].setJ(j);
            }
        }
    }
    /**
     * prints the cellsArray to the console
     */
    public void printBoard(){
        for (int i = 1; i < cellsArray.length; i ++){
            for (int j = 1; j < cellsArray.length; j ++){
                System.out.print("|" + cellsArray[i][j].getStatus().desc);
            }
            System.out.println();
        }
    }

    /**
     * generates the begining of the game, it creates a cross at the middle of an array.
     */
    public void createColony(){
        int middle = cellsArray.length / 2;
        cellsArray[middle][middle].setStatus(Life.ALIVE);
        cellsArray[middle][middle - 1].setStatus(Life.ALIVE);
        cellsArray[middle][middle + 1].setStatus(Life.ALIVE);
        cellsArray[middle - 1][middle].setStatus(Life.ALIVE);
        cellsArray[middle + 1][middle].setStatus(Life.ALIVE);
    }

    /**
     * changes the status of earlier existing cells
     */
    public void nextRound(){
        for (int i = 0; i < cellsArray.length - 1; i ++){
            for (int j = 0; j < cellsArray.length - 1; j ++){
                cellsArray[i][j].changeStatus(countAliveNeighbours(i,j));
            }
        }
    }

    /**
     * Method counts the number of the specific cell's neighbour, which is alive
     * @param i
     * @param j
     * @return
     */
    public int countAliveNeighbours(int i, int j){
        int startX = Math.max(i - 1, 0);
        int startY = Math.max(j - 1, 0);
        int endX = Math.min(i + 1, cellsArray.length - 1);
        int endY = Math.min(j + 1, cellsArray.length - 1);

        int aliveNeighbours = 0;
        for (int x = startX ; x <= endX ; x ++){
            for (int y = startY; y <= endY ; y ++){
                if (cellsArray[x][y].getStatus() == Life.ALIVE){
                    aliveNeighbours ++;
                }
            }
        }
        if (cellsArray[i][j].getStatus() == Life.ALIVE){
            aliveNeighbours --;
        }
        return aliveNeighbours;
    }
    /**
     * returns the Board's Cell [] [] array
     * @return
     */
    public Cell[][] getCellsArray() {
        return cellsArray;
    }
    /**
     * returns the Cell from the array with a specified location
     * @param i
     * @param j
     * @return
     */
    public Cell getCell(int i, int j){
        return cellsArray[i][j];
    }

    /**
     * returns the size of an Board's array
     * @return
     */
    public int getSize() {
        return size;
    }
}
