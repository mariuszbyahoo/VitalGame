public class Cell {
    private boolean alive;

    public Cell (boolean alive){
        setAlive(alive);
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }
}
