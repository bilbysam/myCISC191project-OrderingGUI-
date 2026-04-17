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

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * OrderingInterface is-a JFrame and acts as the View of the GUI
 */
public class OrderingInterface extends JFrame
{

	public OrderingInterface() 
	{
		//sets the frame size
		this.setSize(600, 600);
		
		//sets the layout to organize the panels to sides
		this.setLayout(new BorderLayout());
		
		//creates panels for the item menu and the list of items currently being ordered
		JPanel itemMenuPanel = new JPanel();
		JPanel orderPanel = new JPanel();
		//
		itemMenuPanel.setLayout(new GridLayout(6, 4, 10, 10));
		orderPanel.setLayout(new GridLayout(3, 1));
		
		
		//adds the panels to their designated sides
		this.add(itemMenuPanel, BorderLayout.WEST);
		this.add(orderPanel, BorderLayout.EAST);
		
		
		//test adding buttons to the right Panel
		itemMenuPanel.add(new JButton("button1"));
		itemMenuPanel.add(new JButton("button2"));
		itemMenuPanel.add(new JButton("button3"));
		itemMenuPanel.add(new JButton("button4"));
		itemMenuPanel.add(new JButton("button5"));
		itemMenuPanel.add(new JButton("button6"));
		itemMenuPanel.add(new JButton("button7"));
		itemMenuPanel.add(new JButton("button8"));
		
		//sets up the list of items being ordered, the extra notes, and the button to submit the order
		//may want to change the spot initializing the Label and buttons and have them be created during the ordering process or have them be text areas instead
		//test for a panel in a panel
		JPanel testPanel = new JPanel();
		testPanel.setLayout(new GridLayout(1, 3));
		orderPanel.add(testPanel);
		testPanel.add(new JLabel("FootItem"));
		testPanel.add(new JButton("+"));
		testPanel.add(new JButton("-"));
		
		JPanel testPanel2 = new JPanel();
		testPanel2.setLayout(new GridLayout(1, 3));
		orderPanel.add(testPanel2);
		testPanel2.add(new JLabel("FootItem"));
		testPanel2.add(new JButton("+"));
		testPanel2.add(new JButton("-"));
		
		//lets the GUI be seen and closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		
	}
	
	//main method to run the GUI
	public static void main(String[] args) 
	{
		//Should have the model in it?
		new OrderingInterface();
	}
	
}
