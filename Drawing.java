/**
 * @author Sarah Wagner
 * @version 1.0
 * This is a class file that will extend the Art class. Drawing has all the values Art does. It has an
 * artist, a time period, a size, and an aesthetic. However, there is more to drawing. It has a type
 *   of drawing tool and the paper it is drawn on has a certain weight.*/
public class Drawing extends Art{

    //Drawing has all the values that art does, but these variables are the extra bits
    private String drawingTool; // All drawings has-a drawing tool. Charcoal, pencil, pen etc.
    private String paperWeight; // All drawing has-a paper weight. Newsprint, bristol board, cardboard etc.

    /**
     * This is the customizable Drawing object.
     * @param drawingTool
     * @param paperWeight
     */
    public Drawing(String drawingTool, String paperWeight) {
        setDrawingTool(drawingTool);
        setPaperWeight(paperWeight);
    }

    /**
     * This is the default Drawing object.
     */
    public Drawing() {
        this.drawingTool = "Charcoal";
        this.paperWeight = "Sketch Paper";
    }

    /**
     * This will print out what is in the object.
     * @return
     */
    @Override
    public String toString() {
        return "Drawing{" +
                "drawingTool='" + drawingTool + '\'' +
                ", paperWeight=" + paperWeight +
                '}';
    }

    /**
     * This gets the drawing tool and returns it to the user.
     * @return
     */
    public String getDrawingTool() {
        return drawingTool;
    }

    /**
     * This sets the drawing tool to whatever the user inputs.
     * @param drawingTool
     */
    public void setDrawingTool(String drawingTool) {
        this.drawingTool = drawingTool;
    }

    /**
     * This gets the paper weight and returns it to the user.
     * @return
     */
    public String getPaperWeight() {
        return paperWeight;
    }

    /**
     * This sets the weight of the paper to whatever the user inputs.
     * @param paperWeight
     */
    public void setPaperWeight(String paperWeight) {
        this.paperWeight = paperWeight;
    }


}
