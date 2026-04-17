/**
* Lead Author(s): Samuel Bilby
* 
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

import java.util.ArrayList;

/**
 * Purpose: The responsibility of Order is ...
 *
 * Order is-a ...
 * Order is ...
 */
public class Order
{
	//An Order has-many MenuItems
	private ArrayList<MenuItem> order;
	
	private int totalCount = 0;
	
	private double totalPrice = 0;

	//constructor 
	public Order() 
	{
		
	}

	//returns the combined count values for every item in the order
	public int getTotalCount()
	{
		for (int index = 0; index < order.size(); index++) 
		{
			this.totalCount += order.get(index).getCount();
		}
		return this.totalCount;
	}
	
	//returns the combined price values for every item in the order
	public double getTotalPrice() 
	{
		for (int index = 0; index < order.size(); index++) 
		{
			this.totalPrice += order.get(index).getPrice();
		}
		return this.totalPrice;
	}
	
	//returns a string with information regarding the items ordered
	public String toString()
	{
		return "";
		
	}
}
