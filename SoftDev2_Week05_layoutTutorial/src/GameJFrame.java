import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameJFrame extends JFrame{
	// components here
	Canvas gameCanvas;
	JButton stopButton,settingsButton, musicButton, soundsButton;
	public GameJFrame(){
		super();
		initUI();
		placeComponents();
		bindListeners();
	}

	private void initUI() {
		this.setTitle("game");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	private void placeComponents() {
		Container mainPane = this.getContentPane();
		
		mainPane.setLayout(new BorderLayout());
		gameCanvas = new Canvas();
		mainPane.add(gameCanvas, BorderLayout.CENTER);
		gameCanvas.setBackground(Color.BLACK);
		
		JPanel eastPanel = new JPanel(new GridLayout(4,1));
		
		stopButton = new JButton("stop");
		stopButton.setMargin(new Insets(0, 0, 0, 0));
		JPanel stopPanel = new JPanel(new FlowLayout());
		
		stopPanel.add(stopButton);
		
		eastPanel.add(stopPanel);
		
		settingsButton = new JButton("settings");
		eastPanel.add(settingsButton);
		
		musicButton = new JButton("music");
		eastPanel.add(musicButton);
		
		soundsButton = new JButton("sounds");
		eastPanel.add(soundsButton);
		
		mainPane.add(eastPanel, BorderLayout.EAST);
		
		
	}

	private void bindListeners() {
		// TODO Auto-generated method stub
		
	}
	// event methods here
	

}
