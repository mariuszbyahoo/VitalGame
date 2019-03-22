import org.junit.Assert;
import org.junit.Test;

public class BoardTest {
    @Test
    public void initBoardTest(){
        // checking is there any null value in the board
        boolean isNull = false;
        Board board = new Board(10);
        board.initBoard();
        for (int i = 0 ; i < board.getBoard().length ; i ++){
            for (int j = 0 ; j < board.getBoard().length ; j ++){
                if (board.getCell(i , j) == null){
                    isNull = true;
                }
            }
        }
        Assert.assertFalse(isNull);
    }
}
