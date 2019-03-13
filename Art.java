/**
 * @author Sarah Wagner
 * @version 1.0
 * This is a class file that will be extended to other classes. This is the "is-a" answer, so the other classes "is-a"
 * Art. All art has an artist, a time period, an aesthetic and a size. This class sets and gets all of the values to
 * the variables mentioned previously.
 */
public class Art
{
    protected String artist; // All art has-a(n) artist
    protected int timePeriod; // All art has-a time period it was made in
    protected String aesthetic; // All art has-a(n) aesthetic
    protected String size; // All art has-a size

    /**
     * This is the customizable Art constructor.
     * @param artist
     * @param timePeriod
     * @param aesthetic
     * @param size
     */
    public Art(String artist, int timePeriod, String aesthetic, String size) {
        setArtist(artist);
        setTimePeriod(timePeriod);
        setAesthetic(aesthetic);
        setSize(size);
    }

    /**
     * This is the default Art constructor.
     */
    public Art() {
        this.artist = "Michelangelo";
        this.timePeriod = 1510;
        this.aesthetic = "High Renaissance";
        this.size = "Enormous";
    }

    /**
     * This is the print statement for this object.
     * @return
     */
    @Override
    public String toString() {
        return "Art{" +
                "artist='" + artist + '\'' +
                ", timePeriod=" + timePeriod +
                ", aesthetic='" + aesthetic + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
    /**
     * This gets the name of the artist and returns it to the user.
     * @return
     */
    public String getArtist() {
        return artist;
    }
    /**
     * This gets the time period the work was created in and returns it to the user.
     * @return
     */
    public int getTimePeriod() {
        return timePeriod;
    }
    /**
     * This gets the aestehtic a piece is apart of and returns it to the user.
     * @return
     */
    public String getAesthetic() {
        return aesthetic;
    }
    /**
     * This gets the size of the piece, small, medium, large, etc., and returns it to the user.
     * @return
     */
    public String getSize() {
        return size;
    }

    /**
     * This sets the artist to the input of the user.
     * @param artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * This sets the time period to the input of the user.
     * @param timePeriod
     */
    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * This sets the aesthetic of the piece to the input of the user.
     * @param aesthetic
     */
    public void setAesthetic(String aesthetic) {
        this.aesthetic = aesthetic;
    }

    /**
     * This sets the size of the piece to the input of the user.
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    public String createArt(){
        return "This is a piece of art!";
    }


}