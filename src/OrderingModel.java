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
* https://www.geeksforgeeks.org/java/java-current-date-time/ 
*^LocalDate
*
* Version: 2026-04-01
*/

/**
 * OrderingModel is the model of the GUI which deals with all its data
 */

import java.time.LocalDate;

public class OrderingModel
{
	//An orderingModel has a current order it is modifying
	private Order currentOrder;
	
	//returns the current order the model is using
	public Order getOrder() 
	{
		return this.currentOrder;
	}
	
	public OrderingModel() 
	{
		Order firstOrder = new Order();
		this.currentOrder = firstOrder;
	}

	//replaces the current list of items in the order with an empty order
	public void removeOrder() 
	{
		for (int index = 0; index < currentOrder.getOrderList().size(); index++) 
		{
			currentOrder.getOrderList().get(index).resetCount();
		}
		
		Order emptyOrder = new Order();
		this.currentOrder = emptyOrder;
	}
	
	//method used when the buttons used for ordering items are clicked to add the item to the order or increase its count
	public void itemOrdered(MenuItem item) 
	{
		//if the item isn't in the order list then adds the item to the list
		if (this.currentOrder.findItem(item) == -1) 
		{
			currentOrder.getOrderList().add(item);
			
			//gets the currentOrder's list and gets the equivalent item from the list and increases its count by 1
			int itemIndex = currentOrder.findItem(item);
			currentOrder.getOrderList().get(itemIndex).increaseCount();
		}
		else 
		{
			//gets the currentOrder's list and gets the equivalent item from the list and increases its count by 1
			int itemIndex = currentOrder.findItem(item);
			currentOrder.getOrderList().get(itemIndex).increaseCount();
		}
	}
	
	//method for creating a string record of the current order
	public String recordOrder(Order order) 
	{
		String record = "";
		
		//adds current date to the string
		LocalDate date = LocalDate.now();
		record += date;
		
		record += ".";
		
		//adds the total number of items to the string
		record += order.getTotalCount();
		
		//cycles through the objects in the order and adds their count and ID to the order
		for (int index = 0; index < order.getOrderList().size(); index++) 
		{
			if (order.getOrderList().get(index) != null) 
			{
				//creates a string which the record shouldn't have multiple copies of and assigns it to stringCheck
				String stringCheck = order.getOrderList().get(index).getCount() + "." + order.getOrderList().get(index).getID();
				
				//only adds the count and ID if they are not already added
				if (record.contains(stringCheck) == false) 
				{
					record += ".";
					record += order.getOrderList().get(index).getCount();
					record += ".";
					record += order.getOrderList().get(index).getID();
				}
			}
		}
		
		return record + "\n";
	}
	
}
