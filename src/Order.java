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
* Version: 2026-06-01
*/

import java.util.ArrayList;


public class Order
{
	//An Order has-many MenuItems
	private ArrayList<MenuItem> orderItemList = new ArrayList<MenuItem>();
	

	//constructor initializes the object with no parameters so the list is array list of menu items is empty
	public Order() 
	{
		
	}

	//returns the current array list of menu items
	public ArrayList<MenuItem> getOrderList()
	{
		return this.orderItemList;
	}
	
	//returns the combined count values for every item in the order
	public int getTotalCount()
	{
		int totalCount = 0;
		
		for (int index = 0; index < orderItemList.size(); index++) 
		{
			totalCount += orderItemList.get(index).getCount();
		}
		return totalCount;
	}
	
	//returns an amount equivalent to the combined price values for every item in the order
	public double getTotalPrice() 
	{
		double totalPrice = 0;
		
		for (int index = 0; index < orderItemList.size(); index++) 
		{
			totalPrice += orderItemList.get(index).getPrice() * orderItemList.get(index).getCount();
		}
		return totalPrice;
	}
	
	
	
}
