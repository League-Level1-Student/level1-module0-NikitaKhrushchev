package _07_fortune_cookie;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class FortuneCookie implements ActionListener {
	String[] fortunes = {"f","d","c","b","a"};
	public static void main(String[] args) {
		
		//System.out.println("");
	}
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	//	JOptionPane.showMessageDialog(null, "woohoo");
		int rand = new Random().nextInt(5);
		String fortune = "You will get an " + fortunes[rand] + "on your next test";
		JOptionPane.showMessageDialog(null, fortune);
	}
}
