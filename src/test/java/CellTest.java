import org.junit.*;

public class CellTest {

    @Test
    public void changeStatusOneNeighbourTest(){
        Cell cell = new Cell(Life.ALIVE);
        cell.changeStatus(1);
        Assert.assertEquals(Life.DEAD, cell.getStatus());
    }

    @Test
    public void changeStatusTwoNeighboursTest(){
        Cell cell = new Cell(Life.ALIVE);
        cell.changeStatus(2);
        Assert.assertEquals(Life.ALIVE, cell.getStatus());
    }

    @Test
    public void changeStatusThreeNeighboursTest() {
        Cell cell = new Cell(Life.ALIVE);
        cell.changeStatus(3);
        Assert.assertEquals(Life.ALIVE, cell.getStatus());
    }

    @Test
    public void changeStatusFourNeighboursTest(){
        Cell cell = new Cell(Life.ALIVE);
        cell.changeStatus(4);
        Assert.assertEquals(Life.DEAD, cell.getStatus());
    }
    @Test
    public void setStatusTest(){
        Cell cell = new Cell(Life.ALIVE);
        cell.setStatus(Life.DEAD);
        Assert.assertEquals(Life.DEAD, cell.getStatus());
    }

    @Test
    public void getStatusTest(){
        Cell cell = new Cell(Life.DEAD);
        Life status = cell.getStatus();
        Assert.assertEquals(Life.DEAD, status);
    }
}
