package ie.gmit.week11;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import java.util.Set;

public class Ball extends java.awt.geom.Ellipse2D.Double implements Actor{
	private static long ballCount =0;
	
	private long id;
	
	private static final Color[] colors = {Color.blue,
			Color.cyan,
			Color.DARK_GRAY,
			Color.GRAY,
			Color.green,
			Color.MAGENTA,
			Color.ORANGE,
			Color.PINK,
			Color.RED
	};
	
	GameBoard gameBoard;
	double size;
	double vx, absVx;
	double vy, absVy;
	Color color ;
	
	public Ball(GameBoard gameBoard){
		super();
		// id is equal to the number of balls created so will be unique
		this.id = ballCount++;
		System.out.println("new ball with id "+this.id);
		this.gameBoard = gameBoard;
		
		Random randomGenerator = new Random();
		this.size = 30 + randomGenerator.nextDouble()*70;
		this.width = this.size;
		this.height = this.size;
		
		this.x = randomGenerator.nextDouble()* (gameBoard.initialGameWidth-this.size);
		this.y = randomGenerator.nextDouble()* (gameBoard.initialGameHeight-this.size);
		
		if (randomGenerator.nextInt(2) ==0){
			this.x = randomGenerator.nextInt(2)* (gameBoard.initialGameWidth+this.size)-this.size;
			this.y = randomGenerator.nextDouble()* (gameBoard.initialGameHeight-this.size);
			
		}else{
			this.x = randomGenerator.nextDouble()* (gameBoard.initialGameWidth-this.size);
			this.y =(0)-this.size;
			
		}
		
		
		absVx = gameBoard.MAXBALLSPEED * randomGenerator.nextDouble();
		vx = absVx * (-1 + (randomGenerator.nextInt(2)*2)); // absVx * either -1 or 1
		absVy = gameBoard.MAXBALLSPEED * randomGenerator.nextDouble();
		vy = absVy * (-1 + (randomGenerator.nextInt(2)*2)); // absVx * either -1 or 1
		
		color = colors[randomGenerator.nextInt(colors.length)];
		
	}
	@Override
	public boolean move(Set<Actor> allActors) {
		this.x += vx;
		this.y += vy;
		
		if (x< 0 ){vx = absVx;}
		if (x > gameBoard.getWidth()-size ){vx = -absVx;}
		if (y< 0 ){vy = absVy;}
		if (y > gameBoard.getHeight()-size ){
			vy = -absVy;
			//System.out.println("remove?"+this.hashCode());
			// if this hits the bottom remove it
			return false;
			}
		return true;
		
		
	}
	@Override
	public void draw(Graphics2D g) {
		g.setColor(this.color);
		g.fill(this);
		
	}
	@Override
	public int hashCode() {
		// I simplified the hashcode to remove bug
		int result ;
		result = (int) (id ^ (id >>> 32));
		return result;
	}
	// automatically generated using source->generate.....
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ball other = (Ball) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

	
}
