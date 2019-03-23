import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    /**
     * checks is the getCellsArray() method really returning a new object.
     */
    @Test
    public void getBoardTest_TenSquaresBoard_ReturnsTrue(){
        //
        Board board = new Board(10);
        Assert.assertTrue(board instanceof Board);
    }

    /**
     * checks is the getCell() method really returning a specific cell
     */
    @Test
    public void getCellTest_IsCellFromBoardInstanceOfCellClass_ReturnsTrue(){
        Board board = new Board(10);
        Cell cell = board.getCell(1,1);
        Assert.assertTrue(cell instanceof Cell);
    }

    /**
     * checks is there any null value in the board
     */
    @Test
    public void initBoardTest_HasBoardAnyNullValue_ReturnsFalse(){
        boolean isNull = false;
        Board board = new Board(10);
        for (int i = 0; i < board.getCellsArray().length ; i ++){
            for (int j = 0; j < board.getCellsArray().length ; j ++){
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
    public void createColonyTest_AreFiveCellsAlive_ReturnsTrue(){
        boolean isAlive = false;
        int aliveCellsAmount = 0;
        Board board = new Board(10);
        board.createColony();
        for (int i = 0; i < board.getCellsArray().length ; i ++){
            for (int j = 0; j < board.getCellsArray().length ; j ++){
                if (board.getCell(i , j).getStatus() == Life.ALIVE){
                    isAlive = true;
                    aliveCellsAmount ++;
                }
            }
        }
        Assert.assertTrue(isAlive);
        Assert.assertEquals(12,aliveCellsAmount);
    }
    @Test
    public void countAliveNeighboursTest_IsCountingAlgorithmWorking_ReturnsTrue(){
        Board board = new Board(5);
        board.getCellsArray()[2][2] = new Cell(Life.ALIVE);
        board.getCellsArray()[3][3] = new Cell(Life.ALIVE);
        board.getCellsArray()[1][1] = new Cell(Life.ALIVE);
        board.getCellsArray()[2][1] = new Cell(Life.ALIVE);
        board.getCellsArray()[1][2] = new Cell(Life.ALIVE);
        Assert.assertEquals(4, board.countAliveNeighbours(2,2));
        Assert.assertEquals(1, board.countAliveNeighbours(0,0));
        Assert.assertEquals(3, board.countAliveNeighbours(2,1));
    }
}
