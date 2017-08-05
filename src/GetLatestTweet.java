import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	JTextField text = new JTextField(14);
	JTextPane twit = new JTextPane();
	JScrollPane scroll = new JScrollPane(twit);
	JPanel panel2 = new JPanel();
	public static void main(String[] args) {
		GetLatestTweet search = new GetLatestTweet();
	}
	GetLatestTweet() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Search the twitterverse");
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(button);
		panel.add(text);
		button.addActionListener(this);
		frame.add(panel2, BorderLayout.SOUTH);
		panel2.add(scroll);
		twit.setPreferredSize(new Dimension(365, 365));
		twit.setEditable(false);
		twit.setBackground(new Color(20, 255, 90));
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("tweet tweet");
		twit.setText(getLatestTweet(text.getText()));
	}
	private String getLatestTweet(String searchingFor) {
		String s = "";
		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			for (int i = 0; i < 15; i++) {
				s += "("+(i+1)+")\n"+result.getTweets().get(i).getText()+"\n \n";
			}
			return s;
		} catch (Exception e) {
			System.err.print(e.getMessage());
			//return "What the heck is that?";
			return s;
		}
	}

}
