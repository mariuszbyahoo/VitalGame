public class GameLogic {
    public void run() {
        Board board = new Board(15);
        board.createColony();
        board.printBoard();
        System.out.println("Next: ");
        while (true) {
            board.nextRound();
            board.printBoard();
            System.out.println("Next: ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
