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
* Version: 2026-04-01
*/

/**
 * OrderingModel is the model of the GUI which deals with all its data
 */
public class OrderingModel
{
	//An orderingModel has a current order it is modifying
	private Order currentOrder;
	
	public OrderingModel() 
	{
		Order firstOrder = new Order();
		this.currentOrder = firstOrder;
	}

	//replaces the current list of items in the order with an empty order
	public void removeOrder() 
	{
		Order emptyOrder = new Order();
		this.currentOrder = emptyOrder;
	}
	
	//method used when buttons for ordering items are picked
	public void itemOrdered(MenuItem item) 
	{
		//if the item isn't in the order list then adds the item to the list
		if (this.currentOrder.findItem(item) == -1) 
		{
			currentOrder.getOrderList().add(item);
		}
		else 
		{
			//gets the currentOrder's list and gets the equivalent item from the list and increases its count by 1
			int itemIndex = currentOrder.findItem(item);
			currentOrder.getOrderList().get(itemIndex).increaseCount();
		}
	}
	
	
	
}
