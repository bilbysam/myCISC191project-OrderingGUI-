
/*
 * Author: Samuel Bilby
 * 
 * 
 * This class is meant to act as the parent class to all of the menu items in the GUI and has methods that they will all use
 */

public abstract class MenuItem
{
	//returns the price of the object
	public abstract double getPrice();
	
	//returns the name of the object
	abstract public String getItemName();
	
	//returns a integer for the number of items requested in the order
	abstract public int getCount();
	
	//resets the count value
	abstract public void resetCount(); 
	
	//increases the count variable by 1
	abstract public void increaseCount();
	
	//decreases the count variable by 1
	abstract public void decreaseCount();
	
}
