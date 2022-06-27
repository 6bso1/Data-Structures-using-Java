/**
 * This class contains data about Playgrounds
 */
public class Playground {
    private int position;
    private int length;


    public Playground(int position, int length){
        this.length = length;
        this.position = position;
    }
/**
 * This returns the position of the current playground
 * @return
 */
    public int getPosition() {
        return this.position;
    }
/**
 * This sets the position of the current playground
 * @param position position
 */
    public void setPosition(int position) {
        this.position = position;
    }
/**
 * This returns the length of the current playground
 * @return
 */
    public int getLength() {
        return this.length;
    }
/**
 * This sets the length of the current playground
 * @param length
 */
    public void setLength(int length) {
        this.length = length;
    }
    
}
