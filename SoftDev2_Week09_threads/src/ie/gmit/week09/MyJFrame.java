package ie.gmit.week09;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MyJFrame extends JFrame{
	BallGameBoard ballGameBoard = new BallGameBoard();
	public MyJFrame(){
		super();
		System.out .println("jframe thread id "+Thread. currentThread().getId());
		initUI();
		placeComponents();
		bindListeners();
	}

	private void initUI() {
		this.setTitle("week 09");
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	private void placeComponents() {
		this.getContentPane().add(ballGameBoard);
		
	}

	private void bindListeners() {
		ballGameBoard.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				onMouseClicked(arg0);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}
	private void onMouseClicked(MouseEvent me){
		System.out .println("mouse listener thread id "+Thread. currentThread().getId());
	}

}
