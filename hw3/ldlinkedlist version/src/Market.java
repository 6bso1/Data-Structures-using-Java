/**
 * This class contains data about Markets, with the extension of Building superclass
 */
public class Market extends Building{
    private int openHour;
    private int closeHour;


    public Market(int position, int length, int height, String owner, int openHour, int closeHour){
        super(position, length, height, owner);
        this.openHour = openHour;
        this.closeHour = closeHour;
    }
/**
 * This returns the opening hour of the market
 * @return
 */
    public int getOpenHour() {
        return this.openHour;
    }
/**
 * This sets the opening hour of the market
 * @param openHour
 */
    public void setOpenHour(int openHour) {
        this.openHour = openHour;
    }
/**
 * This returns the closing hour of the market
 * @return
 */
    public int getCloseHour() {
        return this.closeHour;
    }
/**
 * This sets the closing hour of the market
 * @param closeHour
 */
    public void setCloseHour(int closeHour) {
        this.closeHour = closeHour;
    }
    
}
