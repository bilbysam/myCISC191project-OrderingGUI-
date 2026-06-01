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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

/**
 * Purpose: The reponsibility of IncreaseCountListener is ...
 *
 * IncreaseCountListener is-a ...
 * IncreaseCountListener is ...
 */
public class IncreaseCountUpdateListener implements ActionListener
{	
	//a IncreaseCountListener has-a label to alter the count information of
	private JLabel label;
	
	//a IncreaseCountListener has-a item that it updates the count of
	private MenuItem item;
		
		 
	 public IncreaseCountUpdateListener(JLabel countLabel, MenuItem menuItem) 
	 {
		 this.label = countLabel;
		 this.item = menuItem;
	 }
		 
	@Override
	public void actionPerformed(ActionEvent e)
	{
		item.increaseCount();
		label.setText(item.getCount() + "x" + " " + (item.getPrice() * item.getCount()));

	}

}
