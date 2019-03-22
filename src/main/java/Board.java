public class Board {
    private int size;
    private Cell [] [] board;

    public Board(int size) {
        board = new Cell[size][size];
    }

    // makes a cross of the cells at the begining
    public void initBoard (){
        for (int i = 0 ; i < board.length ; i ++){
            for (int j = 0 ; j < board.length ; j ++){
                board[i][j] = new Cell(Life.DEAD);
            }
        }
    }

    public void printBoard(){
        for (int i = 1; i < board.length; i ++){
            for (int j = 1; j < board.length; j ++){
                System.out.print("|" + board[i][j].getStatus().desc);
            }
            System.out.println();
        }
    }

    public void createColony(){
        int middle = board.length / 2;
        board[middle][middle].setStatus(Life.ALIVE);
        board[middle][middle - 1].setStatus(Life.ALIVE);
        board[middle][middle + 1].setStatus(Life.ALIVE);
        board[middle - 1][middle].setStatus(Life.ALIVE);
        board[middle + 1][middle].setStatus(Life.ALIVE);
    }
}
