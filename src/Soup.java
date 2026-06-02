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

/**
 * Soup is-a MenuItem
 */
public abstract class Soup extends MenuItem
{

	@Override
	abstract public double getPrice();
	
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
