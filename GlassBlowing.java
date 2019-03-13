/**
 * @author Sarah Wagner
 * @version 1.0
 * This is a class file that will extend the Art class. Glassblowing has all the values Art does. It has an
 * artist, a time period, a size, and an aesthetic. However, there is more to glassblowing. It has a  
 * furnace that needs to be on/off, a temperature for the glass, and a temperature for the furnace. */
public class GlassBlowing extends Art {

    //Glass blowing has all the values that art does, but these variables are the extra bits
    private boolean furnace; // All glass blowing has a furnace that's off or on
    private int hotGlassTemp; // All glass blowing has a temperature of the hot glass you're working with
    private double furnaceTemp; // All glass blowing has a temperature the furnace needs to be at

    /**
     * This is the customizable constructor for GlassBlowing
     * @param furnace
     * @param hotGlassTemp
     * @param furnaceTemp
     */
    public GlassBlowing( boolean furnace, int hotGlassTemp, double furnaceTemp) {
        setFurnace(furnace);
        setHotGlassTemp(hotGlassTemp);
        setFurnaceTemp(furnaceTemp);
    }

    /**
     * This is the default constructor for GlassBlowing
     */
    public GlassBlowing() {
        this.furnace = false;
        this.hotGlassTemp = 0;
        this.furnaceTemp = 0;
    }

    /**
     * This is the print statement for the object.
     * @return
     */
    @Override
    public String toString() {
        return "GlassBlowing{" +
                "furnace=" + furnace +
                ", hotGlassTemp=" + hotGlassTemp +
                ", furnaceTemp=" + furnaceTemp +
                '}';
    }

    /**
     * This checks if the furnace is on or off. On = true, off = false.
     * @return
     */
    public boolean isFurnace() {
        return furnace;
    }

    /**
     * This sets furnace to on or off.
     * @param furnace
     */
    public void setFurnace(boolean furnace) {
        this.furnace = furnace;
    }

    /**
     * This gets the temperature the hot glass is at currently.
     * @return
     */
    public int getHotGlassTemp() {
        return hotGlassTemp;
    }

    /**
     * This sets the temperature of the hot glass.
     * @param hotGlassTemp
     */
    public void setHotGlassTemp(int hotGlassTemp) {
        this.hotGlassTemp = hotGlassTemp;
    }

    /**
     * This gets the temperature of the furnace.
     * @return
     */
    public double getFurnaceTemp() {
        return furnaceTemp;
    }

    /**
     * This sets the temperature of the furnace.
     * @param furnaceTemp
     */
    public void setFurnaceTemp(double furnaceTemp) {
        this.furnaceTemp = furnaceTemp;
    }

    public String createArt(){
        return "This is a piece of glass art!";
    }



}