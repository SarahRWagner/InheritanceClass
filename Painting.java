/**
 * @author Sarah Wagner
 * @version 1.0
 * This is a class file that will extend the Art class. Painting has all the values Art does. It has an
 * artist, a time period, a size, and an aesthetic. However, there is more to painting. It has a type
 * of paint and a type of brush.*/
public class Painting extends Art {

    //Painting has all the values that art does, but these variables are the extra bits
    private String typeOfPaint; // All paintings has-a type of paint. Oil, acrylic, watercolor, etc.
    private String brushType; // All paintings has-a type of brush.

    /**
     * This is the customizable Painting constructor.
     * @param typeOfPaint
     * @param brushType
     */
    public Painting(String typeOfPaint, String brushType) {
        setTypeOfPaint(typeOfPaint);
        setBrushType(brushType);
    }

    /**
     * This is the default Painting constructor.
     */
    public Painting() {
        this.typeOfPaint = "Oil";
        this.brushType = "Hog Hair";
    }

    /**
     * This gets the type of paint and returns it.
     * @return
     */
    public String getTypeOfPaint() {
        return typeOfPaint;
    }

    /**
     * This sets the type of paint to whatever the user inputs.
     * @param typeOfPaint
     */
    public void setTypeOfPaint(String typeOfPaint) {
        this.typeOfPaint = typeOfPaint;
    }

    /**
     * This gets the type of brush and returns it.
     * @return
     */
    public String getBrushType() {
        return brushType;
    }

    /**
     * This sets the brush type to whatever the user inputs.
     * @param brushType
     */
    public void setBrushType(String brushType) {
        this.brushType = brushType;
    }

    /**
     * This prints out what the Painting object is made up of.
     * @return
     */
    @Override
    public String toString() {
        return "Painting{" +
                "typeOfPaint='" + typeOfPaint + '\'' +
                ", brushType='" + brushType + '\'' +
                '}';
    }






}
