package ie.gmit.week11;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

import java.util.Set;

@SuppressWarnings("serial")
public class Ship  extends Polygon implements Actor {
	int vx=0;
	int vy=0;
	GameBoard gameBoard;
	
	static final int[] initxPoints = {-15,15,15,-15};
	static final int[] inityPoints = {-15,-15,15,15};
	
	public Ship(GameBoard gameBoard){
		super(initxPoints,inityPoints, inityPoints.length);
		this.translate(gameBoard.initialGameWidth/2, gameBoard.initialGameHeight/2);
		this.gameBoard = gameBoard;
	}
	
	@Override
	public boolean move(Set<Actor> allActors) {
		
		this.translate(vx, vy);
		
		for (Actor actor : allActors){
			if (actor != this){
				for (int i = 0 ; i< inityPoints.length ;i++){
					if (actor.contains((double)xpoints[i],(double)ypoints[i])){
						gameBoard.gameOver();
						// remove ship if gameover
						return false;
					}
				}
			}
		}
		return true;
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.white);
		g.fillPolygon(this);
		
	}
	public void moveUp(boolean yes){
		if (yes) {
			vy = - GameBoard.SHIPSPEED;
		}else{
			vy=0;
		}
	}
	public void moveDown(boolean yes){
		if (yes) {
			vy =  GameBoard.SHIPSPEED;
		}else{
			vy=0;
		}
	}
	public void moveLeft(boolean yes){
		if (yes) {
			vx =  -GameBoard.SHIPSPEED;
		}else{
			vx=0;
		}
	}
	public void moveRight(boolean yes){
		if (yes) {
			vx =  +GameBoard.SHIPSPEED;
		}else{
			vx=0;
		}
	}

	
}
