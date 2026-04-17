
/*
 * Author: Samuel Bilby
 * 
 * 
 * This class is meant to act as the parent class to all of the menu items in the GUI and has methods that they will all use
 */

public abstract class MenuItem
{
	//a menu item has-a price
	private double price;
	
	//a menu item has-a identification number
	private int identificationNumber;
	
	//a menu item has-a count for how many items were requested
	private int count = 0;
	
	//returns the price of the object
	public abstract double getPrice();
	
	//returns a integer signifying the specific items ID
	abstract public int getID();
	
	//returns a integer for the number of items requested in the order
	abstract public int getCount();
	
	//increases the count variable by 1
	abstract public void increaseCount();
	
	//decreases the count variable by 1
	abstract public void decreaseCount();
	

}
