package ie.gmit.week10_balls;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class GameBoard extends JPanel{
	int numBalls = 10;
	List<Actor> actors = new ArrayList<Actor>();
	Player player;
	
	int keyCodeUp= 38;
	int keyCodeDown= 40;
	int keyCodeLeft= 37;
	int keyCodeRight= 39;
	
	
	public GameBoard(){
		super();
		this.setBackground(Color.BLACK);
		for (int i = 0; i<numBalls; i++){
			actors.add(new Ball(this));
		}
		player = new Player();
		actors.add(player);
		
		
		GameRunner gameRunner = new GameRunner(this);
		Thread thread = new Thread(gameRunner);
		thread.start();
		
		
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for (Actor actor : actors){
			actor.paint(g2d);
		}
	}
	public void moveAll(){
		for (Actor actor : actors){
			actor.move(this);
		}
		this.repaint();
	}
	public void onKeyPressed(KeyEvent key){
		System.out.println(key.getKeyCode());
		if (key.getKeyCode() == keyCodeUp){
			player.moveUp(true);
		}
		if (key.getKeyCode() == keyCodeDown){
			player.moveDown(true);
		}
		if (key.getKeyCode() == keyCodeLeft){
			player.moveLeft(true);
		}
		if (key.getKeyCode() == keyCodeRight){
			player.moveRight(true);
		}
		
	}
	public void onKeyReleased(KeyEvent key){
		if (key.getKeyCode() == keyCodeUp){
			player.moveUp(false);
		}
		if (key.getKeyCode() == keyCodeDown){
			player.moveDown(false);
		}
		if (key.getKeyCode() == keyCodeLeft){
			player.moveLeft(false);
		}
		if (key.getKeyCode() == keyCodeRight){
			player.moveRight(false);
		}
	}

}
