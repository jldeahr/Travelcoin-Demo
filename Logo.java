import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Creates the logo that will display on the main page.
 * 
 * @author Joseph Deahr
 * @version 10/17/2014
 */
public class Logo
{
    private int xLeft;      //the x-coordinate of the logo
    private int yTop;       //the y-coordinate of the logo
    private int width;      //the width of the logo
    private int height;     //the height of the logo

    /**
     * Constructs the logo object
     * @param
     * x the x-coordinate of the top-left corner
     * y the y-coordinate of the top-left corner
     */
    public Logo(int x, int y, int w, int h)
    {
        xLeft = x;
        yTop = y;  
        height = h;
        width = w;
    }

    /**
     * Method to make the logo object
     *
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double outer = new Ellipse2D.Double(xLeft, yTop, height, width);
        Rectangle upper = new Rectangle(xLeft, yTop, height/20, width/20);
        Rectangle lower = new Rectangle(xLeft+15, yTop+15, height-(height/3), width);
        
        g2.setColor(Color.YELLOW);
        g2.fill(outer);
        g2.setColor(Color.CYAN);
        g2.fill(upper);
        g2.fill(lower);
             
    }
}
