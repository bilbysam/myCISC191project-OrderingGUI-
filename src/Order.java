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


public class Order
{
	//An Order has-many MenuItems
	private ArrayList<MenuItem> orderItemList;
	
	private int totalCount = 0;
	
	private double totalPrice = 0;

	//constructor 
	public Order() 
	{
		
	}

	public ArrayList<MenuItem> getOrderList()
	{
		return this.orderItemList;
	}
	
	//returns the combined count values for every item in the order
	public int getTotalCount()
	{
		for (int index = 0; index < orderItemList.size(); index++) 
		{
			this.totalCount += orderItemList.get(index).getCount();
		}
		return this.totalCount;
	}
	
	//returns the combined price values for every item in the order
	public double getTotalPrice() 
	{
		for (int index = 0; index < orderItemList.size(); index++) 
		{
			this.totalPrice += orderItemList.get(index).getPrice();
		}
		return this.totalPrice;
	}
	
	//returns a string with information regarding the items ordered
	public String toString()
	{
		return "";
		
	}
	
	//if the order has an item in it / find the item in the order and return its location else return -1/ then whatever method called this can modify count or anything else
	public int findItem(MenuItem item) 
	{
		if (this.orderItemList.contains(item)) 
		{
			return orderItemList.indexOf(item);
		}
		else 
		{
			return -1;
		}
	}
	
}
