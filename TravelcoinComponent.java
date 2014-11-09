import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Draws the images and appearances of a the Travelcoin-qt.
 * 
 * @author Joseph Deahr
 * @version 10/17/2014
 */
public class TravelcoinComponent extends JComponent
{
    /**
     * Draws the individual images.
     * 
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //starting window size is 500x500
        int x = getWidth();
        int y = getHeight();
        
        Background bg = new Background(x, y);
        TravelcoinAmount balance = new TravelcoinAmount("Balance: ", 15, 300);
        Logo logo1 = new Logo(200, 200, x/5, x/5);
        Progress progress = new Progress(500, 125, x-150, 25);
        
        bg.draw(g2);
        //balance.draw(g2);
        //g2.drawString("Balance: ", 300, 300);
        //logo1.draw(g2);
        progress.draw(g2);
     
    }
}
