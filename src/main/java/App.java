public class App {
    public static void main (String[] args){
        Board board = new Board(20);
        board.createColony();
        board.printBoard();
    }
}
