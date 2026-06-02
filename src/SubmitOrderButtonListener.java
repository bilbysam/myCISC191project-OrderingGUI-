import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

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

//SubmitOrderButtonListener is-a ActionListener
public class SubmitOrderButtonListener implements ActionListener
{

	//A SubmitOrderButtonListener has-a model for methods
	private OrderingModel model;
		
	//A SubmitOrderButtonListener has-a view where the button is located
	private OrderingInterface view;
		
		
	//constructor which initializes the relevant objects
	public SubmitOrderButtonListener(OrderingModel orderingModel, OrderingInterface orderingInterface) 
	{
		this.model = orderingModel;
		this.view = orderingInterface;
	}
	
	//erases the order panels contents including the add on buttons, the labels, and the textField notes
	//also clears the order list and adds an empty one that will take new objects
	//also submits a string record of the removed order
	@Override
	public void actionPerformed(ActionEvent e)
	{
		PrintWriter writer = null;
		
		try
		{
			//uses the models recordOrder method and creates a PrintWriter to record the current order to the DataBase file
			Order currentOrder = model.getOrder();
			
			//sets the PrintWriter up to append strings to the DataSet.txt file
			writer = new PrintWriter(new FileWriter(new File("DataSet.txt"), true), true);
			writer.println(model.recordOrder(currentOrder));
			
			//creates a file with the submitted order information to be a receipt
			Receipt receipt = new Receipt(currentOrder, view);
			receipt.createReceiptFile(receipt.createRecieptArray(currentOrder));
			
			//replaces the order with an empty order
			model.removeOrder();
			view.removeComponents();
			
			JOptionPane.showMessageDialog(null, "Thank you for your order. Please check your receipt in the receipt file.");
			
		}
		catch (IOException exception)
		{
			view.fileError();
		}
		finally 
		{
			if (writer != null) 
			{
				writer.close();
			}
		}
	}

	
}
