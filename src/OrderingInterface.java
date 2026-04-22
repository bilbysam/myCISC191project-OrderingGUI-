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
* https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html
* ^GridBagLayout
* https://stackoverflow.com/questions/24848606/how-to-make-gridlayout-to-respect-columns-setting
* ^control amount of columns by setting rows to 0
*
* Version: 2026-04-01
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/**
 * OrderingInterface is-a JFrame and acts as the View of the GUI
 */

//try setting up flowLayouts in flow layouts and make sure that dimensions are attached to a variable that can change if the screen is adjusted?
//to get correct button visuals maybe overlap an invisible button on a panel?

public class OrderingInterface extends JFrame
{

	public OrderingInterface() 
	{
		
		
		//sets the layout to organize the panels to sides	
		this.setLayout(new GridBagLayout());
		GridBagConstraints baseConstraints = new GridBagConstraints();
		
		//creates the panel for items buttons to be put in
		JPanel itemMenuPanel = new JPanel();
		
		
//		//sets size of the panel to bigger than the screen?????????????
//		itemMenuPanel.setSize(new Dimension(700, 1000));
		
		JScrollPane itemMenuScrollPane  = new JScrollPane(itemMenuPanel);
		//trying to set up a scrollbar but should be in its own panel?
//		JScrollBar scrollBar = new JScrollBar();
//		scrollBar.setBounds(50, 300, 10, 10);
//		itemMenuPanel.add(scrollBar);
		
		
		itemMenuPanel.setBackground(Color.green);
		//controls row and column order in regard to other components
		baseConstraints.gridx = 0;
		baseConstraints.gridy = 0;
		//fills or extends space of component
		baseConstraints.weightx = 0.1;
		baseConstraints.weighty = 0.1;
		baseConstraints.fill = GridBagConstraints.BOTH;
		this.add(itemMenuScrollPane, baseConstraints);
		
		//sets a gridlayout for button prioritizing filling columns to the required amount rather than rows
		itemMenuPanel.setLayout(new GridLayout(0, 4, 30, 30));
		
		
		
		
		
		
		//creates panel list of items currently being ordered
		JPanel orderPanel = new JPanel();
		
		//color for helping visualize space taken up
		orderPanel.setBackground(Color.blue);
		
		//sets this as the next panel after the one at the last gridx 
		baseConstraints.gridx = 1;
		baseConstraints.gridy = 0;
		baseConstraints.gridheight = 10;
		baseConstraints.gridwidth = 10;
		
		//look up exactly what weight does
		//controls the size of the panel space in the base GridBagLayout
		baseConstraints.weightx = 0.05;
		baseConstraints.weighty = 0.1;
		baseConstraints.fill = GridBagConstraints.BOTH;
		this.add(orderPanel, baseConstraints);
		
		orderPanel.setLayout(new GridLayout(3, 0));
		
		
		//test adding buttons to the right Panel
		for (int buttonCount = 0; buttonCount < 20; buttonCount++) 
		{
			JButton button = new JButton("footNameOrImage");
			button.setPreferredSize(new Dimension(20,20));
			itemMenuPanel.add(button);
		}
//		
		
		//sets the frame size
		this.setSize(1050, 750);
		
		//lets the GUI be seen and closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
//		pack();
	}
	
	//main method to run the GUI
	public static void main(String[] args) 
	{
		//Should have the model in it?
		new OrderingInterface();
	}
	
}
