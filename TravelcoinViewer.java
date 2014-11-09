import javax.swing.JFrame;

/**
 * This class creates a new window to view the Travelcoin Demo in.
 * 
 * @author Joseph Deahr
 * @version 10/17/2014
 */
public class TravelcoinViewer
{
    /**
     * Builds the window for the demo.
     *
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(500, 500);
        frame.setTitle("Travelcoin Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TravelcoinComponent component = new TravelcoinComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
