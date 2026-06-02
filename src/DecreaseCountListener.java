/**
* Lead Author(s): Samuel Bilby
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
* Version: 2026-06-01
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

/**
 * DecreaseCountListener is-a action listener which updates the count of the item it uses and updates the label its attached to
 */
public class DecreaseCountListener implements ActionListener
{
	//a DecreaseCountListener has-a label to show the count information
	private JLabel label;
	
	//a DecreaseCountListener has-a item that it decreases the count of
	private MenuItem item;
	
	//constructor which initializes the DecreaseCountListener, sets the parameters to be instance variables 
	public DecreaseCountListener(JLabel newCountLabel, MenuItem menuItem) 
	{
		this.label = newCountLabel;
		this.item = menuItem;
	}
	 
	//when the button this listener is attached to is used if the items count is not 0 decreases the count by 1 and updates the label text to have the items current count and price
	public void actionPerformed(ActionEvent e) 
	{
		if (item.getCount() != 0) 
		{
			item.decreaseCount();
		}
		label.setText(item.getCount() + "x" + " " + (item.getPrice() * item.getCount()));
		
	}

}
