import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Creates the progress bar for how much of the block chain has been downloaded. 
 * It will always be located at the bottom of the window.
 * 
 * @author Joseph Deahr
 * @version 10/19/2014
 */
public class Progress
{
    private int xLeft; //the x-coordinate of progressbar
    private int yTop;  //the y-coordinate of progressbar
    private int length; //the length of progressbar
    private int width; //the width of progressbar

    /**
     * Constructs a progress bar object
     * @param
     * x the x-coordinate of the top-left corner
     * y the y-coordinate of the top-left corner
     * l the length of the object
     * w the width of the object
     */
    public Progress(int x, int y, int l, int w)
    {
        xLeft = x;
        yTop = y;
        length = l;
        width = w;
    }

    /**
     * Method to make the background object.
     *
     */
    public void draw(Graphics2D g2)
    {
        Rectangle progressBar = new Rectangle(xLeft, yTop, length, width);
        
        
        g2.setColor(Color.GREEN);
        g2.fill(progressBar);
    }

}






//If somebody decides to look at my code, they may just find a few easter eggs here and
//there. Enjoy the search!