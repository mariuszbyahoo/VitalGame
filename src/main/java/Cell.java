/**
 * Class representing a Cell, witch may be alive, or dead, an amount of its neighbours and its position
 */
public class Cell {
    private Life status;
    private int i;
    private int j;

    public Cell (Life status){
        setStatus(status);
    }

    /**
     * Changes the specific cell's status according to the amount of its neighbours
     * @param neighboursAmount
     */
    public void changeStatus(int neighboursAmount){
        switch (neighboursAmount){
            case 2:
                if (status == Life.ALIVE) {
                    status = Life.ALIVE;
                } else {
                    status = Life.DEAD;
                }
                break;
            case 3:
                status = Life.ALIVE;
                break;
            default:
                status = Life.DEAD;
                break;
        }
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
