/**
 * Class representing a Cell, witch may be alive, or dead
 */
public class Cell {
    private Life status;

    public Cell (Life status){
        setStatus(status);
    }

    /**
     * Changes the cell's status
     * @param status
     */
    public void setStatus(Life status) {
        this.status = status;
    }

    /**
     * returns the cell's status
     * @return
     */
    public Life getStatus() {
        return status;
    }
}
