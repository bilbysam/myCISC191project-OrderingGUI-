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
* Version: 2026-04-28
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Purpose: The reponsibility of MenuItemButtonListener is ...
 *
 * MenuItemButtonListener is-a ...
 * MenuItemButtonListener is ...
 */
public class MenuItemButtonListener implements ActionListener
{
	//A menuItemButtonListener has-a item that it can add to the order
	private MenuItem item;
	
	//A menuItemButtonListener has-a model for methods
	private OrderingModel model;
	
	//A menuItemButtonListener has-a view where the button is located
	private OrderingInterface view;
	
	
	//constructor which initializes 
	public MenuItemButtonListener(MenuItem menuItem, OrderingModel orderingModel, OrderingInterface orderingInterface) 
	{
		this.item = menuItem;
		this.model = orderingModel;
		this.view = orderingInterface;
	}
	
	//when the button is pressed update the UI and add the item to the order if it hasn't been added and increase the items count value by 1
	@Override
	public void actionPerformed(ActionEvent e)
	{
		model.itemOrdered(item);
		//do an update in the UI if it hasn't already
	}

}
