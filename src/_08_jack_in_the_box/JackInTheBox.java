package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {
	JButton BoxButton1 = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int clicks = 0;
	
	public void run() {
		BoxButton1.setText("Surprise");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(BoxButton1);
		frame.pack();
		frame.setVisible(true);
		BoxButton1.addActionListener(this);
		
		//if (true == false) {
		//	showPicture("jackInTheBox.png");
		//}
		
	}

private void showPicture(String fileName) { 
     try {
          JLabel imageLabel = createLabelImage(fileName);
          JFrame frame2 = new JFrame();
          frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame2.add(imageLabel);
          frame2.setVisible(true);
          frame2.pack();
     } catch (Exception e) {
          e.printStackTrace();
     }
}

private JLabel createLabelImage(String fileName) {
     try {
          java.net.URL imageURL = getClass().getResource(fileName);
          if (imageURL == null) {
               System.err.println("Could not find image " + fileName);
               return new JLabel();
          } else {
               Icon icon = new ImageIcon(imageURL);
               JLabel imageLabel = new JLabel(icon);
               //System.out.println("this isnt working");
               return imageLabel;
          }
     } catch (Exception e) {
          System.err.println("Could not find image " + fileName);
          return new JLabel();
     }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//JButton buttonPressed = (JButton) e.getSource();
	System.out.println(clicks);
	if (clicks < 5){
	clicks = clicks + 1;
}
	else {
		showPicture("jackInTheBox.png");
	}
}
}
