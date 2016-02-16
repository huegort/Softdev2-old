package ie.gmit.week10_balls;

import java.awt.Color;
import java.awt.Graphics2D;

public class Player implements Actor{
	int x=300;
	int y=300;
	int vel= 2;
	int width=30;
	int height=20;
	
	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	
	
	
	
	@Override
	public void paint(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
		
	}

	@Override
	public void move(GameBoard gameBoard) {
		if (up){
			y -= vel;
		}
		if (down){
			y += vel;
			
		}
		if (left){
			x -= vel;
			
		}
		if (right){
			x += vel;
			
		}	
	}
	public void moveUp(boolean yes){
		up=yes;
	}
	public void moveDown(boolean yes){
		down=yes;
	}
	public void moveLeft(boolean yes){
		left=yes;
	}
	public void moveRight(boolean yes){
		right=yes;
	}

}
