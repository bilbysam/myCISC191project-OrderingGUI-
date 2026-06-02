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

//Potato Soup is-a soup
public class PotatoSoup extends MenuItem
{
	//Potato Soup has-a price
	private double price = 5.99;

	//Potato Soup has-a name
	private String name = "Potato Soup";
	
	//Potato Soup has-a number count representing the amount of it being ordered
	private int count = 0;
	
	//returns the objects price
	@Override
	public double getPrice()
	{
		return this.price;
	}

	//returns the objects name
	@Override
	public String getItemName()
	{
		return this.name;
	}

	//return the objects count of the number of the item being ordered
	@Override
	public int getCount()
	{
		return this.count;
	}

	//increases the objects count by 1
	@Override
	public void increaseCount()
	{
		this.count++;

	}

	//decreases the objects count by 1
	@Override
	public void decreaseCount()
	{
		this.count--;

	}

	//sets the objects count to 0
	@Override
	public void resetCount()
	{
		this.count = 0;
		
	}

	

}
