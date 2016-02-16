package ie.gmit.softdev2.w8;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyJFrame extends JFrame{
	// place components
	//GameBoard gameBoard = new GameBoard();
	GameBoard2 gameBoard = new GameBoard2();
	public MyJFrame(){
		super();
		initUI();
		placeComonents();
		bindListeners();
	}

	private void initUI() {
		this.setSize(400,400);
		this.setTitle("game 1");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	private void placeComonents() {
		this.getContentPane().add(gameBoard);
		
	}

	private void bindListeners() {
		// TODO Auto-generated method stub
		
	}
	
	

}
