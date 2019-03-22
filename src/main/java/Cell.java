/**
 * Class representing a Cell, witch may be alive, or dead, an amount of its neighbours and its position
 */
public class Cell {
    private Life status;
    private int i;
    private int j;
    private int neighboursAmount;

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

    /**
     * returns an amount of the cell's neighbours
     * @return
     */
    public int getNeighboursAmount() {
        return neighboursAmount;
    }

    /**
     * sets an amount of the cell's neighbours
     * @param neighboursAmount
     */
    public void setNeighboursAmount(int neighboursAmount) {
        this.neighboursAmount = neighboursAmount;
    }

    /**
     * returns the cell's "i" coordinate
     * @return
     */
    public int getI() {
        return i;
    }

    /**
     * sets the cell's "i" coordinate
     * @param i
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * returns the "j" coordinate
     * @return
     */
    public int getJ() {
        return j;
    }

    /**
     * sets the "j" coordinate
     * @param j
     */
    public void setJ(int j) {
        this.j = j;
    }
}
