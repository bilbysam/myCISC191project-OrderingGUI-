import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

/**
* Lead Author(s):
* @author samwi; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: 2026-05-31
*/


public class DecreaseCountListener implements ActionListener
{
	//a DecreaseCountListener has-a label to alter the count information of
	private JLabel label;
	
	//a DecreaseCountListener has-a item that it decreases the count of
	private MenuItem item;
	
	 
	 public DecreaseCountListener(JLabel countLabel, MenuItem menuItem) 
	 {
		 this.label = countLabel;
		 this.item = menuItem;
	 }
	 
	 public void actionPerformed(ActionEvent e) 
	 {
		 if (item.getCount() != 0) 
		 {
			 //run something to delete the panel?
			 item.decreaseCount();
		 }
		 label.setText(item.getCount() + "x" + " " + (item.getPrice() * item.getCount()));
	 }

}
