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
* Version: 2026-06-01
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//RetrieveOrderListener is-a action listener 
public class RetrieveOrderListener implements ActionListener
{
	OrderingModel model;

	public RetrieveOrderListener(OrderingModel orderingModel) 
	{
		this.model = orderingModel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		model.retreiveLastOrder();
	}

}
