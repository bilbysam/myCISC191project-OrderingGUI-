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
* https://www.geeksforgeeks.org/java/java-current-date-time/ 
*^LocalDate
*https://phoenixnap.com/kb/string-to-integer-java
*^string to integer, parse int method
*
* Version: 2026-04-01
*/

/**
 * OrderingModel is the model of the GUI which deals with all its data
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrderingModel
{	
	//An orderingModel has a current order it is modifying
	private Order currentOrder;
	
	
	
	//returns the current order the model is using
	public Order getOrder() 
	{
		return this.currentOrder;
	}
	
	public OrderingModel() 
	{
		Order firstOrder = new Order();
		this.currentOrder = firstOrder;
	}

	//replaces the current list of items in the order with an empty order
	public void removeOrder() 
	{
		for (int index = 0; index < currentOrder.getOrderList().size(); index++) 
		{
			currentOrder.getOrderList().get(index).resetCount();
		}
		
		Order emptyOrder = new Order();
		this.currentOrder = emptyOrder;
	}
	
	//method used when the buttons used for ordering items are clicked to add the item to the order or increase its count
	public void itemOrdered(MenuItem item, OrderingInterface view) 
	{
		//if the item isn't in the order list then adds the item to the list
		if (this.currentOrder.findItem(item) == -1) 
		{
			currentOrder.getOrderList().add(item);
			
			//gets the currentOrder's list and gets the equivalent item from the list and increases its count by 1
			int itemIndex = currentOrder.findItem(item);
			currentOrder.getOrderList().get(itemIndex).increaseCount();
			view.createOrderView(currentOrder.getOrderList().get(itemIndex), this);
		}
		
	}
	
	//method for creating a string record of the current order
	public String recordOrder(Order order) 
	{
		String record = "";
		
		//adds current date to the string
		LocalDate date = LocalDate.now();
		record += date;
		
		record += "[ ";
		
		//adds the total number of items to the string
		record +=  order.getTotalCount() + " total item(s): ";
		
		
		
		//cycles through the objects in the order and adds their count and ID to the order
		for (int index = 0; index < order.getOrderList().size(); index++) 
		{
			if (order.getOrderList().get(index) != null) 
			{
				//creates a string which the record shouldn't have multiple copies of and assigns it to stringCheck
				String stringCheck = order.getOrderList().get(index).getCount() + "x " + order.getOrderList().get(index).getItemName() + ", ";
				
				//only adds the count and ID if they are not already added
				if (record.contains(stringCheck) == false) 
				{
					record += order.getOrderList().get(index).getCount();
					record += "x ";
					record += order.getOrderList().get(index).getItemName();
					record += ", ";
				}
			}
		}
		record += "]";
		
		//adds the total price of the order to the string
		record += "$" + order.getTotalPrice();
		
		return record + "\n";
	}
	
	
	//prints the last orders information out for the user to see
	public void retreiveLastOrder() 
	{
		Scanner reader = null;
		try 
		{
			String lastOrder = null;
			File file = new File("DataSet.txt");
			reader = new Scanner(file);
			while (reader.hasNext()) 
			{
				lastOrder = reader.nextLine();
			}
			LocalDate date = LocalDate.now();
			
			String pastOrderString = "The last person ordered ";
		
			pastOrderString += lastOrder.substring(lastOrder.indexOf("[") + 1, lastOrder.indexOf("]") - 2) + " for the price of " + lastOrder.substring(lastOrder.indexOf("$"));
			
			JOptionPane.showMessageDialog(null, pastOrderString);
		}
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "File not found.");
		}
		
		finally
		{
			if (reader != null) 
			{
				reader.close();
			}
		}
		
	}
	
}
