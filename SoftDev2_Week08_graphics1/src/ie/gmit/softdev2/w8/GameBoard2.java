package ie.gmit.softdev2.w8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class GameBoard2 extends JPanel {
	// ball variable;
	int ballX = 50;
	int ballY = 50;
	int ballVx = 2;
	int ballVy = 2;
	int ballWidth = 50;
	int ballHeight = 50;
	
	public GameBoard2(){
		super();
		this.setBackground(Color.BLACK);
		bindListeners();
	}
	private void bindListeners() {
		this.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent arg0) {
				onMouseMoved(arg0);
			}
			@Override
			public void mouseMoved(MouseEvent arg0) {
				onMouseMoved(arg0);
			}
		});
		
	}
	private void onMouseMoved(MouseEvent me){
		//System.out.println("mousemoved "+me.getX()+","+me.getY());
		int targetBallX= me.getX() - ballWidth/2;
		int targetBallY = me.getY() - ballHeight/2;
		
		if (ballX < targetBallX){
			ballX+=ballVx;
		}
		else {
			ballX-=ballVx;
		}
		if (ballY < targetBallY){
			ballY+=ballVy;
		}
		else {
			ballY-=ballVy;
		}
		this.repaint();
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g; 
		g2.setColor(Color.RED);
	
		g2.fillOval(ballX, ballY, ballWidth, ballHeight);
	}

}
