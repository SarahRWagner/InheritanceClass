
/**
 * @author Sarah Wagner
 * @version 1.0
 * This is the driver class to test out inheritance and polymorphism with my Art
 * classes.
 */
public class Main {

    public static void main(String[] args) {


        //This is an example of inheritance:

        Painting myPainting = new Painting(); // Create child object

        myPainting.setArtist("Sarah"); // Takes the object and calls method from Parent class



        //This is an example of polymorphism:

        Art myArt = new Art(); // Create parent object

        String artMsg = myArt.createArt(); // In the parent class it will print out "This is a piece of art!"


        GlassBlowing myGlass = new GlassBlowing(); // Create child object

        String glassMsg = myGlass.createArt(); // In the child class it will print out "This is a piece of glass art!

    }
}
