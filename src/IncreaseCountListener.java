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
 * IncreaseCountListener is-a action listener which updates the count of the item it uses and updates the label its attached to
 */
public class IncreaseCountListener implements ActionListener
{	
	//a IncreaseCountListener has-a label to show the count information
	private JLabel label;
	
	//a IncreaseCountListener has-a item that it updates the count of
	private MenuItem item;
		
	//constructor which initializes the IncreaseCountListener, sets the parameters to be instance variables 
	public IncreaseCountListener(JLabel countLabel, MenuItem menuItem) 
	{
		this.label = countLabel;
		this.item = menuItem;
	}
		 
	//when the button this listener is attached to is used increases the count by 1 and updates the label text to have the items current count and price
	public void actionPerformed(ActionEvent e)
	{
		if (item.getCount() != 99) 
		{
			item.increaseCount();
			label.setText(item.getCount() + "x" + " " + (item.getPrice() * item.getCount()));
		}
	}

}
