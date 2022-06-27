/**
 * This is a super class which contains building data of Houses, Offices and Markets
 */
public class Building {
    private int position;
    private int length;
    private int height;
    private String owner;

    public Building(int position, int length, int height, String owner) {
        this.position = position;
        this.length = length;
        this.height = height;
        this.owner = owner;
    }
/**
 * This returns the position of the current Building
 * @return
 */
    public int getPosition() {
        return this.position;
    }
/**
 * This sets the position of the current building
 * @param position
 */
    public void setPosition(int position) {
        this.position = position;
    }
/**
 * This returns the length of the current building
 * @return
 */
    public int getLength() {
		return this.length;
	}
/**
 * This sets the length of the current building
 * @param length
 */
    public void setLength(int length) {
		this.length = length;
	}
/**
 * This returns the height of the current building
 * @return
 */
    public int getHeight() {
        return this.height;
    }
/**
 * This sets the height of the current building
 * @param height
 */
    public void setHeight(int height) {
        this.height = height;
    }
/**
 * This returns the owner of the current building
 * @return
 */
    public String getOwner() {
        return this.owner;
    }
/**
 * This sets the owner of the cuurent building
 * @param owner
 */
    public void setOwner(String owner) {
        this.owner = owner;
    }
}