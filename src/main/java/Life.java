/**
 * Shows the actual status of the specific cell
 */
public enum Life {
    ALIVE ("O"),
    DEAD(" ");
    String desc;
    Life(String desc) {
        this.desc = desc;
    }
}
