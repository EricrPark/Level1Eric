import java.awt.Component;
import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;
 
public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
 
// 1. Create a frame & make it visible
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(2000, 1000);
		// 2. Add the panel to the frame
		frame.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
		panel.setBackgroundImage(galapagosIslands);
		for (int i=0; i<50000; i++) {
		// 4. Instantiate a Turtle 
			Turtle earlWarren = new Turtle();
	    // 5. Add the turtle to the panel
	        panel.addTurtle(earlWarren);
	        int randX = new Random().nextInt(panel.getWidth());
	        int randY = new Random().nextInt(panel.getHeight());
	        earlWarren.setX(randX);
	        earlWarren.setY(randY);
		}
		// 6. Put 50 Turtles on the beach
	}
}
