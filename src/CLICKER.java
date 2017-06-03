import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CLICKER implements ActionListener {
	public CLICKER() {
		JFrame fortuneCookie = new JFrame();
		fortuneCookie.setVisible(true);
		JButton button = new JButton();
		fortuneCookie.setBackground(Color.RED);
		fortuneCookie.add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Let's get your fortune");
		int rand = new Random().nextInt(4);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You are going to be cursed to life at Earl Warren");
		}
		else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will live happily ever after and go to Harvard away EW");
		}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will die when you are 72 from choking on ater while laughing");
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will stub your toe shortly after reading this");
		}
	}
}

