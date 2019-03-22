public class App {
    public static void main (String[] args){
        Board board = new Board(20);
        board.createColony();
        board.printBoard();
        while(true){
            board.nextRound();
            board.printBoard();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
