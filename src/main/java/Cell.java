public class Cell {
    private Life status;

    public Cell (Life status){
        setStatus(status);
    }

    public void setStatus(Life status) {
        this.status = status;
    }

    public Life getStatus() {
        return status;
    }
}
