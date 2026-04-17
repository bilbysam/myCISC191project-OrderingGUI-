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
 * Purpose: The responsibility of Receipt is to organize information so it can be sent to a receipt file
 */
public class Receipt
{
	private Order order;
	
	//constructor which
	public Receipt(Order orderInstance) 
	{
		this.order = orderInstance;
		
	}
	
	//returns a string giving all of the information necessary the receipt
	public String toString() 
	{
		return "";
	}

}
