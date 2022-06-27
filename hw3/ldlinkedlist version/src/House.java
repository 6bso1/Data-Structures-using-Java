/**
 * This class contains data about Houses, with the extension of Building superclass
 */
public class House extends Building{
    private int roomNum;
    private String color;


    public House(int position, int length, int height, String owner, int roomNum,  String color){
        super(position, length, height, owner);
        this.roomNum = roomNum;
        this.color = color;
    }
/**
 * This returns the number of rooms of the current House
 * @return
 */
    public int getRoomNum() {
        return this.roomNum;
    }
/**
 * Thşs sets the number of rooms of the current House
 * @param roomNum
 */
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
/**
 * This returns the color of the current House
 * @return
 */
    public String getColor() {
        return this.color;
    }
/**
 * This sets the color of the current House
 * @param color
 */
    public void setColor(String color) {
        this.color = color;
    }
    
}
