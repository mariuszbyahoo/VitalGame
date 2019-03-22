import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    @Test
    public void getBoardTest(){
        // checking is the getBoard really returning an Array of Cells
        Board board = new Board(10);
        Cell [] [] board2 = new Cell [10][10];
        Assert.assertEquals(board.getBoard(), board2);
    }

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
