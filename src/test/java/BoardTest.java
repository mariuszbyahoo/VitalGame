import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    /**
     * checks is the getBoard() method really returning a new object.
     */
    @Test
    public void getBoardTest(){
        //
        Board board = new Board(10);
        Assert.assertNotNull(board.getBoard());
    }

    /**
     * checks is the getCell() method really returning a specific cell
     */
    @Test
    public void getCellTest(){
        Board board = new Board(10);
        Cell cell = board.getCell(1,1);
        // assertEquals() przechodzi na zielono tylko gdy porównuje dwa TE SAME obiekty
        Assert.assertEquals(board.getCell(1,1), cell);
        Assert.assertNotEquals(board.getCell(2,2), cell);
    }

    /**
     * checks is there any null value in the board
     */
    @Test
    public void initBoardTest(){
        boolean isNull = false;
        Board board = new Board(10);
        for (int i = 0 ; i < board.getBoard().length ; i ++){
            for (int j = 0 ; j < board.getBoard().length ; j ++){
                if (board.getCell(i , j) == null){
                    isNull = true;
                }
            }
        }
        Assert.assertFalse(isNull);
    }

    /**
     * checks is there an any alive Cell in the Board's array
     * and, is the amount of them equal to 5.
     */
    @Test
    public void createColonyTest(){
        boolean isAlive = false;
        int aliveCellsAmount = 0;
        Board board = new Board(10);
        board.createColony();
        for (int i = 0 ; i < board.getBoard().length ; i ++){
            for (int j = 0 ; j < board.getBoard().length ; j ++){
                if (board.getCell(i , j).getStatus() == Life.ALIVE){
                    isAlive = true;
                    aliveCellsAmount ++;
                }
            }
        }
        Assert.assertTrue(isAlive);
        Assert.assertEquals(5,aliveCellsAmount);
    }
    @Test
    public void countAliveNeighboursTest(){
        Board board = new Board(5);
        board.getBoard()[2][2] = new Cell(Life.ALIVE);
        board.getBoard()[3][3] = new Cell(Life.ALIVE);
        board.getBoard()[1][1] = new Cell(Life.ALIVE);
        board.getBoard()[2][1] = new Cell(Life.ALIVE);
        board.getBoard()[1][2] = new Cell(Life.ALIVE);
        Assert.assertEquals(4, board.countAliveNeighbours(2,2));
        Assert.assertEquals(1, board.countAliveNeighbours(0,0));
        Assert.assertEquals(3, board.countAliveNeighbours(2,1));
    }
}
