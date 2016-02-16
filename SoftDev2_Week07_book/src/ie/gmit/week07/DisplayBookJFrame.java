package ie.gmit.week07;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisplayBookJFrame extends JFrame{
	// declare components here
	JTextField titleTextField = new JTextField(20);
	JButton enterButton = new JButton("submit");
	
	public DisplayBookJFrame(){
		initUI();
		placeComponents();
		bindListeners();
	}

	private void initUI() {
		this.setTitle("book");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void placeComponents() {
		Container mainPane = this.getContentPane();
		mainPane.setLayout(new BoxLayout(mainPane,BoxLayout.Y_AXIS));
		JPanel titlePanel = new JPanel(new FlowLayout());
		titlePanel.add(titleTextField);
		mainPane.add(titlePanel);
		mainPane.add(this.enterButton);
		
	}

	private void bindListeners() {
		enterButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				onEnterClicked(arg0);
				
			}
			
		});
		
	}
	private void onEnterClicked(ActionEvent ae){
		String title = this.titleTextField.getText();
		System.out.println("button clicked: "+ title );
	}

}
