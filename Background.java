import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Creates the color of the background of the background. Will always be gray.
 * 
 * @author Joseph Deahr
 * @version 10/17/2014
 */
public class Background
{
    private int length; //the length of background
    private int width;  //the width of background

    /**
     * Constructs the background object
     * @param
     * Length - the length of the object
     * Width - the width of the object
     */
    public Background(int Length, int Width)
    {
        length = Length;
        width = Width;
    }

    /**
     * Method to make the background object.
     *
     */
    public void draw(Graphics2D g2)
    {
        Rectangle bg = new Rectangle(0, 0, length, width);
        
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(bg);
    }

}
