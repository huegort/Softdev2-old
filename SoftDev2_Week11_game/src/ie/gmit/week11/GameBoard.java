package ie.gmit.week11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JPanel;

public class GameBoard extends JPanel {
	private static final double newBallEvery = 2000;
	private static final double initialBalls = 2;
	static final double MAXBALLSPEED = 2;
	static final int SHIPSPEED = 2;
	int initialGameWidth;
	int initialGameHeight;
	double timeLastBallAdded;
	boolean gameOver = false;
	Set<Actor> actors ;
	Ship ship;
	
	Thread thread;
	
	public GameBoard(int initialGameWidth, int initialGameHeight){
		super();
		this.initialGameWidth = initialGameWidth;
		this.initialGameHeight = initialGameHeight;
		this.setBackground(Color.black);
		
		startGame();
		
	}
	
	public void startGame(){
		gameOver=false;
		actors = new HashSet<Actor>() ;
		for(int i = 0; i< initialBalls; i++){
			actors.add( new Ball(this));
		}
		ship = new Ship(this);
		actors.add(ship);
		thread = new Thread(new GameRunner(this));
		thread.start();
		timeLastBallAdded = System.currentTimeMillis();
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		for(Actor actor : actors){
			actor.draw(g2d);
		}
	}
	public void moveAll(){
		double elapsedTime = System.currentTimeMillis()- timeLastBallAdded;
		if (elapsedTime > newBallEvery){
			timeLastBallAdded = System.currentTimeMillis();
			actors.add(new Ball(this));
		}
		
		//use iterator it will allow us to remove an entity while going through 
		// its collection
		Iterator<Actor> itr = actors.iterator();
		while (itr.hasNext()){
			Actor actor = itr.next();
			// if move returns false then remove the actor
			if (!actor.move(actors)){
				//System.out.println("remove called!");
				itr.remove();
			};
		}
		
		this.repaint();
		
	}
	public void shipUp(boolean yes){
		ship.moveUp(yes);
		
	}
	public void shipDown(boolean yes){
		ship.moveDown(yes);
	}
	public void shipLeft(boolean yes){
		ship.moveLeft(yes);
	}
	public void shipRight(boolean yes){
		ship.moveRight(yes);
	}
	public void gameOver(){
		gameOver=true;
		System.out.println("game over");
		thread.interrupt();
	}
	

}
