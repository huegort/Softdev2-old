package ie.gmit.week10_balls;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class MyJFrame extends JFrame{
	GameBoard gameBoard = new GameBoard();
	
	public MyJFrame(){
		super();
		initUI();
		placeComponents();
		bindListener();
	}

	private void initUI() {
		this.setTitle("balls");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
	}

	private void placeComponents() {
		this.getContentPane().add(gameBoard);
		
	}

	private void bindListener() {
		this.addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent arg0) {
				gameBoard.onKeyPressed(arg0);
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				gameBoard.onKeyReleased(arg0);
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}
	

}
