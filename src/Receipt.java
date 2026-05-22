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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
	
	//creates an array from the order
	public String[][] createRecieptArray(Order order) 
	{
		//creates a 2d array where every row is filled with an item name and the number of that item
		String[][] orderArray = new String[2][order.getOrderList().size()];
		
		for (int index = 0; index < order.getOrderList().size(); index++) 
		{
			orderArray[0][index] = order.getOrderList().get(index).getItemName();
			orderArray[1][index] = "" + order.getOrderList().get(index).getCount();
			
			while (orderArray[0][index].length() < 30) 
			{
				orderArray[0][index] += " ";
			}
		}
		
		return orderArray;
	}
	
	
	//creates a file with a receipt for the order
	public void createReceiptFile(String[][] array) 
	{
		File receiptFile = new File("Receipt");
		PrintWriter writer =  null;
		
		try
		{
			writer = new PrintWriter(receiptFile);
			String receiptString = "";
			
			for (int index = 0; index < array[0].length; index++) 
			{
				receiptString += array[0][index] + array[1][index] + "\n";
			}
			writer.print(receiptString);
		}
		catch (FileNotFoundException e)
		{
			
			System.out.println("Output error or couldn't find the file?");
			e.printStackTrace();
		}
		finally 
		{
			if (writer != null) 
			{
				writer.close();
			}
		}
		
	}
	
	//maybe add an announcement for the exception
	
	
}
