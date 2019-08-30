package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String comp = "https://www.aoc.gov/sites/default/files/images/buildings/6080137063_3e6c91ee8b_o.jpg";
		String comp2 = "https://amp.businessinsider.com/images/576b0ffd52bcd0320c8cafec-750-500.jpg";
		
		// 2. create a variable of type "Component" that will hold your image
		Component co;
		// 3. use the "createImage()" method below to initialize your Component
		co= createImage(comp);
		// 4. add the image to the quiz window
		quizWindow.add(co);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		quizWindow.setVisible(true);
		String answer = JOptionPane.showInputDialog("Who has the senate majority at this time?");
		if (answer.toLowerCase().equals("republicans") == true) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		quizWindow.remove(co);
		Component co2 = createImage(comp2);
		quizWindow.add(co2);
		quizWindow.pack();
		String answer2 = JOptionPane.showInputDialog("How many Supreme Court Justices are there?(Currently)");
		if (answer2.equals("9") == true) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		
		}
		quizWindow.remove(co2);
		quizWindow.setVisible(false);
		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
