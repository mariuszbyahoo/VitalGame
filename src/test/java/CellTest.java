import org.junit.*;

public class CellTest {

    @Test
    public void changeStatusTest_OneNeighbour_CellDies(){
        Cell cell = new Cell(Life.ALIVE);
        cell.changeStatus(1);
        Assert.assertEquals(Life.DEAD, cell.getStatus());
    }

    @Test
    public void changeStatusTest_TwoNeighbours_CellAlive(){
        Cell cell = new Cell(Life.ALIVE);
        cell.changeStatus(2);
        Assert.assertEquals(Life.ALIVE, cell.getStatus());
    }

    @Test
    public void changeStatusTest_ThreeNeighbours_CellAlive() {
        Cell cell = new Cell(Life.ALIVE);
        cell.changeStatus(3);
        Assert.assertEquals(Life.ALIVE, cell.getStatus());
    }

    @Test
    public void changeStatusTest_FourNeighbours_CellDies(){
        Cell cell = new Cell(Life.ALIVE);
        cell.changeStatus(4);
        Assert.assertEquals(Life.DEAD, cell.getStatus());
    }
    @Test
    public void setStatusTest_LivingCell_CellDies(){
        Cell cell = new Cell(Life.ALIVE);
        cell.setStatus(Life.DEAD);
        Assert.assertEquals(Life.DEAD, cell.getStatus());
    }

    @Test
    public void getStatus_DeadCell_ReturnsDEAD(){
        Cell cell = new Cell(Life.DEAD);
        Life status = cell.getStatus();
        Assert.assertEquals(Life.DEAD, status);
    }
}
