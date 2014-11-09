import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Creates a string that will display the various amounts of the coin.
 * 
 * @author Joseph Deahr
 * @version 10/17/2014
 */
public class TravelcoinAmount
{
    private int xLeft;      //the x-coordinate of the string
    private int yTop;       //the y-coordinate of the string
    private String title;   //the string which will be displayed

    /**
     * Constructs the background object
     * @param
     * x the x-coordinate of the top-left corner
     * y the y-coordinate of the top-left corner
     * title the string which will be displayed
     */
    public TravelcoinAmount(String title, int x, int y)
    {
        xLeft = x;
        yTop = y;
        title = title;
    }

    /**
     * Method to make a travelcoin amount string
     *
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.BLACK);
        g2.drawString(title, xLeft, yTop);        
    }
}
