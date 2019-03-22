/**
 * Class containins an int, representing a size of the board of Cells, and one two dimensional array of Cells.
 */
public class Board {
    private int size;
    private Cell [] [] board;

    /**
     * Board class's constructor. Generates a new Board object assigns a two dimensional array of Cells to it.
     * @param size
     */
    public Board(int size) {
        board = new Cell[size][size];
        initBoard();
    }



    // makes a cross of the cells at the begining

    /**
     * creates a new dead cell, and assigns it to every null value in the Board's array
     */
    private void initBoard (){
        for (int i = 0 ; i < board.length ; i ++){
            for (int j = 0 ; j < board.length ; j ++){
                board[i][j] = new Cell(Life.DEAD);
            }
        }
    }

    /**
     * prints the board to the console
     */
    public void printBoard(){
        for (int i = 1; i < board.length; i ++){
            for (int j = 1; j < board.length; j ++){
                System.out.print("|" + board[i][j].getStatus().desc);
            }
            System.out.println();
        }
    }

    /**
     * generates the begining of the game, it creates a cross at the middle of an array.
     */
    public void createColony(){
        int middle = board.length / 2;
        board[middle][middle].setStatus(Life.ALIVE);
        board[middle][middle - 1].setStatus(Life.ALIVE);
        board[middle][middle + 1].setStatus(Life.ALIVE);
        board[middle - 1][middle].setStatus(Life.ALIVE);
        board[middle + 1][middle].setStatus(Life.ALIVE);
    }
    /**
     * returns the object's Cell [] [] array
     * @return
     */
    public Cell[][] getBoard() {
        return  board;
    }

    /**
     * returns the Cell from the array with a specified location
     * @param i
     * @param j
     * @return
     */
    public Cell getCell(int i, int j){
        return board [i][j];
    }

    /**
     * returns the size of an Board's array
     * @return
     */
    public int getSize() {
        return size;
    }
}
