import org.junit.*;

public class CellTest {

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
