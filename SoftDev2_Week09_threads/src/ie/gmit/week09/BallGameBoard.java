package ie.gmit.week09;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class BallGameBoard extends JPanel{
	int ballX = 50;
	int ballY = 50;
	int ballVX = 2;
	int ballVY = 2;
	int ballWidth = 50;
	int ballHeight = 50;
	
	public BallGameBoard(){
		super();
		System.out .println("gameboard thread id "+Thread. currentThread().getId());
		this.setBackground(Color.BLACK);
		ScreenPause screenPauseRunnable = new ScreenPause(this);
		Thread thread = new Thread(screenPauseRunnable);
		thread.start();
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		System.out .println("UI thread id "+Thread. currentThread().getId());
		Graphics2D g2 = (Graphics2D) g; 
		g2.setColor(Color.RED);
	
		g2.fillOval(ballX, ballY, ballWidth, ballHeight);
		
	}
	public void moveBall(){
		System.out .println("moveBall thread "+Thread. currentThread().getId());
		
		ballX += ballVX;
		ballY += ballVY;
		
		//System.out.println(this.getWidth());
		
		if (ballX > this.getWidth()){
			ballVX = -ballVX;
		}
		if (ballX < 0){
			ballVX = -ballVX;
		}
		if (ballY > this.getHeight()){
			ballVY = -ballVY;
		}
		if (ballY < 0){
			ballVY = -ballVY;
		}
	
	}
	
	

}
