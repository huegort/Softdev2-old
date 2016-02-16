 package ie.gmit.its;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame extends JFrame{
	JButton firstButton, button2, button3, button4, button5;
	public MyJFrame(){
		super();
		initUI();
		placeComponents();
		bindListeners();
	}

	public void initUI(){
		this.setSize(400, 300);
		this.setTitle("its 2 first Jframe");
		this.setLocationRelativeTo(null);
	}
	public void placeComponents(){
		Container mainPane = this.getContentPane();
		//mainPane.setLayout(new FlowLayout());
		//mainPane.setLayout(new GridLayout(2,3));
		mainPane.setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel(new FlowLayout());
		firstButton = new JButton("click here");
		button2 = new JButton("button 2");
		button3 = new JButton("button 3");
		button4 = new JButton("4");
		button5 = new JButton("button 5");
		northPanel.add(firstButton);
		northPanel.add(button2);
		northPanel.add(button3);
		northPanel.add(button4);
		
		mainPane.add(northPanel,BorderLayout.NORTH);
		mainPane.add(button5,BorderLayout.CENTER);
		
	}
	public void bindListeners(){
		
	}
	// methods that deal with events
}
