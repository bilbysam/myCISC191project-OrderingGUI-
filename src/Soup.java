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
 * Purpose: The reponsibility of Soup is ...
 *
 * Soup is-a ...
 * Soup is ...
 */
public abstract class Soup extends MenuItem
{

	@Override
	abstract public double getPrice();

	@Override
	abstract public String getID();
	
	@Override
	abstract public int getCount();
	
	@Override
	abstract public void increaseCount();	

	@Override
	abstract public void decreaseCount();
	
	@Override
	abstract public String getItemName();
	
	@Override
	abstract public void resetCount();

}
