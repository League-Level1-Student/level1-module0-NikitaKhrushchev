package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectMachine implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	//JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public void run(){
	//	label.setText("Sound Effect");
		button1.setText("Sawing Wood");
		button2.setText("Cymbal");
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.addMouseListener(this);
		button2.addMouseListener(this);
	//	panel.add(label);
		frame.pack();
		frame.setTitle("Sound Effect Machine");
		frame.setVisible(true);
	}
	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) e.getSource();
		if (clicked == button1) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		else {
			playSound("cymbal.wav");
	}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
